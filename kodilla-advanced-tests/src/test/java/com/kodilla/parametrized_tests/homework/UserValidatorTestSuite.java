package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {
    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"woj","awoj.-_","123456789","AWOJ"})
    public void shouldReturnTrueWhenAsNameAllowedCharacters(String userName) {
        assertTrue(userValidator.validateUsername(userName));
    }

    @ParameterizedTest
    @EmptySource
    public void shouldReturnFalseWhenNameIsEmpty(String userName) {
        System.out.println("|" + userName + "|");
        assertFalse(userValidator.validateUsername(userName));
    }

    @ParameterizedTest
    @ValueSource(strings = {"wo","?=","!§$%&/()"})
    public void shouldReturnFalseWhenAsNameNotAllowedCharacters(String userName) {
        assertFalse(userValidator.validateUsername(userName));
    }

    @ParameterizedTest
    @ValueSource(strings = {"a.woj@gmail.com","_-1235456879.sdfsdaggfdCJ@sgfdg.efas","ASDFGHJ.POIUZTR@87652.lkjhgf"})
    public void shouldReturnTrueWhenAsEmailAllowedCharacters(String email) {
        assertTrue(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @EmptySource
    public void shouldReturnFalseWhenEmailIsEmpty(String email) {
        System.out.println("|" + email + "|");
        assertFalse(userValidator.validateUsername(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"!§$%&/()&%.sasc@=)(/.§$%","!.?@:;.789","@"})
    public void shouldReturnFalseWhenAsEmailNotAllowedCharacters(String email) {
        assertFalse(userValidator.validateEmail(email));
    }
}