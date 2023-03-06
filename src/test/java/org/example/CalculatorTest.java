package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add_returns0_givenEmptyString() throws Exception {
        //arrange

        //act
        Calculator.add("0");

        //assert
    }
}