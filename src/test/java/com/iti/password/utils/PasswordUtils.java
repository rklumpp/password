package com.iti.password.utils;

import com.iti.password.model.Password;

public class PasswordUtils {

    // Valid Sets
    public static final String VALID_PASSWORD = "AbTp9!fok";

    // Invalid Sets
    public static final String INVALID_PASSWORD_1 = "";
    public static final String INVALID_PASSWORD_2 = "aa";
    public static final String INVALID_PASSWORD_3 = "ab";
    public static final String INVALID_PASSWORD_4 = "AAAbbbCc";
    public static final String INVALID_PASSWORD_5 = "AbTp9!foo";
    public static final String INVALID_PASSWORD_6 = "AbTp9!foA";
    public static final String INVALID_PASSWORD_7 = "AbTp9 fok";
    public static final String INVALID_PASSWORD_8 = "AbTp9 fok!";

    public static Password createMockPassword(String password) {
        return new Password.PasswordBuilder()
                            .setValue(password)
                            .build();
    }

}
