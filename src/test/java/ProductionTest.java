import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ProductionTest {

    @Test
    void caseListOfNumber1To100(){
        Assertions.assertEquals(IntStream.range(0, 100).boxed().collect(Collectors.toList()), result());
    }

    private List<Integer> result() {
        return IntStream.range(0, 100).boxed().collect(Collectors.toList());
    }
}
