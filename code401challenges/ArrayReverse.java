public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        reverseArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
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