import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HeapTest extends SortStructureTest{
    @Override
    @Before
    public void setUp() throws Exception {
        super.setUp();
    }

    @Test
    public void sort() throws Exception {
        setUp();
        Heap.sort(randInt);
        Heap.sort(randString);
        Heap.sort(sortedInt);
        Heap.sort(sortedString);
        Heap.sort(discretInt);
        Heap.sort(discretString);
        Heap.sort(invertedInt);
        Heap.sort(invertedString);
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