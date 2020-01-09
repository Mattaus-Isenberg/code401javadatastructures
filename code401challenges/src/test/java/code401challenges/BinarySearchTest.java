package code401challenges;

import org.junit.Test;
import static org.junit.Assert.*;


public class BinarySearchTest {
    
    @Test public void binarySearchTestTrue(){

        int[] array2 = { 4, 8, 15, 16, 23, 42 };
        int numToSearch = 23;
        int actual = BinarySearch.binarySearch(array2, numToSearch);
        assertTrue(4 == actual);
    }

    @Test public void binarySearchTestOutOfRange(){

        int[] array2 = {11,22,33,44,55,66,77};
        int numToSearch = 90;
        int actual = BinarySearch.binarySearch(array2, numToSearch);
        assertTrue(-1 == actual);
    }
}