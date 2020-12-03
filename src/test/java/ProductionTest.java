import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.stream.Collectors;

class ProductionTest {

    private Production production;

    @BeforeEach
    void setUp() {
        this.production = new Production();
    }

    @Test
    void caseListOfString1To5WithFizzAsModuleThreeNumbersAndBuzzFiveNumber() {
        Assertions.assertEquals(Arrays.asList("1", "2", "Fizz", "4", "Buzz"),
                production.result().stream().limit(5).collect(Collectors.toList()));
        Assertions.assertEquals(100, production.result().size());
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 12, 18, 21})
    void caseModuleThreeNumberIsFizz(int moduleThreeNumber) {
        Assertions.assertEquals("Fizz", production.result().get(moduleThreeNumber - 1));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20, 25, 35, 40})
    void caseModuleFiveNumberIsBuzz(int moduleFiveNumber) {
        Assertions.assertEquals("Buzz", production.result().get(moduleFiveNumber - 1));
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45, 60, 75})
    void caseModuleThreeAndFiveIsFizzBuzz(int moduleThreeAndFive) {
        Assertions.assertEquals("FizzBuzz", production.result().get(moduleThreeAndFive - 1));
    }
}
