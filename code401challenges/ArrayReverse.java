import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        // create the array to test your code on later
        int[] startArr = new int[] { 1, 2, 3, 4, 5, 10 };
        // print it out, nicely
        System.out.println(Arrays.toString(startArr));
        // call your reverseArray method and save the result in a variable
        int[] endArr = reverseArray(startArr);
        // print out the result, nicely
        System.out.println(Arrays.toString(endArr));
    }

    // the method you should write, to reverse an array
    public static int[] reverseArray(int[] array) {
        // save incoming array to internal variable
        int[] arr = array;
        // declare beginning, temporary, and ending points
        int i = 0;
        int j = arr.length - 1;
        int temp = 0;
        // While loop created to re-order array contents
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        // array returned
        return arr;
    }

}