import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShellTest extends SortStructureTest{
    @Override
    @Before
    public void setUp() throws Exception {
        super.setUp();
    }

    @Test
    public void sort() throws Exception {
        setUp();
        Shell.sort(randInt);
        Shell.sort(randString);
        Shell.sort(sortedInt);
        Shell.sort(sortedString);
        Shell.sort(discretInt);
        Shell.sort(discretString);
        Shell.sort(invertedInt);
        Shell.sort(invertedString);
        assertArrayEquals(randInt, randIntSorted);
        assertArrayEquals(randString, randStringSorted);
        assertArrayEquals(sortedInt, sortedIntSorted);
        assertArrayEquals(sortedString, sortedStringSorted);
        assertArrayEquals(discretInt, discretIntSorted);
        assertArrayEquals(discretString, discretStringSorted);
        assertArrayEquals(invertedInt, invertedIntSorted);
        assertArrayEquals(invertedString, invertedStringSorted);
    }

    @Test
    public void sortFast() throws Exception {
        setUp();
        Shell.sortFast(randInt);
        Shell.sortFast(randString);
        Shell.sortFast(sortedInt);
        Shell.sortFast(sortedString);
        Shell.sortFast(discretInt);
        Shell.sortFast(discretString);
        Shell.sortFast(invertedInt);
        Shell.sortFast(invertedString);
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