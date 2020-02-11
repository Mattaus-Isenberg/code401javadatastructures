# InsertionSort()

## Problem Domain
Write a function that will order values in ascending order.

## Pseudo
    InsertionSort(int[] arr)
  
    FOR i = 1 to arr.length
    
      int j <-- i - 1
      int temp <-- arr[i]
      
      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1
        
      arr[j + 1] <-- temp
      
## Visual

|         | i | j | temp | array[j]   |
|---------|---|---|------|------------|
| 1st Run | 1 | 0 | 4    | 8          |
| 2nd Run | 2 | 1 | 23   | 8          |
| 3rd Run | 3 | 2 | 42   | 8          |
| 4th Run | 4 | 3 | 16   | 42, 23     |
| 5th Run | 5 | 4 | 15   | 42, 23, 16 |

        int[] actual = {8,4,23,42,16,15};
        int[] expected = {4, 8, 15, 16, 23, 42};
        
## 1st Run
i = 1, J = 0, temp = 4
 The arr[1] is stored in temp variable. Being less than arr[0], the value arr[0] is assigned to the index following the lesser number.

## 2nd Run 
i = 2, J = 1, temp = 23
The arr[2] is stored in temp variable. Being greater than arr[1], the value arr[2] is assigned to the same index where it was.

## 3rd Run
i = 3, J = 2, temp = 42
The arr[3] is stored in temp variable. Being greater than arr[2], the value arr[2] is assigned to the same index where it was.

## 4th Run
i = 4, J = 3, temp = 16
The arr[4] is stored in temp variable. Being less than arr[3], the value arr[3] is assigned to the index following the lesser number. Since arr[2] is greater than temp then arr[2] which is value of 23 is assigned to arr[3] and arr[4] which is 16 is assigned to arr[2]

## 5th Run
i = 5, J = 4, temp = 15
The arr[5] is stored in temp variable. Being less than arr[4], the value arr[4] which is 42 is assigned to the index following the lesser number, arr[5], since arr[3] is greater than temp value, its value of 23 is assigned to arr[4], since arr[2] is greater than temp, its value 16 is assigned at arr[3] and finally the value of temp which is 15 is assigned to arr[2] .

## Result 
[4, 8, 15, 16, 23, 42]