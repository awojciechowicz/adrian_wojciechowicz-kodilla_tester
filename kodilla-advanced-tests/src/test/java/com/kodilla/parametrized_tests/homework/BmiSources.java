package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class BmiSources {
    static Stream<Arguments> provideValuesForTestingBmiCalculator() {
        return Stream.of(
                Arguments.of(new Person(1.8,48.0),"Very severely underweight"),
                Arguments.of(new Person(1.8,49),"Severely underweight"),
                Arguments.of(new Person(1.8,55),"Underweight"),
                Arguments.of(new Person(1.8,77),"Normal (healthy weight)"),
                Arguments.of(new Person(1.8,94),"Overweight"),
                Arguments.of(new Person(1.8,110),"Obese Class I (Moderately obese)"),
                Arguments.of(new Person(1.8,126),"Obese Class II (Severely obese)"),
                Arguments.of(new Person(1.8,142),"Obese Class III (Very severely obese)"),
                Arguments.of(new Person(1.8,159),"Obese Class IV (Morbidly Obese)"),
                Arguments.of(new Person(1.8,191),"Obese Class V (Super Obese)"),
                Arguments.of(new Person(1.8,198),"Obese Class VI (Hyper Obese)")
        );
    }
}
