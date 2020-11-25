import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidNumberTest {

    @Test
    void isValidNumber1() {
        assertEquals(true, new ValidNumber().isValidNumber("0.5e04"));
        assertEquals(true, new ValidNumber().isValidNumber("123"));
        assertEquals(false, new ValidNumber().isValidNumber("12 3"));
        assertEquals(false, new ValidNumber().isValidNumber("1a3"));
        assertEquals(false, new ValidNumber().isValidNumber(""));
        assertEquals(true, new ValidNumber().isValidNumber("0.5e-10"));
        assertEquals(true, new ValidNumber().isValidNumber("0.5e10"));
        assertEquals(true, new ValidNumber().isValidNumber("2e0"));
        assertEquals(true, new ValidNumber().isValidNumber(" 005047e+6"));
        assertEquals(true, new ValidNumber().isValidNumber("+.8"));
        assertEquals(false, new ValidNumber().isValidNumber("     "));
        assertEquals(true, new ValidNumber().isValidNumber(".1"));

    }
    @Test
    void isValidNumber2() {
        assertEquals(true, new ValidNumber().isValidNumber("123"));
    }
    @Test
    void isValidNumber3() {
        assertEquals(false, new ValidNumber().isValidNumber("0.0.0"));
    }
    @Test
    void isValidNumber4() {
        assertEquals(false, new ValidNumber().isValidNumber("."));
    }
    @Test
    void isValidNumber5() {
        assertEquals(true, new ValidNumber().isValidNumber("-0"));
    }
    @Test
    void isValidNumber6() {
        assertEquals(true, new ValidNumber().isValidNumber("-500.777"));
    }
    @Test
    void isValidNumber7() {
        assertEquals(false, new ValidNumber().isValidNumber("1.0e4.5"));
    }
    @Test
    void isValidNumber8() {
        assertEquals(true, new ValidNumber().isValidNumber("1.23e10"));
    }
    @Test
    void isValidNumber9() {
        assertEquals(true, new ValidNumber().isValidNumber("123e1"));
    }
    @Test
    void isValidNumber10() {
        assertEquals(true, new ValidNumber().isValidNumber("00.5"));
    }
    @Test
    void isValidNumber11() {
        assertEquals(true, new ValidNumber().isValidNumber("0.0000001"));
    }
}