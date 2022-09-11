package Task2.test;

import Task2.main.Main;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void searchPairOfNumber() {
        Assert.assertArrayEquals( new int[]{1,3}, Main.searchPairOfNumber(new int[]{1, 5, 3}, 4) );
        Assert.assertArrayEquals( new int[]{8,17}, Main.searchPairOfNumber(new int[]{1, 8, 32, 25, 31, 55, 17, 3, 5, 3}, 25) );
        Assert.assertArrayEquals( new int[]{4,9}, Main.searchPairOfNumber(new int[]{1, 4, 5, 31, 9, 3}, 13) );
    }
}