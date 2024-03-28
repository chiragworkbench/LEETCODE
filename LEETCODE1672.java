class Solution {
    public int maximumWealth(int[][] accounts) {
        int max_wealth=0;
        for(int[]customer:accounts){
            int current_wealth=0;
            for(int bank:customer){
                current_wealth+=bank;
            }
            max_wealth=Math.max(max_wealth,current_wealth);

        }

        return max_wealth;
        
    }
}
