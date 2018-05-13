import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {

    private StringCalculator sc ;

    @Before
    public void setUp() throws Exception {
        sc = new StringCalculator();
    }

    @Test
    public void empty_string_should_retrun_0() {
        int result = sc.getSumOfNr("");

        assertEquals(0,result);
    }

    @Test
    public void single_Number_returns_the_value() {
          int result = sc.getSumOfNr("4");
          assertEquals(4,result);

    }

    @Test
    public void two_numbers_with_comma_should_return_the_sum() {
        int result = sc.getSumOfNr("10,20");
        assertEquals(30,result);
        
    }

    @Test
    public void two_numbers_with_newLine_returns_the_sum() {
        int result = sc.getSumOfNr("1\n2");
        assertEquals(3,result);

    }
}