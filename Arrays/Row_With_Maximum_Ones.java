/*
 Day: 19
 Problem Name: Row With Maximum Ones
 Topic: Arrays / Matrix
 Platform: LeetCode
 Approach: Row-wise Traversal
 Time Complexity: O(m × n)
 Space Complexity: O(1)
*/

public class Row_With_Maximum_Ones {

    // Returns the index of the row with maximum number of 1s
    // along with the count of 1s in that row
    public static int[] rowAndMaximumOnes(int[][] mat) {

        int maxOnes = 0;     // maximum number of ones found
        int rowIndex = 0;   // index of the row with maximum ones

        // Traverse each row
        for (int i = 0; i < mat.length; i++) {

            int count = 0;

            // Count number of 1s in current row
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }

            // Update result if current row has more 1s
            if (count > maxOnes) {
                maxOnes = count;
                rowIndex = i;
            }
        }

        return new int[]{rowIndex, maxOnes};
    }
}
