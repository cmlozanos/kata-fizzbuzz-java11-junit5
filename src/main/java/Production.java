import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Production {

    public List<String> result() {
        return IntStream.rangeClosed(1, 100).boxed().map(this::applyFizzBuzzLogic).collect(Collectors.toList());
    }

    private String applyFizzBuzzLogic(Integer number) {
        if (isFizzNumber(number) && isBuzzNumber(number)) {
            return "FizzBuzz";
        }
        if (isFizzNumber(number)) {
            return "Fizz";
        }
        if (isBuzzNumber(number)) {
            return "Buzz";
        }
        return number.toString();
    }

    private boolean isNumberModuleZero(Integer number, Integer module){
        return number % module == 0;
    }

    private boolean isFizzNumber(Integer number){
        return isNumberModuleZero(number, 3);
    }

    private boolean isBuzzNumber(Integer number){
        return isNumberModuleZero(number, 5);
    }


}
