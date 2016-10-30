package com.github.bvc3at.sort;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;
import static org.junit.Assert.*;

public class SortTest {
    Random random;
    int n;
    Comparable[] randInt;
    Comparable[] randString;
    Comparable[] sortedInt;
    Comparable[] sortedString;
    Comparable[] discretInt;
    Comparable[] discretString;
    Comparable[] invertedInt;
    Comparable[] invertedString;
    Comparable[] randIntSorted;
    Comparable[] randStringSorted;
    Comparable[] sortedIntSorted;
    Comparable[] sortedStringSorted;
    Comparable[] discretIntSorted;
    Comparable[] discretStringSorted;
    Comparable[] invertedIntSorted;
    Comparable[] invertedStringSorted;
    @Before
    public void setUp() throws Exception {
        random = new Random();
        n = 1000;
        randInt = getRandInt();
        randString = getRandString();
        sortedInt = getSortedInt();
        sortedString = getSortedString();
        discretInt = getDiscreteInt();
        discretString = getDiscreteString();
        invertedInt = getInvertedInt();
        invertedString = getInvertedString();

        randIntSorted = randInt.clone();
        randStringSorted = randString.clone();
        sortedIntSorted = sortedInt.clone();
        sortedStringSorted = sortedString.clone();
        discretIntSorted = discretInt.clone();
        discretStringSorted = discretString.clone();
        invertedIntSorted = invertedInt.clone();
        invertedStringSorted = invertedString.clone();
        Arrays.sort(randIntSorted);
        Arrays.sort(randStringSorted);
        Arrays.sort(sortedIntSorted);
        Arrays.sort(sortedStringSorted);
        Arrays.sort(discretIntSorted);
        Arrays.sort(discretStringSorted);
        Arrays.sort(invertedIntSorted);
        Arrays.sort(invertedStringSorted);

    }

    @Test
    public void less() throws Exception {
        assertFalse(Sort.less(3, 0));
        assertFalse(Sort.less('b', 'a'));
        assertFalse(Sort.less("0", "0"));
        assertFalse(Sort.less(1, -1));
        assertTrue(Sort.less("3", "4"));
        assertTrue(Sort.less(-1, 0));

    }

    @Test
    public void exch() throws Exception {
        Comparable[] dataInt = new Integer[n];
        Comparable[] dataString = new String[n];
        for (int i = 0; i < n; i++) {
            dataInt[i] = random.nextInt();
            dataString[i] = String.valueOf(random.nextDouble());
        }
        Comparable[] originalDataInt = dataInt.clone();
        Comparable[] originalDataString = dataString.clone();
        for (int i = 0; i < random.nextInt()+n; i++) {
            Sort.exch(dataInt, random.nextInt(n), random.nextInt(n));
            Sort.exch(dataString, random.nextInt(n), random.nextInt(n));
        }
        Arrays.sort(originalDataInt);
        Arrays.sort(originalDataString);
        Arrays.sort(dataInt);
        Arrays.sort(dataString);
        assertArrayEquals(dataInt, originalDataInt);
        assertArrayEquals(dataString, originalDataString);

    }

    @Test
    public void isSorted() throws Exception {
        Comparable[] dataInt = new Integer[n];
        Comparable[] dataString = new String[n];
        for (int i = 0; i < n; i++) {
            dataInt[i] = random.nextInt();
            dataString[i] = String.valueOf(random.nextDouble());
        }
        Arrays.sort(dataInt);
        Arrays.sort(dataString);
        assertTrue(Sort.isSorted(dataInt));
        assertTrue(Sort.isSorted(dataString));
    }

    Comparable[] getRandInt() {
        Comparable[] dataInt = new Integer[n];
        for (int i = 0; i < n; i++)
            dataInt[i] = random.nextInt();
        return dataInt;
    }
    Comparable[] getRandString() {
        Comparable[] dataString = new String[n];
        for (int i = 0; i < n; i++)
            dataString[i] = String.valueOf(random.nextDouble());
        return dataString;
    }
    Comparable[] getSortedInt() {
        Comparable[] dataInt = new Integer[n];
        for (int i = 0; i < n; i++)
            dataInt[i] = i;
        return dataInt;
    }
    Comparable[] getSortedString() {
        Comparable[] dataString = new String[n];
        for (int i = 0; i < n; i++)
            dataString[i] = ((char) i) + "";
        return dataString;
    }
    Comparable[] getInvertedInt() {
        Comparable[] dataInt = new Integer[n];
        for (int i = n-1; i >= 0; i--)
            dataInt[i] = i;
        return dataInt;
    }
    Comparable[] getInvertedString() {
        Comparable[] dataString = new String[n];
        for (int i = n-1; i >= 0; i--)
            dataString[i] = ((char) i) + "";
        return dataString;
    }
    Comparable[] getDiscreteInt() {
        int[] vals = new int[]{-10, -3, 0, 5, 9};
        Comparable[] dataInt = new Integer[n];
        for (int i = n-1; i >= 0; i--)
            dataInt[i] = vals[random.nextInt(vals.length)];
        return dataInt;
    }
    Comparable[] getDiscreteString() {
        String[] vals = new String[]{"a", "d", "z", "Я"};
        Comparable[] dataString = new String[n];
        for (int i = n-1; i >= 0; i--)
            dataString[i] = vals[random.nextInt(vals.length)];
        return dataString;
    }

}