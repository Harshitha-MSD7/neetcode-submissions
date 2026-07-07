class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // [3][4] matrix
        //3 rows and 4 cols
        int n = matrix[0].length;
        int m = matrix.length;

        // Binary search the rows to find the row where target could belong
        // Binary search that row to check whether target exists

        int top = 0;
        int bottom = m - 1;

        while(top <= bottom){

            // first binary search on the row
            int row = top + (bottom - top) / 2;
            // below 2 conditional statements will get us to the right row
            if (target < matrix[row][0]) {
                bottom = row - 1;
            }
            else if (target > matrix[row][n - 1]) {
                top = row + 1;
            }

            else {
                // found the row range doing BS in that row

                int left = 0;
                int right = n-1;

                while(left <= right){
                    int mid = left + (right - left)/2;

                    if(matrix[row][mid] == target){
                        return true;
                    }

                    else if(matrix[row][mid] < target){
                        left = mid + 1;
                    }

                    else if(matrix[row][mid] > target){
                        right = mid - 1;
                    }

                }

                // we found the right row range but in that  
                // row we were unable to find target

                return false;
            }


        }

        // the row range itself doesn't exist
        return false;
        
    }
}
