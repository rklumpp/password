package com.iti.password.controller;

import com.iti.password.model.Password;
import com.iti.password.service.PasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author raul.klumpp
 * @apiNote The Password API RESTful endpoint
 */
@RestController
@RequestMapping(PasswordController.BASE_URL)
public class PasswordController {

    public static final String BASE_URL = "/password";

    private PasswordService service;

    @Autowired
    PasswordController(PasswordService service) {
        this.service = service;
    }

    /**
     * Receive the Password using POST method
     * @param password - The Password
     * @return Boolean - TRUE or FALSE response based on password validations
     */
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.TEXT_PLAIN_VALUE)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Password post(@RequestBody String password) {
        return service.apply(password);
    }

}
