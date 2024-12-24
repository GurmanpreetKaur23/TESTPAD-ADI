import java.util.ArrayList;

class Result 
{
    // Function to check if placing a queen at board[row][col] is safe
    int isSafe(int board[][], int row, int col, int N) 
    { 
        // Check the row to the left
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return 0;
            }
        }

        // Check the upper diagonal on the left
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return 0;
            }
        }

        // Check the lower diagonal on the left
        for (int i = row, j = col; i < N && j >= 0; i++, j--) {
            if (board[i][j] == 1) {
                return 0;
            }
        }

        return 1; // Safe to place the queen
    } 

    // Utility function to solve the N-Queens problem
    boolean solveNQUtil(int board[][], int col, int N, ArrayList<ArrayList<Integer>> sol)
    {
        // Base case: If all queens are placed
        if (col >= N) {
            // Save the solution
            ArrayList<Integer> currentSol = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    currentSol.add(board[i][j]);
                }
            }
            sol.add(currentSol);
            return true;
        }

        boolean res = false;

        // Consider each row in the current column
        for (int i = 0; i < N; i++) {
            // Check if it's safe to place the queen
            if (isSafe(board, i, col, N) == 1) {
                // Place the queen
                board[i][col] = 1;

                // Recur to place the rest of the queens
                res = solveNQUtil(board, col + 1, N, sol) || res;

                // Backtrack and remove the queen
                board[i][col] = 0;
            }
        }

        return res;
    } 
}
