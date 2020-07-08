package com.iti.password.service;

import com.iti.password.model.Password;
import com.iti.password.utils.PasswordUtils;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PasswordServiceIntegrationTest {

    @Autowired
    private PasswordService service;

    @Test
    public void testApplyPassword_whenValid_thenReturnValidPassword() {
        Password password = service.apply(PasswordUtils.VALID_PASSWORD);
        assertThat(password).isNotNull();
        assertThat(password.isValid()).isEqualTo(Boolean.TRUE);
    }

    @Test
    public void testApplyPassword_whenInvalid01_thenReturnInvalidPassword() {
        Password password = service.apply(PasswordUtils.INVALID_PASSWORD_1);
        assertThat(password).isNotNull();
        assertThat(password.isValid()).isEqualTo(Boolean.FALSE);
    }

    @Test
    public void testApplyPassword_whenInvalid02_thenReturnInvalidPassword() {
        Password password = service.apply(PasswordUtils.INVALID_PASSWORD_2);
        assertThat(password).isNotNull();
        assertThat(password.isValid()).isEqualTo(Boolean.FALSE);
    }

    @Test
    public void testApplyPassword_whenInvalid03_thenReturnInvalidPassword() {
        Password password = service.apply(PasswordUtils.INVALID_PASSWORD_3);
        assertThat(password).isNotNull();
        assertThat(password.isValid()).isEqualTo(Boolean.FALSE);
    }

    @Test
    public void testApplyPassword_whenInvalid04_thenReturnInvalidPassword() {
        Password password = service.apply(PasswordUtils.INVALID_PASSWORD_4);
        assertThat(password).isNotNull();
        assertThat(password.isValid()).isEqualTo(Boolean.FALSE);
    }

    @Test
    public void testApplyPassword_whenInvalid05_thenReturnInvalidPassword() {
        Password password = service.apply(PasswordUtils.INVALID_PASSWORD_5);
        assertThat(password).isNotNull();
        assertThat(password.isValid()).isEqualTo(Boolean.FALSE);
    }

    @Test
    public void testApplyPassword_whenInvalid06_thenReturnInvalidPassword() {
        Password password = service.apply(PasswordUtils.INVALID_PASSWORD_6);
        assertThat(password).isNotNull();
        assertThat(password.isValid()).isEqualTo(Boolean.FALSE);
    }

    @Test
    public void testApplyPassword_whenInvalid07_thenReturnInvalidPassword() {
        Password password = service.apply(PasswordUtils.INVALID_PASSWORD_7);
        assertThat(password).isNotNull();
        assertThat(password.isValid()).isEqualTo(Boolean.FALSE);
    }

    @Test
    public void testApplyPassword_whenInvalid08_thenReturnInvalidPassword() {
        Password password = service.apply(PasswordUtils.INVALID_PASSWORD_8);
        assertThat(password).isNotNull();
        assertThat(password.isValid()).isEqualTo(Boolean.FALSE);
    }

}
