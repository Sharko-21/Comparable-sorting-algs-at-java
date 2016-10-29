import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Quick3Test extends SortTest {
    @Override
    @Before
    public void setUp() throws Exception {
        super.setUp();
    }

    @Test
    public void sort() throws Exception{
        setUp();
        Quick3.sort(randInt);
        Quick3.sort(randString);
        Quick3.sort(sortedInt);
        Quick3.sort(sortedString);
        Quick3.sort(discretInt);
        Quick3.sort(discretString);
        Quick3.sort(invertedInt);
        Quick3.sort(invertedString);
        assertArrayEquals(randInt, randIntSorted);
        assertArrayEquals(randString, randStringSorted);
        assertArrayEquals(sortedInt, sortedIntSorted);
        assertArrayEquals(sortedString, sortedStringSorted);
        assertArrayEquals(discretInt, discretIntSorted);
        assertArrayEquals(discretString, discretStringSorted);
        assertArrayEquals(invertedInt, invertedIntSorted);
        assertArrayEquals(invertedString, invertedStringSorted);
    }


}