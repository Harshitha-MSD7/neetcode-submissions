class Solution {
    public boolean isValidSudoku(char[][] board) {
    // Our logic
    // We are going to have 3 HashSets for this problem
    // One for row, one for col and one for the boxes
    // To iterate boxes use (row/3, col/3) logic 

    // Checking columns 
    for(int row = 0; row < 9; row++){
        HashSet<Character> c = new HashSet<>();
        for(int col = 0; col < 9; col++) {
            if (board[row][col] == '.')
                continue;
            else if(c.contains(board[row][col]))
                return false;
            c.add(board[row][col]);
        }        
    }
    
    // Checking rows
    for(int row = 0; row < 9; row++){
        HashSet<Character> r = new HashSet<>(); 
        for(int col = 0; col < 9; col++) {
            if (board[col][row] == '.')
                continue; 
            else if(r.contains(board[col][row]))
                return false; 
            r.add(board[col][row]);
        }        
    }

    // Checking boxes
    for(int row = 0; row < 9; row++){
        HashSet<Character> box = new HashSet<>();
        for(int col = 0; col < 9; col++){
            int boxRow = (row/3)*3 + col/3;
            int boxCol = (row%3)*3 + col%3;
            if(board[boxRow][boxCol] == '.') 
                continue;
            else if(box.contains(board[boxRow][boxCol])) 
                return false;
            box.add(board[boxRow][boxCol]);
            }
    }
    return true;
}
}