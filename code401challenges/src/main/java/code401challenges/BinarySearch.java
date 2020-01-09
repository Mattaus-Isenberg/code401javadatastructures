
package code401challenges;
import java.lang.*;

public class BinarySearch {

    public static int binarySearch(int[] array, int number) {
        //Declare initial start, middle, and end points
        int first = 0;
        int last = array.length - 1;
        int middle = 0;

        //Set initial condition to loop though all values
        while (first <= last) {
            //Initialize value for midpoint
            middle = (first + last) / 2;
            //Set condition and modify start point if current value is less than number
            if (array[middle] < number) {
                first = middle + 1;
                //otherwise if array value is greater adjust last endpoint
            } else if (array[middle] > number) {
                last = middle - 1;
                //When the above conditions can no longer be satisfied return the value or return -1 when while exits.
            } else {
                return middle;
            }
        }
        //if while loop is unable to find a match return -1 on exit
        return -1;
    }

}
