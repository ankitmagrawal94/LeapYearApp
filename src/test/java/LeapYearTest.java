import com.java.year.leap.LeapYear;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class LeapYearTest {

    @Test
    public void testLeapYearFirstUseCase(){
        assertEquals(true,LeapYear.testLeapYear(2000));
    }

    @Test
    public void testLeapYearSecondUseCase(){
        assertEquals(false,LeapYear.testLeapYear(1900));
    }

    @Test
    public void testLeapYearThirdUseCase(){
        assertEquals(true,LeapYear.testLeapYear(2016));
    }

    @Test
    public void testLeapYearFourUseCase(){
        assertEquals(false,LeapYear.testLeapYear(2019));
    }

}
