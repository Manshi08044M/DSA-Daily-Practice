/*
 Day: 5
 Problem Name: Majority Element
 Topic: Arrays
 Platform: LeetCode
 Approach: Boyer–Moore Voting Algorithm
 Time Complexity: O(n)
 Space Complexity: O(1)
*/

public class Majority_Element {

    // Returns the element that appears more than n/2 times in the array
    public static int majorityElement(int[] nums) {

        int candidate = 0;
        int count = 0;

        // Boyer–Moore Voting Algorithm
        for (int num : nums) {

            // When count becomes zero, choose a new candidate
            if (count == 0) {
                candidate = num;
            }

            // Increase or decrease count based on current element
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}
