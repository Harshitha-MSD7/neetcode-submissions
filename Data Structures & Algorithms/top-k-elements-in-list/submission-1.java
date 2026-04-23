class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int d = nums.length;
        Arrays.sort(nums);
        int[] output = new int[k];
        int[][] arr = new int[d][2];
        int n = nums[0];
        int m = 0;
        int p = 0;

        for(int i=0; i<d; i++) {
            m = nums[i];
                                                                                
            if (m == n) {
                arr[p][0] = n;
                arr[p][1]++;
            } else {
                n = m; // upadated to next element
                p++;
                arr[p][0] = n;
                arr[p][1]++;
            }
        }
                                                                                                                                                                                                
        //sorting array by the column
        for (int i = 0; i < d; i++) {
            for (int j = i + 1; j < d; j++) {
                if (arr[i][1] < arr[j][1]) {
                    int[] temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < k; i++) {
            output[i] = arr[i][0];
        }

        return output;
                                                                                                                                                                                                                    
    }
} 