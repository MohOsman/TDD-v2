import exceptions.NegativNumberException;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class StringCalculatorTest {

    private StringCalculator sc ;

    @Rule
    public ExpectedException thrown =  ExpectedException.none();

    @Before
    public void setUp() throws Exception {
        sc = new StringCalculator();
    }

    @Test
    public void empty_string_should_retrun_0() throws NegativNumberException {
        int result = sc.getSumOfNr("");

        assertEquals(0,result);
    }

    @Test
    public void single_Number_returns_the_value() throws NegativNumberException {
          int result = sc.getSumOfNr("4");
          assertEquals(4,result);

    }

    @Test
    public void two_numbers_with_comma_should_return_the_sum() throws NegativNumberException {
        int result = sc.getSumOfNr("10,20");
        assertEquals(30,result);
        
    }

    @Test
    public void two_numbers_with_newLine_returns_the_sum() throws NegativNumberException {
        int result = sc.getSumOfNr("1\n2");
        assertEquals(3,result);

    }

    @Test
    public void three_numbers_delimited_either_way_return_the_sum() throws NegativNumberException {
        int result =  sc.getSumOfNr("1\n2,3\n4");
        assertEquals(10,result);
    }


    @Test
    public void negativ_numbers_thows_negativNumberException() throws NegativNumberException {

        thrown.expect(NegativNumberException.class);
        thrown.expectMessage("negatives not allowed:");
        sc.getSumOfNr("-1");
    }


    @Test
    public void numbers_More_1000_are_ignord() throws NegativNumberException {
        int result = sc.getSumOfNr("1100,200");
        assertEquals(0, result);

    }
}