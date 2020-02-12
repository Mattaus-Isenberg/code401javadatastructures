# MergeSort()

## Problem Domain
Write a function that will order values in ascending order when merging an array split in halves.

## Code 
[InsertionSort Code](src/main/java/code401challenges/MergeSort.java)

## Pseudo

    ALGORITHM Mergesort(arr)
        DECLARE n <-- arr.length
               
        if n > 1
          DECLARE mid <-- n/2
          DECLARE left <-- arr[0...mid]
          DECLARE right <-- arr[mid...n]
          // sort the left side
          Mergesort(left)
          // sort the right side
          Mergesort(right)
          // merge the sorted left and right sides together
          Merge(left, right, arr)
    
    ALGORITHM Merge(left, right, arr)
        DECLARE i <-- 0
        DECLARE j <-- 0
        DECLARE k <-- 0
    
        while i < left.length && j < right.length
            if left[i] <= right[j]
                arr[k] <-- left[i]
                i <-- i + 1
            else
                arr[k] <-- right[j]
                j <-- j + 1
                
            k <-- k + 1
    
        if i = left.length
           set remaining entries in arr to remaining values in right
        else
           set remaining entries in arr to remaining values in left
      
## Visual

Sorting of halves Left and Right

|    LEFT | i | j | temp |
|---------|---|---|------|
| 1st Run | 1 | 0 | 4    |
| 2nd Run | 2 | 1 | 23   |

|   RIGHT | i | j | temp |
|---------|---|---|------|
| 1st Run | 1 | 0 | 16   |
| 2nd Run | 2 | 1 | 15   |


        int[] actual = {8,4,23,42,16,15};
        int[] expected = {4, 8, 15, 16, 23, 42};
   
## Walk through 
     
## 1st Run for insertionSort() on left
i = 1, J = 0, temp = 4
 The arr[1] is stored in temp variable. Being less than arr[0], the value arr[0] is assigned to the index following the lesser number.

## 2nd Run for insertionSort() on left
i = 2, J = 1, temp = 23
The arr[2] is stored in temp variable. Being greater than arr[1], the value arr[2] is assigned to the same index where it was.

## 1st Run for insertionSort() on Right
i = 1, J = 0, temp = 16
 The arr[1] is stored in temp variable. Being less than arr[0], the value arr[0] is assigned to the index following the lesser number.

## 2nd Run for insertionSort on Right
i = 2, J = 1, temp = 15
 The arr[2] is stored in temp variable. Being less than arr[1], the value arr[1] is assigned to the index following the lesser number.

## Run for MergeSort()
MergeSort will then compare the values per index on left and right arrays, and place values in ascending order depending on result of comparison, if left or right exceed lenght of comparison due to one array being longer than the other then remaining values for longer array are filled in.



## Result 
[4, 8, 15, 16, 23, 42]