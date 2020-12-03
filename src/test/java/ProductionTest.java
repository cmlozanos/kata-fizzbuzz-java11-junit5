import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class ProductionTest {

    @Test
    void caseListOfString1To5WithFizzAsModuleThreeNumbersAndBuzzFiveNumber() {
        Assertions.assertEquals(Arrays.asList("1", "2", "Fizz", "4", "Buzz"),result().stream().limit(5).collect(Collectors.toList()));
        Assertions.assertEquals(100,result().size());
    }

    private List<String> result() {
        return IntStream.rangeClosed(1, 100).boxed().map(this::applyFizzBuzzLogic).collect(Collectors.toList());
    }

    private String applyFizzBuzzLogic(Integer e) {
        if (e % 3 == 0) {
            return "Fizz";
        }
        if (e % 5 == 0) {
            return "Buzz";
        }
        return e.toString();
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 12, 18, 21})
    void caseModuleThreeNumberIsFizz(int moduleThreeNumber) {
        Assertions.assertEquals("Fizz", result().get(moduleThreeNumber - 1));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20, 25, 35, 40})
    void caseModuleFiveNumberIsBuzz(int moduleFiveNumber){
        Assertions.assertEquals("Buzz", result().get(moduleFiveNumber - 1));
    }
}
