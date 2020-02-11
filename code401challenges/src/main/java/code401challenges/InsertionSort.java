package code401challenges;

import java.util.Arrays;

public class InsertionSort
{

    public static int[] insertionSort(int[] arr)
    {
        for(var i = 1; i < arr.length; i ++)
        {
            int j = i - 1;
            System.out.println("J-1: " + j);
            int temp = arr[i];
            System.out.println("TEMP: " + temp);

            while (j >= 0 && temp < arr[j])
            {
                arr[j + 1] = arr[j];
                System.out.println("J-B " + arr[j]);
                j = j - 1;
            }
            arr[j + 1] = temp;
            System.out.println("TEMP CHANGED: " + temp);
            System.out.println("INDEX WALK: " + arr[i]);

        }
        return arr;
    }

    public static void main(String[] args)
    {
        int[] testArray = {8,4,23,42,16,15};
        System.out.println(Arrays.toString(insertionSort(testArray)));

       // int[] reverseSorted = {20,18,12,8,5,-2};
      //  System.out.println(Arrays.toString(insertionSort(reverseSorted)));

      //  int[] fewUniques = {5,12,7,5,5,7};
      //  System.out.println(Arrays.toString(insertionSort(fewUniques)));

      //  int[] nearlySorted = {2,3,5,7,13,11};
      //  System.out.println(Arrays.toString(insertionSort(nearlySorted)));
    }
}
