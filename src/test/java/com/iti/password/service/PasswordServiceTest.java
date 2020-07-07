package com.iti.password.service;

import com.iti.password.model.Password;
import com.iti.password.utils.PasswordUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PasswordServiceTest {

    @Mock
    private PasswordService service;

    @BeforeEach
    void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testApplyPassword_whenValid_thenReturnValidPassword() {
        String stringPassword = PasswordUtils.VALID_PASSWORD;

        when(service.apply(stringPassword))
                .thenReturn(PasswordUtils.createMockPassword(stringPassword));

        Password password = service.apply(stringPassword);
        assertThat(password).isNotNull();
        assertThat(password.isValid()).isEqualTo(Boolean.TRUE);
    }

    @Test
    public void testApplyPassword_whenInvalid_thenReturnInvalidPassword01() {
        String stringPassword = PasswordUtils.INVALID_PASSWORD_1;

        when(service.apply(stringPassword))
                .thenReturn(PasswordUtils.createMockPassword(stringPassword));

        Password password = service.apply(stringPassword);
        assertThat(password).isNotNull();
        assertThat(password.isValid()).isEqualTo(Boolean.FALSE);
    }

    @Test
    public void testApplyPassword_whenInvalid_thenReturnInvalidPassword02() {
        String stringPassword = PasswordUtils.INVALID_PASSWORD_2;

        when(service.apply(stringPassword))
                .thenReturn(PasswordUtils.createMockPassword(stringPassword));

        Password password = service.apply(stringPassword);
        assertThat(password).isNotNull();
        assertThat(password.isValid()).isEqualTo(Boolean.FALSE);
    }

    @Test
    public void testApplyPassword_whenInvalid_thenReturnInvalidPassword03() {
        String stringPassword = PasswordUtils.INVALID_PASSWORD_3;

        when(service.apply(stringPassword))
                .thenReturn(PasswordUtils.createMockPassword(stringPassword));

        Password password = service.apply(stringPassword);
        assertThat(password).isNotNull();
        assertThat(password.isValid()).isEqualTo(Boolean.FALSE);
    }

    @Test
    public void testApplyPassword_whenInvalid_thenReturnInvalidPassword04() {
        String stringPassword = PasswordUtils.INVALID_PASSWORD_4;

        when(service.apply(stringPassword))
                .thenReturn(PasswordUtils.createMockPassword(stringPassword));

        Password password = service.apply(stringPassword);
        assertThat(password).isNotNull();
        assertThat(password.isValid()).isEqualTo(Boolean.FALSE);
    }

    @Test
    public void testApplyPassword_whenInvalid_thenReturnInvalidPassword05() {
        String stringPassword = PasswordUtils.INVALID_PASSWORD_5;

        when(service.apply(stringPassword))
                .thenReturn(PasswordUtils.createMockPassword(stringPassword));

        Password password = service.apply(stringPassword);
        assertThat(password).isNotNull();
        assertThat(password.isValid()).isEqualTo(Boolean.FALSE);
    }

    @Test
    public void testApplyPassword_whenInvalid_thenReturnInvalidPassword06() {
        String stringPassword = PasswordUtils.INVALID_PASSWORD_6;

        when(service.apply(stringPassword))
                .thenReturn(PasswordUtils.createMockPassword(stringPassword));

        Password password = service.apply(stringPassword);
        assertThat(password).isNotNull();
        assertThat(password.isValid()).isEqualTo(Boolean.FALSE);
    }

    @Test
    public void testApplyPassword_whenInvalid_thenReturnInvalidPassword07() {
        String stringPassword = PasswordUtils.INVALID_PASSWORD_7;

        when(service.apply(stringPassword))
                .thenReturn(PasswordUtils.createMockPassword(stringPassword));

        Password password = service.apply(stringPassword);
        assertThat(password).isNotNull();
        assertThat(password.isValid()).isEqualTo(Boolean.FALSE);
    }

    @Test
    public void testApplyPassword_whenInvalid_thenReturnInvalidPassword08() {
        String stringPassword = PasswordUtils.INVALID_PASSWORD_8;

        when(service.apply(stringPassword))
                .thenReturn(PasswordUtils.createMockPassword(stringPassword));

        Password password = service.apply(stringPassword);
        assertThat(password).isNotNull();
        assertThat(password.isValid()).isEqualTo(Boolean.FALSE);
    }

}
