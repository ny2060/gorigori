package ex1_1;

import java.util.Scanner;

public class ex10_1463 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] dp = new int [n+1];
        
        dp[0] = 0;
        dp[1] = 0;
        
        for(int i=2; i<=n; i++) {
            dp[i] = dp[i-1]+1; //n이 나누어떨어지는 것과 관계없는 n-1을 일단 dp[i]에 넣어둔다.
            if(i%2 == 0) dp[i] = Math.min(dp[i/2]+1, dp[i]); 
            if(i%3 == 0) dp[i] = Math.min(dp[i/3]+1, dp[i]);
        }
        System.out.println(dp[n]);


	}

}
