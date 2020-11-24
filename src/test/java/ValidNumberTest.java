import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidNumberTest {

    @Test
    void isValidNumber() {
        assertEquals(true, new ValidNumber().isValidNumber("0.5e04"));
    }
}