
/*
 * Problem: Binary Search
 * Difficulty: Easy
 * Topic: Arrays
 *
 * Approach:
 * - Keep two Pointers low and high
 * - Calculate mid  of high and low
 * - Compare target with mid, if less move to left half else move to right half
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 * NOTE: Only works on SORTED array!
 */
import java.util.*;

public class B_Binary_Search_with_sort {

    static int binarysearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter sorted array Elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target :");
        int target = sc.nextInt();

        int result = binarysearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at " + result);
        } else {
            System.out.println("Element not found");
        }
    }

}
