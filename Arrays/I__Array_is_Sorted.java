/*
 * Problem: Check if Array is Sorted
 * Difficulty: Easy
 * Topic: Arrays
 *
 * Approach:
 * - Traverse the array
 * - Compare current element with next element
 * - If current > next → array is not sorted
 * - Otherwise continue
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

import java.util.*;

public class I__Array_is_Sorted {

    static boolean isSorted(int[] arr) {

        for(int i = 0; i < arr.length - 1; i++) {

            // if current element is greater than next
            if(arr[i] > arr[i + 1]) {

                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");

        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter array elements: ");

        for(int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        boolean result = isSorted(arr);

        if(result) {

            System.out.println("Array is Sorted");
        }

        else {

            System.out.println("Array is NOT Sorted");
        }

        sc.close();
    }
}