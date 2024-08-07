import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculatorParametrizedTest {
    @ParameterizedTest
    @ValueSource(strings = {"abc1","abc2"})
    void testCase1(String arg){
        Assertions.assertTrue(!arg.isEmpty());
    }
    @ParameterizedTest
    @ValueSource(ints = {3,6,10})
    void testCase1(int number) {
        Assertions.assertEquals(0, number % 3); //if number 3%3 = 0
    }
}
