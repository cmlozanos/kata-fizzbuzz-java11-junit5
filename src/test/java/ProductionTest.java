import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class ProductionTest {

    @Test
    void caseListOfNumber1To100() {
        Assertions.assertEquals(IntStream.range(0, 100).boxed().map(this::applyFizzBuzzLogic).collect(Collectors.toList()),
                result());
    }

    private List<String> result() {
        List<String> result = IntStream.range(0, 100).boxed().map(this::applyFizzBuzzLogic).collect(Collectors.toList());
        return result;
    }

    private String applyFizzBuzzLogic(Integer e) {
        if (e == 3) {
            return "Fizz";
        }
        return e.toString();
    }

    @Test
    void caseThreeNumberIsFizz() {
        Assertions.assertEquals("Fizz", result().get(3));
    }
}
