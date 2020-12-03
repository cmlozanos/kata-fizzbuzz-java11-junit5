import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class ProductionTest {

    @Test
    void caseListOfString1To100WithFizzAsModuleThreeNumbers() {
        Assertions.assertEquals(IntStream.range(0, 100).boxed().map(this::applyFizzBuzzLogic).collect(Collectors.toList()),
                result());
    }

    private List<String> result() {
        return IntStream.range(0, 100).boxed().map(this::applyFizzBuzzLogic).collect(Collectors.toList());
    }

    private String applyFizzBuzzLogic(Integer e) {
        if (e % 3 == 0) {
            return "Fizz";
        }
        return e.toString();
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 12, 18, 21})
    void caseModuleThreeNumberIsFizz(int moduleThreeNumber) {
        Assertions.assertEquals("Fizz", result().get(moduleThreeNumber));
    }
}
