
/*
 * Problem: Two Sum
 * Approach 2: Two pointers
 * Time complexity: O(n) | Space complexity: O(1)
 * Note : two pointers only works with sorted array
 */
import java.util.*;

public class D_Two_sum_two_pointers {
    static int[] twosum(int[] arr, int target) {
        int Left = arr[0];
        int Right = arr.length - 1;
        int sum = arr[Left] + arr[Right];

        if (sum == target) {
            return new int[] { Left, Right };
        } else if (sum < target) {
            Left++;
        } else {
            Right--;
        }

        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the elemnts of array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target :");
        int target = sc.nextInt();

        int[] result = twosum(arr, target);
        System.out.print("The indices are :" + result[0] + " " + result[1]);
        sc.close();
    }

}