package code401challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest
{

    @Test
    public void mergeSortTest()
    {
        int[] actual = {8,4,23,42,16,15};
        int[] expected = {4, 8, 15, 16, 23, 42};

        assertArrayEquals(expected, MergeSort.mergeSort(actual));
    }


    @Test
    public void fewUniquesTest()
    {
        int[] actual = {5,12,7,5,5,7};
        int[] expected = {5, 5, 5, 7, 7, 12};

        assertArrayEquals(expected, MergeSort.mergeSort(actual));
    }

}