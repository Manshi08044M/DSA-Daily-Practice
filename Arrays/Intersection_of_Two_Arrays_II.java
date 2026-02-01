import java.util.ArrayList;
import java.util.List;

/*
 Day: 26
 Problem Name: Intersection of Two Arrays II
 Topic: Arrays
 Platform: LeetCode
 Approach: Brute Force with Visited Array
 Time Complexity: O(n × m)
 Space Complexity: O(m)
*/

public class Intersection_of_Two_Arrays_II {

    // Returns the intersection of two arrays including duplicate elements
    public static int[] intersect(int[] nums1, int[] nums2) {

        List<Integer> ansList = new ArrayList<>();

        // Array to mark visited elements in nums2
        int[] visited = new int[nums2.length];

        // Compare each element of nums1 with nums2
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {

                // If match found and element not used before
                if (nums1[i] == nums2[j] && visited[j] == 0) {
                    ansList.add(nums2[j]);
                    visited[j] = 1; // mark as used
                    break;
                }
            }
        }

        // Convert list to array
        int[] ans = new int[ansList.size()];
        for (int k = 0; k < ansList.size(); k++) {
            ans[k] = ansList.get(k);
        }

        return ans;
    }
}
