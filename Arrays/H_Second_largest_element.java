/*
 * Problem: Find Second Largest Element
 * Difficulty: Easy
 * Topic: Arrays
 *
 * Approach:
 * - Traverse the array once
 * - Keep track of:
 *      1. Largest element
 *      2. Second largest element
 * - Update values accordingly
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

import java.util.*;

public class H_Second_largest_element {

    static int secondLargest(int[] arr) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {

            // if current element is greater than largest
            if(arr[i] > largest) {

                secondLargest = largest;

                largest = arr[i];
            }

            // if current element is between largest and secondLargest
            else if(arr[i] > secondLargest && arr[i] != largest) {

                secondLargest = arr[i];
            }
        }

        return secondLargest;
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

        int result = secondLargest(arr);

        System.out.println("Second Largest Element: " + result);

        sc.close();
    }
}