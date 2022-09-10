package test;

import org.junit.jupiter.api.Test;
import main.Main;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void sortArrays(){
        int[] arr = new int[]{5,6,3,2,5,1,4,9};
        int[] expected = new int[]{1, 2, 3, 4, 5, 5, 6, 9};
        Main.sortArrays(arr);
        assertArrayEquals(expected, arr);
    }
}