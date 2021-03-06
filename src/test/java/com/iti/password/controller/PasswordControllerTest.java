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
        String password = PasswordUtils.VALID_PASSWORD;
        given(service.apply(password))
                .willReturn(PasswordUtils.createMockPassword(password));

        mockMvc.perform(
                post(PasswordController.BASE_URL)
                        .contentType(MediaType.TEXT_PLAIN_VALUE)
                        .content(password))
                .andExpect(status().isAccepted())
                .andExpect(jsonPath("$.valid").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.valid").value(Boolean.TRUE));
    }

    @Test
    public void postController_whenInvalidPassword01_thenReturnInvalidPassword() throws Exception {
        String password = PasswordUtils.INVALID_PASSWORD_1;
        given(service.apply(password))
                .willReturn(PasswordUtils.createMockPassword(password));

        mockMvc.perform(
                post(PasswordController.BASE_URL)
                        .contentType(MediaType.TEXT_PLAIN_VALUE)
                        .content(password))
                .andExpect(status().isBadRequest());
    }

    @Test
    public void postController_whenInvalidPassword02_thenReturnInvalidPassword() throws Exception {
        String password = PasswordUtils.INVALID_PASSWORD_2;
        given(service.apply(password))
                .willReturn(PasswordUtils.createMockPassword(password));

        mockMvc.perform(
                post(PasswordController.BASE_URL)
                        .contentType(MediaType.TEXT_PLAIN_VALUE)
                        .content(password))
                .andExpect(status().isAccepted())
                .andExpect(jsonPath("$.valid").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.valid").value(Boolean.FALSE));
    }

    @Test
    public void postController_whenInvalidPassword03_thenReturnInvalidPassword() throws Exception {
        String password = PasswordUtils.INVALID_PASSWORD_3;
        given(service.apply(password))
                .willReturn(PasswordUtils.createMockPassword(password));

        mockMvc.perform(
                post(PasswordController.BASE_URL)
                        .contentType(MediaType.TEXT_PLAIN_VALUE)
                        .content(password))
                .andExpect(status().isAccepted())
                .andExpect(jsonPath("$.valid").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.valid").value(Boolean.FALSE));
    }

    @Test
    public void postController_whenInvalidPassword04_thenReturnInvalidPassword() throws Exception {
        String password = PasswordUtils.INVALID_PASSWORD_4;
        given(service.apply(password))
                .willReturn(PasswordUtils.createMockPassword(password));

        mockMvc.perform(
                post(PasswordController.BASE_URL)
                        .contentType(MediaType.TEXT_PLAIN_VALUE)
                        .content(password))
                .andExpect(status().isAccepted())
                .andExpect(jsonPath("$.valid").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.valid").value(Boolean.FALSE));
    }

    @Test
    public void postController_whenInvalidPassword05_thenReturnInvalidPassword() throws Exception {
        String password = PasswordUtils.INVALID_PASSWORD_5;
        given(service.apply(password))
                .willReturn(PasswordUtils.createMockPassword(password));

        mockMvc.perform(
                post(PasswordController.BASE_URL)
                        .contentType(MediaType.TEXT_PLAIN_VALUE)
                        .content(password))
                .andExpect(status().isAccepted())
                .andExpect(jsonPath("$.valid").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.valid").value(Boolean.FALSE));
    }

    @Test
    public void postController_whenInvalidPassword06_thenReturnInvalidPassword() throws Exception {
        String password = PasswordUtils.INVALID_PASSWORD_6;
        given(service.apply(password))
                .willReturn(PasswordUtils.createMockPassword(password));

        mockMvc.perform(
                post(PasswordController.BASE_URL)
                        .contentType(MediaType.TEXT_PLAIN_VALUE)
                        .content(password))
                .andExpect(status().isAccepted())
                .andExpect(jsonPath("$.valid").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.valid").value(Boolean.FALSE));
    }

    @Test
    public void postController_whenInvalidPassword07_thenReturnInvalidPassword() throws Exception {
        String password = PasswordUtils.INVALID_PASSWORD_7;
        given(service.apply(password))
                .willReturn(PasswordUtils.createMockPassword(password));

        mockMvc.perform(
                post(PasswordController.BASE_URL)
                        .contentType(MediaType.TEXT_PLAIN_VALUE)
                        .content(password))
                .andExpect(status().isAccepted())
                .andExpect(jsonPath("$.valid").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.valid").value(Boolean.FALSE));
    }

    @Test
    public void postController_whenInvalidPassword08_thenReturnInvalidPassword() throws Exception {
        String password = PasswordUtils.INVALID_PASSWORD_8;
        given(service.apply(password))
                .willReturn(PasswordUtils.createMockPassword(password));

        mockMvc.perform(
                post(PasswordController.BASE_URL)
                        .contentType(MediaType.TEXT_PLAIN_VALUE)
                        .content(password))
                .andExpect(status().isAccepted())
                .andExpect(jsonPath("$.valid").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.valid").value(Boolean.FALSE));
    }

}
