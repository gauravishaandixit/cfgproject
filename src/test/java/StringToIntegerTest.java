import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToIntegerTest {

    @Test
    void convert1() {
        assertEquals(-42, new StringToInteger().convert("-42"));
    }
    @Test
    void convert2() {
        assertEquals(-42, new StringToInteger().convert("    -42"));
    }
    @Test
    void convert3() {
        assertEquals(4193, new StringToInteger().convert("4193 with words"));
    }
    @Test
    void convert4() {
        assertEquals(0, new StringToInteger().convert("words and 987"));
    }

    @Test
    void convert5() {
        assertEquals(-2147483648, new StringToInteger().convert("-91283472332"));
    }
    @Test
    void convert6() {
        assertNotEquals(0, new StringToInteger().convert("3.14159"));
    }
}