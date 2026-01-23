package Leetcode;
public class RichestCustomerWealth {
    
    public static void main(String[] args) {
        int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(accounts));
    }
    
    static int maximumWealth(int[][] accounts) {
        int maxWealth= 0;
        
        for (int i=0; i<accounts.length; i++){
            int wealth = 0;
            for (int j=0; j<accounts[i].length; j++){
                wealth += accounts[i][j];
            }
            if (maxWealth < wealth){
                maxWealth = wealth;
            }
            

        }
        return maxWealth;
    }
}
