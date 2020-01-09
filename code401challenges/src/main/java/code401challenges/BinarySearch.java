
package code401challenges;
import java.lang.*;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array2 = { 4, 8, 15, 16, 23, 42 };
        System.out.println(binarySearch(array2, 42));
    }

    public static int binarySearch(int[] array, int number) {
        int first = 0;
        int last = array.length - 1;
        int middle = 0;

        while (first <= last) {
            middle = (first + last) / 2;
            if (array[middle] < number) {
                first = middle + 1;

            } else if (array[middle] > number) {
                last = middle - 1;

            } else {
                return middle;
            }
        }
        return -1;
    }

}
