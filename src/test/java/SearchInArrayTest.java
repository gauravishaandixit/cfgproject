import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInArrayTest {

    @Test
    void search1() {
        assertEquals(true, new SearchInArray().search(new int[]{5,6,7,1,2,3,4}, 1));

    }
    @Test
    void search2() {
        assertEquals(true, new SearchInArray().search(new int[]{5,6,7,1,2,3,4}, 5));
    }
    @Test
    void search3() {
        assertEquals(true, new SearchInArray().search(new int[]{5,6,7,1,2,3,4}, 4));

    }
    @Test
    void search4() {
        assertEquals(false, new SearchInArray().search(new int[]{5,6,7,1,2,3,4}, 0));
    }
}