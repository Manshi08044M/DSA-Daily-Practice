import java.util.*;

/*
 Day: 1
 Problem Name: N-Queens
 Topic: Backtracking
 Platform: LeetCode
 Approach: Backtracking with Hashing (Columns & Diagonals)
 Time Complexity: O(N!)
 Space Complexity: O(N^2)
*/

public class N_Queens {

    // Stores all valid board configurations
    List<List<String>> result = new ArrayList<>();

    // Main function to solve N-Queens problem
    public List<List<String>> solveNQueens(int n) {

        char[][] board = new char[n][n];

        // Initialize board with '.'
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        // Arrays to track used columns and diagonals
        boolean[] cols = new boolean[n];        // column check
        boolean[] diag1 = new boolean[2 * n];   // row - col + n
        boolean[] diag2 = new boolean[2 * n];   // row + col

        backtrack(0, n, board, cols, diag1, diag2);
        return result;
    }

    // Backtracking function to place queens row by row
    private void backtrack(int row, int n, char[][] board,
                           boolean[] cols, boolean[] diag1, boolean[] diag2) {

        // Base case: all queens are placed
        if (row == n) {
            result.add(construct(board));
            return;
        }

        // Try placing queen in each column of current row
        for (int col = 0; col < n; col++) {

            int d1 = row - col + n; // diagonal index
            int d2 = row + col;     // diagonal index

            // Skip if column or diagonal is already occupied
            if (cols[col] || diag1[d1] || diag2[d2]) continue;

            // Place queen
            board[row][col] = 'Q';
            cols[col] = diag1[d1] = diag2[d2] = true;

            // Recurse to next row
            backtrack(row + 1, n, board, cols, diag1, diag2);

            // Backtrack: remove queen
            board[row][col] = '.';
            cols[col] = diag1[d1] = diag2[d2] = false;
        }
    }

    // Converts board to list of strings
    private List<String> construct(char[][] board) {

        List<String> res = new ArrayList<>();

        for (char[] row : board) {
            res.add(new String(row));
        }

        return res;
    }
}
