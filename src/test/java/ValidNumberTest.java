import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidNumberTest {

    @Test
    void isValidNumber() {
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
        assertEquals(false, new ValidNumber().isValidNumber("1.0e4.5"));
        assertEquals(true, new ValidNumber().isValidNumber("1.23e10"));
        assertEquals(true, new ValidNumber().isValidNumber("123e1"));
        assertEquals(true, new ValidNumber().isValidNumber("00.5"));
        assertEquals(true, new ValidNumber().isValidNumber("0.0000001"));
        assertEquals(true, new ValidNumber().isValidNumber("-500.777"));
        assertEquals(true, new ValidNumber().isValidNumber("-0"));
        assertEquals(false, new ValidNumber().isValidNumber("."));
        assertEquals(false, new ValidNumber().isValidNumber("0.0.0"));

    }
}