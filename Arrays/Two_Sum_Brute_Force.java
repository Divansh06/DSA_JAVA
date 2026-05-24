
/*
 * Problem: Two Sum
 * Approach 1: Brute Force
 * Time: O(n²) | Space: O(1)
 */
import java.util.*;

public class Two_Sum_Brute_Force {
    static int[] twosum(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elemnets :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target :");
        int target = sc.nextInt();
        int[] result = twosum(arr, target);
        System.out.println("Indices :" + result[0] + " " + result[1]);
        sc.close();
    }
}
