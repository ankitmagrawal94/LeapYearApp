import com.java.year.leap.LeapYear;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class LeapYearTest {

    @Test
    public void testLeapYearFirst(){
        assertEquals(true,LeapYear.testLeapYear(2000));
    }

    @Test
    public void testLeapYearSecond(){
        assertEquals(false,LeapYear.testLeapYear(1900));
    }

    @Test
    public void testLeapYearThird(){
        assertEquals(true,LeapYear.testLeapYear(2016));
    }

    @Test
    public void testLeapYearFour(){
        assertEquals(false,LeapYear.testLeapYear(2019));
    }


}
