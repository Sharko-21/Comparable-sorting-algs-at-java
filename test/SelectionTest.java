import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SelectionTest extends SortStructureTest {
    @Override
    @Before
    public void setUp() throws Exception {
        super.setUp();
    }

    @Test
    public void sort() throws Exception {
        setUp();
        Selection.sort(randInt);
        Selection.sort(randString);
        Selection.sort(sortedInt);
        Selection.sort(sortedString);
        Selection.sort(discretInt);
        Selection.sort(discretString);
        Selection.sort(invertedInt);
        Selection.sort(invertedString);
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