import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestMultipleOfThreeTest {

    @Test
    void largestMultipleOfThree1() {
        assertEquals("981", new LargestMultipleOfThree().largestMultipleOfThree(new int[]{8,1,9}));
    }
    @Test
    void largestMultipleOfThree2() {
        assertEquals("", new LargestMultipleOfThree().largestMultipleOfThree(new int[]{1}));
    }
    @Test
    void largestMultipleOfThree3() {
        assertEquals("0", new LargestMultipleOfThree().largestMultipleOfThree(new int[]{0,0,0,0,0,0}));
    }

}