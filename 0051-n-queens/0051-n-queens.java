class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        int[] rowStatus = new int[n];
        int[] leftDiagonal = new int[(2*n) - 1];
        int[] rightDiagonal = new int[(2*n) - 1];
        List<List<String>> list = new ArrayList<>();

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                board[row][col] = '.';
            }
        }

        helper(board, 0, rowStatus, leftDiagonal, rightDiagonal, list, n);
        return list;
    }

    public void helper(char[][] board, int col, int[] rowStatus, int[] leftDiagonal, int[] rightDiagonal, List<List<String>> list, int n) {
        if (col >= n) {
            // construct board
            list.add(new ArrayList(constructBoard(board)));
            return;
        }

        for (int row = 0; row < n; row++) {
            if (rowStatus[row] == 1 || leftDiagonal[(n-1) + (row-col)] == 1 || rightDiagonal[row+col] == 1)
                continue;
            
            board[row][col] = 'Q';
            rowStatus[row] = 1;
            leftDiagonal[(n-1)+(row-col)] = 1;
            rightDiagonal[row+col] = 1;

            helper(board, col+1, rowStatus, leftDiagonal, rightDiagonal, list, n);

            // back-tracking
            board[row][col] = '.';
            rowStatus[row] = 0;
            leftDiagonal[(n-1)+(row-col)] = 0;
            rightDiagonal[row+col] = 0;
        }
    }

    public List<String> constructBoard(char[][] board) {
        List<String> ans = new ArrayList<>();
        for (char[] chessRow : board) 
            ans.add(new String(chessRow));
        return ans;
    }
}