package code401challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {

    @Test
    public void insertionSort()
    {
        int[] actual = {8,4,23,42,16,15};
        int[] expected = {4, 8, 15, 16, 23, 42};

        assertArrayEquals(expected, InsertionSort.insertionSort(actual));
    }

    @Test
    public void reverseSortedTest()
    {
        int[] actual = {20,18,12,8,5,-2};
        int[] expected = {-2, 5, 8, 12, 18, 20};

        assertArrayEquals(expected, InsertionSort.insertionSort(actual));
    }

    @Test
    public void fewUniquesTest()
    {
        int[] actual = {5,12,7,5,5,7};
        int[] expected = {5, 5, 5, 7, 7, 12};

        assertArrayEquals(expected, InsertionSort.insertionSort(actual));
    }

    @Test
    public void nearlySortedTest()
    {
        int[] actual = {2,3,5,7,13,11};
        int[] expected = {2, 3, 5, 7, 11, 13};

        assertArrayEquals(expected, InsertionSort.insertionSort(actual));
    }
}