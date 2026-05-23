/*
 *Problem : Linear Search
 *Difficulty : Easy
 *Topic : Arrays
 *
 *Approch:
 * - Check each element one by one
 * - If u find the target the return index
 * - If u don't find the target return -1
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 */

import java.util.*;

public class Linear_Search {
	static int linearsearch(int[] arr, int target){
		for(int i=0 ; i < arr.length ; i++){
			if(arr[i] == target)
				return i;}
		return -1;
}
	public static void main(String[] args){
		int[] arr = {5,3,8,1,9};
		int target = 8;
		int result = linearsearch(arr,target);
		
		if (result != -1){
			System.out.println("Found at index :" + result);}
		else{System.out.println("Not Found");}
}}