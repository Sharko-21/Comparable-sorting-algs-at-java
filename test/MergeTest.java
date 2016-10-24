import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class MergeTest extends SortStructureTest{
    @Override
    @Before
    public void setUp() throws Exception {
        super.setUp();
    }

    @Test
    public void sort() throws Exception {
        setUp();
        Merge.sort(randInt);
        Merge.sort(randString);
        Merge.sort(sortedInt);
        Merge.sort(sortedString);
        Merge.sort(discretInt);
        Merge.sort(discretString);
        Merge.sort(invertedInt);
        Merge.sort(invertedString);
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