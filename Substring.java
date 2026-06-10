import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String str1= "abcdef";
		String str2 = "abcdefghi";
		
		int n = str1.length();
		int m = str2.length();
		int maxlen = 0;
		int dp[][] = new int[n+1][m+1];
		for(int i = 1; i<= n; i++){
		    for(int j = 1; j<=m; j++){
		        if(str1.charAt(i-1) == str2.charAt(j-1)){
		            dp[i][j] = dp[i-1][j-1] + 1;
		            if(dp[i][j] > maxlen){
		                maxlen = dp[i][j];
		            }
		            else{
		                dp[i][j] = 0;
		            }
		        }
		    }
		}
		System.out.println(maxlen);

	}
}
