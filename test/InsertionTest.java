import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionTest extends SortTest {
    @Override
    @Before
    public void setUp() throws Exception {
        super.setUp();
    }

    @Test
    public void sort() throws Exception {
        setUp();
        Insertion.sort(randInt);
        Insertion.sort(randString);
        Insertion.sort(sortedInt);
        Insertion.sort(sortedString);
        Insertion.sort(discretInt);
        Insertion.sort(discretString);
        Insertion.sort(invertedInt);
        Insertion.sort(invertedString);
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