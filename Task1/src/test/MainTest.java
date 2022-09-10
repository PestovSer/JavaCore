package test;

import org.junit.jupiter.api.Test;
import main.Main;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void minNumber() {
        int[][] arrayTest = new int[][]{{1, 3, 5}, {2, 4, 6}};
        assertEquals(1, Main.minNumber(arrayTest));
    }

    @Test
    void maxNumber() {
        int[][] arrayTest = new int[][]{{1, 3, 5}, {2, 4, 6}};
        assertEquals(6, Main.minNumber(arrayTest));
    }

    @Test
    void avgNumber() {
        int[][] arrayTest = new int[][]{{1, 3, 5}, {2, 4, 6}};
        assertEquals(3.5, Main.avgNumber(arrayTest));
    }
}