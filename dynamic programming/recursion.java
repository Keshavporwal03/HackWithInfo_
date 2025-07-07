public class recursion
{
    public static void main(String[] args) {
        int[] dp=new int[44];
        int n=10;
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<dp.length;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        System.out.println(dp[n]);
    }

}
