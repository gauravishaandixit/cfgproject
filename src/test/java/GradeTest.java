import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeTest {
    @Test
    void calc1() {
        assertEquals('A', new Grade().calculateGrade(new int[]{90,92,89,81}));
    }
    @Test
    void calc2() {
        assertEquals('B', new Grade().calculateGrade(new int[]{60,71,79,67}));
    }
    @Test
    void calc3() {
        assertEquals('C', new Grade().calculateGrade(new int[]{55,45,49,59}));
    }
    @Test
    void calc4() {
        assertEquals('D', new Grade().calculateGrade(new int[]{49,45,21,35}));
    }
}