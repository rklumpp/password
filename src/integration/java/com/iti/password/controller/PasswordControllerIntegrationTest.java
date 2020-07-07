package com.iti.password.controller;

import com.iti.password.utils.PasswordUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PasswordControllerIntegrationTest {

    private MockMvc mockMvc;

    @Autowired
    private PasswordController controller;

    @BeforeEach
    public void setup() {
        this.mockMvc = MockMvcBuilders
                .standaloneSetup(this.controller)
                .build();
    }

    @Test
    public void postController_whenValidPassword_thenReturnSuccessValidPassword() throws Exception {
        mockMvc.perform(
                post(PasswordController.BASE_URL)
                        .contentType(MediaType.TEXT_PLAIN_VALUE)
                        .content(PasswordUtils.VALID_PASSWORD))
                .andExpect(status().isAccepted())
                .andExpect(jsonPath("$.valid").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.valid").value(Boolean.TRUE));
    }

    @Test
    public void postController_whenInvalidPassword01_thenReturnInvalidPassword() throws Exception {
        mockMvc.perform(
                post(PasswordController.BASE_URL)
                        .contentType(MediaType.TEXT_PLAIN_VALUE)
                        .content(PasswordUtils.INVALID_PASSWORD_1))
                .andExpect(status().isBadRequest());
    }

    @Test
    public void postController_whenInvalidPassword02_thenReturnInvalidPassword() throws Exception {
        mockMvc.perform(
                post(PasswordController.BASE_URL)
                        .contentType(MediaType.TEXT_PLAIN_VALUE)
                        .content(PasswordUtils.INVALID_PASSWORD_2))
                .andExpect(status().isAccepted())
                .andExpect(jsonPath("$.valid").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.valid").value(Boolean.FALSE));
    }

    @Test
    public void postController_whenInvalidPassword03_thenReturnInvalidPassword() throws Exception {
        mockMvc.perform(
                post(PasswordController.BASE_URL)
                        .contentType(MediaType.TEXT_PLAIN_VALUE)
                        .content(PasswordUtils.INVALID_PASSWORD_3))
                .andExpect(status().isAccepted())
                .andExpect(jsonPath("$.valid").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.valid").value(Boolean.FALSE));
    }

    @Test
    public void postController_whenInvalidPassword04_thenReturnInvalidPassword() throws Exception {
        mockMvc.perform(
                post(PasswordController.BASE_URL)
                        .contentType(MediaType.TEXT_PLAIN_VALUE)
                        .content(PasswordUtils.INVALID_PASSWORD_4))
                .andExpect(status().isAccepted())
                .andExpect(jsonPath("$.valid").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.valid").value(Boolean.FALSE));
    }

    @Test
    public void postController_whenInvalidPassword05_thenReturnInvalidPassword() throws Exception {
        mockMvc.perform(
                post(PasswordController.BASE_URL)
                        .contentType(MediaType.TEXT_PLAIN_VALUE)
                        .content(PasswordUtils.INVALID_PASSWORD_5))
                .andExpect(status().isAccepted())
                .andExpect(jsonPath("$.valid").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.valid").value(Boolean.FALSE));
    }

    @Test
    public void postController_whenInvalidPassword06_thenReturnInvalidPassword() throws Exception {
        mockMvc.perform(
                post(PasswordController.BASE_URL)
                        .contentType(MediaType.TEXT_PLAIN_VALUE)
                        .content(PasswordUtils.INVALID_PASSWORD_6))
                .andExpect(status().isAccepted())
                .andExpect(jsonPath("$.valid").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.valid").value(Boolean.FALSE));
    }

    @Test
    public void postController_whenInvalidPassword07_thenReturnInvalidPassword() throws Exception {
        mockMvc.perform(
                post(PasswordController.BASE_URL)
                        .contentType(MediaType.TEXT_PLAIN_VALUE)
                        .content(PasswordUtils.INVALID_PASSWORD_7))
                .andExpect(status().isAccepted())
                .andExpect(jsonPath("$.valid").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.valid").value(Boolean.FALSE));
    }

    @Test
    public void postController_whenInvalidPassword08_thenReturnInvalidPassword() throws Exception {
        mockMvc.perform(
                post(PasswordController.BASE_URL)
                        .contentType(MediaType.TEXT_PLAIN_VALUE)
                        .content(PasswordUtils.INVALID_PASSWORD_8))
                .andExpect(status().isAccepted())
                .andExpect(jsonPath("$.valid").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.valid").value(Boolean.FALSE));
    }

}
