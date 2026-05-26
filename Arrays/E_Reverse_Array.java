/*
 * Problem: Reverse Array
 * Difficulty: Easy
 * Topic: Arrays
 *
 * Approach: Two Pointer (In-place)
 * - left=0, right=n-1
 * - Swap karo aur pointers move karo
 * - Jab left >= right → stop
 *
 * Time: O(n) | Space: O(1)
 */
public class E_Reverse_Array {

    static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // swap karo
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;    // left aage badho
            right--;   // right peeche aao
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.print("Before: ");
        for (int x : arr) System.out.print(x + " ");

        reverse(arr);

        System.out.print("\nAfter:  ");
        for (int x : arr) System.out.print(x + " ");
    }
}