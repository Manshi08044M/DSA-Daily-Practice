/*
 Day: 8
 Problem Name: Union of Two Sorted Arrays
 Topic: Arrays
 Approach: Two Pointers
 Time Complexity: O(n + m)
 Space Complexity: O(n + m)
*/
import java.util.*;

public class Union_of_Sorted_Arrays {

    // Returns the union of two sorted arrays without duplicates
    public static List<Integer> union(int[] arr1, int[] arr2) {

        int i = 0, j = 0;
        List<Integer> result = new ArrayList<>();

        // Traverse both arrays using two pointers
        while (i < arr1.length && j < arr2.length) {

            // Avoid adding duplicate elements to result
            if (!result.isEmpty() &&
                result.get(result.size() - 1) == Math.min(arr1[i], arr2[j])) {

                if (arr1[i] <= arr2[j]) {
                    i++;
                } else {
                    j++;
                }
                continue;
            }

            // Add smaller element and move pointer
            if (arr1[i] < arr2[j]) {
                result.add(arr1[i++]);
            }
            // Add smaller element from second array
            else if (arr1[i] > arr2[j]) {
                result.add(arr2[j++]);
            }
            // If both elements are equal, add once and move both pointers
            else {
                result.add(arr1[i]);
                i++;
                j++;
            }
        }

        // Add remaining elements from arr1
        while (i < arr1.length) {
            if (result.isEmpty() || result.get(result.size() - 1) != arr1[i]) {
                result.add(arr1[i]);
            }
            i++;
        }

        // Add remaining elements from arr2
        while (j < arr2.length) {
            if (result.isEmpty() || result.get(result.size() - 1) != arr2[j]) {
                result.add(arr2[j]);
            }
            j++;
        }

        return result;
    }
}
