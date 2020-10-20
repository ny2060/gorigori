package ex1_1;

import java.util.Arrays;
import java.util.Scanner;

public class ex3_2309 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		int tall=0;
		
		int []a = new int[9];
		int []b = null;

		for(int i=0;i<9;i++) {
		
		int n = sc.nextInt();
		 a[i]=n;
		 tall+=a[i];
		 
		
		}
		
		for(int j=0;j<a.length;j++) {
			for(int z=0;z<9;z++) {
				if(j==z)continue;
				tall-=a[j]+a[z];
				if(tall==100) {
						a[j]=0;
						a[z]=0;
					
				 }
				
			}
			
			 
		}
		
		Arrays.sort(a);
		
		for(int i=0;i<9;i++) {
			if(a[i]!=0) {
			System.out.println(a[i]);
			}
		}
	}

}
