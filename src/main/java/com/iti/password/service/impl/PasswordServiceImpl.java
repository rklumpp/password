package com.iti.password.service.impl;

import com.iti.password.model.Password;
import com.iti.password.service.PasswordService;
import org.springframework.stereotype.Service;

@Service
public class PasswordServiceImpl implements PasswordService {

    @Override
    public Password apply(String value) {
        return new Password
                        .PasswordBuilder()
                        .setValue(value)
                        .build();
    }

}
