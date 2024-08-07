import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

public class CalculatorParametrizedTest {
    @ParameterizedTest
    @ValueSource(strings = {"abc1","abc2"})
    void testCase1(String arg){
        Assertions.assertTrue(!arg.isEmpty());
    }
    @ParameterizedTest
    @ValueSource(ints = {3,6,10})
    void testCase2(int number) {
        Assertions.assertEquals(0, number % 3); //if number 3%3 = 0
    }

    @ParameterizedTest
    @ValueSource(strings = {"abc1","abc2"})
//    @EmptySource //expected to have additional(3) strings value as empty
//    @NullSource
    @NullAndEmptySource
    void testCase3(String args){
        Assertions.assertTrue(!args.isEmpty());
    }
    @ParameterizedTest
    @MethodSource("stringProvider")
    void testCase4(String arg) {
        Assertions.assertNotNull(arg);
    }
    static String[] stringProvider(){
        return new String[]{"Java","Js","TS"};
    }
    @ParameterizedTest
    @CsvSource({"10,20,30","20,20,40","30,20,100"})
    void testCase5(int num1, int num2, int result) {
        Assertions.assertEquals(result, Calculator.add(num1,num2));
    }

    @ParameterizedTest
    @CsvFileSource (resources = "/sample-data.csv",numLinesToSkip = 1)
    void testCase6(int num1, int num2, int result) {
        Assertions.assertEquals(result, Calculator.add(num1,num2));
    }

    //// mvn -Dtest=TestCircle#mytest test
    //    // maven-surefire-plugin
    //    // mvn clean test
}
