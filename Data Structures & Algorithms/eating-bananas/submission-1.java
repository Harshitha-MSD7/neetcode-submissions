class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       // Brute Force 
        // Find max
        int max = piles[0];
        for(int j=0; j<piles.length; j++){
            max = Math.max(piles[j], max);
        }
        int min = 0;
       for(int i = 1; i<=max; i++){
        //int req_time = reqtime(i, piles);    
        if(reqtime(piles, i) <= h)
            return i;
       }

       return 0;

    }

    public int reqtime(int[] piles, int rate){
        int hours = 0;

        for(int i = 0; i<piles.length; i++){
            hours += (int) Math.ceil((double) piles[i] / rate);
        }
        return hours;
    }
}
