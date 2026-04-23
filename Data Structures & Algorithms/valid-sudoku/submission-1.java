class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        // FAANG level solution with HashMap

        HashMap<Integer, HashSet<Character>> rows = new HashMap<>();
        HashMap<Integer, HashSet<Character>> cols = new HashMap<>();
        HashMap<String, HashSet<Character>> boxes = new HashMap<>();

        for(int r = 0; r < 9; r++) {
            for(int c = 0; c < 9; c++) {
                if(board[r][c] == '.') continue;
                
                char val = board[r][c];
                String boxKey = (r/3) + "," + (c/3);

                // initialize if not exists
                rows.putIfAbsent(r, new HashSet<>());
                cols.putIfAbsent(c, new HashSet<>());
                boxes.putIfAbsent(boxKey, new HashSet<>());

                // check duplicates
                if(rows.get(r).contains(val)) return false;
                if(cols.get(c).contains(val)) return false;
                if(boxes.get(boxKey).contains(val)) return false;

                // add to all three
                rows.get(r).add(val);
                cols.get(c).add(val);
                boxes.get(boxKey).add(val);
            }
        }
        return true;
        
    }
}
