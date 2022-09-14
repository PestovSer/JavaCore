package Task3.test;

import Task3.main.Main;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


class MainTest {

    @Test
    void fuzzySearch() {
        Assert.assertTrue(Main.fuzzySearch("dogos", "doqwesgoqwesas"));
        Assert.assertTrue(Main.fuzzySearch("zip", "zggkdsgip"));
        Assert.assertFalse(Main.fuzzySearch("book", "okkbqwesahhtrr"));
        Assert.assertFalse(Main.fuzzySearch("yhvii", "iiisadadq"));
    }
}