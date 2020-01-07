import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] startArr = new int[] { 1, 2, 3, 4, 5, 10 };
        System.out.println(Arrays.toString(startArr));
        int[] endArr = reverseArray(startArr);
        System.out.println(Arrays.toString(endArr));
    }

    public static int[] reverseArray(int[] array) {

        int[] arr = array;

        int i = 0;
        int j = arr.length - 1;
        int temp = 0;

        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }

}