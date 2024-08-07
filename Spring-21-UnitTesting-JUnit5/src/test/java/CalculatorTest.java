import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeAll
    static void setUpAll() {
        System.out.println("BeforeAll is executed");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("AfterAll is executed");
    }

    @BeforeEach
    void setUpEach() {
        System.out.println("BeforeEach is executed");
    }

    @AfterEach()
    void tearDownEach() {
        System.out.println("AfterEach is executed");
    }
    @Test
    void testCase1(){
    fail("Not implemented yet");
    }
    @Test
    void testCase2(){
        assertTrue(Calculator.operator.equals("add"));
    }
    @Test
    void testCase3(){
        assertArrayEquals(new int[]{1,2,3},new int[]{1,2,3},"Array Equal Test");
    }
    @Test
    void testCase4(){
       String nullString = null;
       String notNullString = "Saturday";
       assertNull(nullString);
       assertNotNull(notNullString);
    }
    @Test
    void testCase5(){
        Calculator c1 = new Calculator();
        Calculator c2 = c1;
        Calculator c3 = new Calculator();
        assertSame(c2,c1);
        assertNotSame(c1,c3);

    }
    @Test
    void add(){
        int actual =  Calculator.add(2,3);
        assertEquals(5,actual, "Expected result is matching");
    }
    @Test
    void add2(){
        assertThrows(IllegalArgumentException.class, () -> Calculator.add2(5,2));

    }

}