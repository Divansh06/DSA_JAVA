/*
 * Problem: Find Maximum and Minimum
 * Difficulty: Easy
 * Topic: Arrays
 *
 * Approach: Single Pass
 * - max aur min ko arr[0] se initialize karo
 * - har element se compare karo
 *
 * Time: O(n) | Space: O(1)
 */
public class G_Max_Min {

    static void findMaxMin(int[] arr) {
        int max = arr[0];   // pehle element se shuru
        int min = arr[0];   // pehle element se shuru

        for (int i = 1; i < arr.length; i++) {  // i=1 se! 0 already liya
            if (arr[i] > max) max = arr[i];     // naya max mila?
            if (arr[i] < min) min = arr[i];     // naya min mila?
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 7, 2, 9, 4};
        findMaxMin(arr);
    }
}