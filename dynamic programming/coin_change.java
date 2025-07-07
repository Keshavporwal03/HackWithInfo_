import java.sql.SQLOutput;

public class coin_change
{
    public static void main(String[] args) {
        int[] c={1,2,5};
        int a=11;
        System.out.println(coinChange(c,a));
    }
    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        for (int i = 0; i <= amount; i++) {
            dp[i] = amount + 1;
        }
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) {
                    if (dp[i] > 1 + dp[i - coin]) {
                        dp[i] = 1 + dp[i - coin];
                    }
                }
            }
        }
        if (dp[amount] > amount) {
            return -1;
        } else {
            return dp[amount];
        }
    }
}
