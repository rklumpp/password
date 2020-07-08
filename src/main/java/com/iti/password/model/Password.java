package com.iti.password.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @implNote Password - the Password itself when instantiated run the determined rules
 * @author raul klumpp - raulklumpp@gmail.com
 */
public class Password {

    @JsonIgnore
    private String value;
    private Boolean isValid;

    private Password(PasswordBuilder builder) {
        this.value = builder.value;
        this.isValid = builder.isValid;

    }

    public Boolean isValid() {
        return this.isValid;
    }

    /**
     * Builder for Password
     */
    public static class PasswordBuilder {
        private String value;
        private Boolean isValid;

        public PasswordBuilder setValue(String value) {
            this.value = value;
            return this;
        }

        private PasswordBuilder isValid() {
            this.isValid = this.value.length() >= 9
                                && this.hasDigit()
                                && this.hasUppercase()
                                && this.hasDowncase()
                                && this.hasSpecialChars()
                                && this.hasRepeatedChars()
                                && this.hasNoSpaces();
            return this;
        }

        /**
         * @implNote When Password is built validations are checked
         * @return Password
         */
        public Password build() {
            this.isValid();
            return new Password(this);
        }

        /**
         * Checks for a digit at Password value
         * @return Boolean
         */
        private Boolean hasDigit() {
            Pattern pattern = Pattern.compile("([0-9])+");
            return pattern.matcher(this.value).find();
        }

        /**
         * Checks for a Uppercase letter at Password value
         * @return Boolean
         */
        private Boolean hasUppercase() {
            Pattern pattern = Pattern.compile("([A-Z])+");
            return pattern.matcher(this.value).find();
        }

        /**
         * Checks for a Downcase letter at Password value
         * @return Boolean
         */
        private Boolean hasDowncase() {
            Pattern pattern = Pattern.compile("([a-z])+");
            return pattern.matcher(this.value).find();
        }

        /**
         * Checks for a Special character at Password value
         * @return Boolean
         */
        private Boolean hasSpecialChars() {
            Pattern pattern = Pattern.compile("[!@#$%^&*(),.?\":{}|<>~;]");
            return pattern.matcher(this.value).find();
        }

        /**
         * Checks for character repetition at Password value
         * @return Boolean
         */
        private Boolean hasRepeatedChars() {
            String[] arr = this.value.split("");
            Map<String, Long> map = Arrays.asList(arr).stream()
                    .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

            long count = map.entrySet().stream()
                    .filter(e -> e.getValue() > 1)
                    .count();

            return count == 0;
        }

        /**
         * Checks for spaces at Password value
         * @return Boolean
         */
        private Boolean hasNoSpaces() {
            Pattern pattern = Pattern.compile("[\\s]");
            return !pattern.matcher(this.value).find();
        }

    }

}
