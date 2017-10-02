package roman;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanToArabicTest {

    RomanToArabic romanToArabic;

    @Before
    public void before() {
        romanToArabic = new RomanToArabic();
    }

    @Test
    public void testSingleValueConversion() {
        int result = Roman.valueOf("X").toInt();

        assertEquals(10, result);
    }

    @Test
    public void testUnits() {
        int arabicResult = romanToArabic.convert("V");

        assertEquals(5, arabicResult);
    }


}