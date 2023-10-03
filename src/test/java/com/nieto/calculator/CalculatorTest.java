package com.nieto.calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {
    private Calculator calc;
    @BeforeEach
    public void setUp()
    {
        calc = new Calculator();
    }

    @AfterEach
    public void tearDown()
    {
        calc = null;
    }

    @Test
    void devrait_ajouter_deux_entiers()
    {
        // GIVEN
        int c = 3;
        int d = 4;

        // WHEN
        int resultat = calc.add(c,d);

        // THEN
        assertThat(resultat).isEqualTo(7);
    }

    @Test
    void devrait_diviser_deux_entiers()
    {
        // GIVEN
        int c = 8;
        int d = 0;

        // WHEN
        int resultat = calc.divide(c,d);

        // THEN
        assertThat(resultat).isEqualTo(0);
    }

    @ParameterizedTest
    @CsvSource({
            "3, 2, 5",
            "-2, -4, -6",
            "0, 2, 2",
            "0, 0, 0"
    })
    void param_test_addition(int opG, int opD, int result) {
        // GIVEN

        // WHEN
        int resultat = calc.add(opG, opD);

        // THEN
        assertThat(resultat).isEqualTo(result);
    }


    @ParameterizedTest
    @CsvSource({
            "4, 2, 2",
            "-4, 2, -2",
            "0, 2, 0",
            "0, 0, 0"
    })
    void param_test_division(int opG, int opD, int result)
    {
        // GIVEN

        // WHEN
        int resultat = calc.divide(opG, opD);

        // THEN
        assertThat(resultat).isEqualTo(result);
    }
}