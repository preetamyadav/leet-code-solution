class Solution {
    public int twoCitySchedCost(int[][] costs) {
        
        int costOfVisitCityA = 0;
        int[] diffOfCityB = new int[costs.length];
        for(int i =0; i < costs.length;i++){
            costOfVisitCityA = costOfVisitCityA+ costs[i][0];
            diffOfCityB[i] = costs[i][1] - costs[i][0];
        }
        Arrays.sort(diffOfCityB);
        
        int maxDiff =0;
        for(int j =0; j < costs.length/2 ; j++){
            maxDiff = maxDiff + diffOfCityB[j];
        }
        
        return costOfVisitCityA+maxDiff;
        
    }
}