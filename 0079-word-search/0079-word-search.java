class Solution {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        int indexStr = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == word.charAt(indexStr)) {
                    if (hasWord(board, i, j, indexStr, word))
                        return true;
                }
            }
        }
        return false;
    }

    public boolean hasWord(char[][] board, int currRow, int currCol, int indexStr, String word) {
        if (indexStr >= word.length()) 
            return true;
        else if (currRow < 0 || currRow > board.length-1 || currCol < 0 || currCol > board[0].length-1 || board[currRow][currCol] != word.charAt(indexStr)) 
            return false;
            
        
        char temp = board[currRow][currCol];
        board[currRow][currCol] = '$';
    
        boolean found = hasWord(board, currRow, currCol-1, indexStr+1, word) ||     // checking left neighbour
        hasWord(board, currRow-1, currCol, indexStr+1, word) ||         // checking top neighbour
        hasWord(board, currRow, currCol+1, indexStr+1, word) ||         // checking right neighbour
        hasWord(board, currRow+1, currCol, indexStr+1, word);           // checking bottom neighbour

        board[currRow][currCol] = temp;
        return found;
    }
}