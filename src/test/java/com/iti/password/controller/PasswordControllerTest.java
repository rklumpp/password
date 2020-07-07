package com.iti.password.controller;

import com.iti.password.service.PasswordService;
import com.iti.password.utils.PasswordUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(MockitoJUnitRunner.class)
public class PasswordControllerTest {

    private MockMvc mockMvc;

    @Mock
    private PasswordService service;

    @InjectMocks
    private PasswordController controller;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders
                .standaloneSetup(this.controller)
                .build();
    }

    @Test
    public void postController_whenValidPassword_thenReturnSuccessValidPassword() throws Exception {
        given(service.apply(PasswordUtils.VALID_PASSWORD))
                .willReturn(PasswordUtils.createValidMockPassword());

        mockMvc.perform(
                post(PasswordController.BASE_URL)
                        .contentType(MediaType.TEXT_PLAIN_VALUE)
                        .content(PasswordUtils.VALID_PASSWORD))
                .andExpect(status().isAccepted())
                .andExpect(jsonPath("$.valid").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.valid").value(Boolean.TRUE));
    }

}
