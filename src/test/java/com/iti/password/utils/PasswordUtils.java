package com.iti.password.utils;

import com.iti.password.model.Password;

public class PasswordUtils {

    public static final String VALID_PASSWORD = "AbTp9!fok";

    public static Password createValidMockPassword() {
        return new Password.PasswordBuilder()
                            .setValue(VALID_PASSWORD)
                            .build();
    }

}
