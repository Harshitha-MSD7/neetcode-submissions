class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       // Brute Force 
        // Find max
        int max = piles[0];

        for(int j=0; j<piles.length; j++){
            max = Math.max(piles[j], max);
        }
        int min = 0;

        // Running a binary search on the rate
        int left = 1;
        int right =  max;
        int ans = 0;
       while(left<=right){
        int mid = left + (right-left) / 2;
        //int req_time = reqtime(i, piles); 
        // eating rate is too low then more # hours 
        // increase the eating rate
        if(reqtime(piles, mid) > h){
            left = mid + 1;
        }

        // This is a possible answer
        else if(reqtime(piles, mid) <= h) {
            ans = mid;
            right = mid - 1; 
        }
       }

       return ans;

    }

    public int reqtime(int[] piles, int rate){
        int hours = 0;

        for(int i = 0; i<piles.length; i++){
            hours += (int) Math.ceil((double) piles[i] / rate);
        }
        return hours;
    }
}
