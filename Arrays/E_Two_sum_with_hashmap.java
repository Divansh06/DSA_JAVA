/*
 * Problem: Two Sum
 * Approach 3: HashMap - OPTIMAL
 * Time: O(n) | Space: O(n)
 *
 * Key Idea:
 * compliment for each element = target - arr[i]
 * if compliment is presnet already the answer forund!
 */
import java.util.*;

public class E_Two_sum_with_hashmap {
    static int[] twosum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int compliment = target - arr[i]; /* we need the compliment */

            if (map.containsKey(compliment)) /* if compleiment is seen before */
            {
                return new int[] { map.get(compliment), i }; /* the return */
            }
            map.put(arr[i], i); /* if not seen then store */
        }
        return new int[] { -1, -1 }; /* if not found the valid numbers */
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
