import java.util.HashMap;

/*
 Day: 20
 Problem Name: Two Sum
 Topic: Arrays
 Platform: LeetCode
 Approach: HashMap (One Pass)
 Time Complexity: O(n)
 Space Complexity: O(n)
*/

public class Two_Sum {

    // Returns indices of the two numbers such that they add up to target
    public static int[] twoSum(int[] nums, int target) {

        // HashMap to store number and its index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {

            int needed = target - nums[i];

            // If required number already exists, solution found
            if (map.containsKey(needed)) {
                return new int[]{map.get(needed), i};
            }

            // Store current number with its index
            map.put(nums[i], i);
        }

        // As per problem statement, this line will never be reached
        return new int[]{};
    }
}
