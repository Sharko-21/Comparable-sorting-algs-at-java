import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuickTest extends SortStructureTest {
    @Override
    @Before
    public void setUp() throws Exception {
        super.setUp();
    }

    @Test
    public void sort() throws Exception {
        setUp();
        Quick.sort(randInt);
        Quick.sort(randString);
        Quick.sort(sortedInt);
        Quick.sort(sortedString);
        Quick.sort(discretInt);
        Quick.sort(discretString);
        Quick.sort(invertedInt);
        Quick.sort(invertedString);
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