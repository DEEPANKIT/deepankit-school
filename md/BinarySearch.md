# BinarySearch

Program for Binary Search using recursion

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class BinarySearch {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int x, y, l, t;
        System.out.println("Enter the number of elements in the array");
        l = sc.nextInt();
        int arr[] = new int[l];
        System.out.println("Enter " + l + " Integers in the array");
        for (x = 0; x < l; x++) {
            arr[x] = sc.nextInt();
        }
        System.out.println("Enter the Integer to be SEARCHED");
        int s = sc.nextInt();

        for (y = 0; y < l; y++) {
            for (x = 0; x < l - 1 - y; x++) {
                if (arr[x] > arr[x + 1]) {
                    t = arr[x];
                    arr[x] = arr[x + 1];
                    arr[x + 1] = t;
                }
            }
        }
        x = BinarySearch.search(s, arr, 0, arr.length - 1);
        if (x == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found ");
    }


    static int search(int num, int arr[], int l, int h) {
        int mid = (l + h) / 2;
        if (l > h)
            return -1;
        if (arr[mid] == num)
            return mid;
        else if (num > arr[mid]) {
            l = mid + 1;
            return BinarySearch.search(num, arr, l, h);
        } else {
            h = mid - 1;
            return BinarySearch.search(num, arr, l, h);
        }

    }

}	
```

