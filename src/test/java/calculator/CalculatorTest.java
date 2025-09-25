package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        Calculator calculator = new Calculator();
    }

    @Test
    void add_devrait_calculer_la_somme_de_deux_entiers() {
        //GIVEN
        int opG = 1;
        int opD = 2;
        int expected = 3;

        //WHEN
        int result = Calculator.add(opG, opD);

        //THEN
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void divide_devrait_calculer_le_quotient_de_deux_entiers() {
        //GIVEN
        Calculator calculator = new Calculator();
        int opG = 4;
        int opD = 2;
        int expected = 2;

        //WHEN
        int result = Calculator.divide(opG, opD);

        //THEN
        assertThat(result).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({
            "0, 1, 1",
            "1, 2, 3",
            "-2, 2, 0",
            "0, 0, 0",
            "-1, -2, -3"
    })
    void add_devrait_calculer_la_somme_de_plusieurs_entiers(int opG, int opD, int resultatAttendu) {
        int resultat = Calculator.add(opG, opD);
        assertThat(resultat).isEqualTo(resultatAttendu);
    }
}