import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeBUTest extends SortTest {
    @Override
    @Before
    public void setUp() throws Exception {
        super.setUp();
    }

    @Test
    public void sort() throws Exception {
        setUp();
        MergeBU.sort(randInt);
        MergeBU.sort(randString);
        MergeBU.sort(sortedInt);
        MergeBU.sort(sortedString);
        MergeBU.sort(discretInt);
        MergeBU.sort(discretString);
        MergeBU.sort(invertedInt);
        MergeBU.sort(invertedString);
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