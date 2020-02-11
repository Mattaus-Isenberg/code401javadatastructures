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
    
}
