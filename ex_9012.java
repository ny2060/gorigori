package ex1_1;

import java.util.Scanner;

public class ex_9012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		//String vps=sc.nextLine().trim();
		char[] arr = (sc.nextLine()).toCharArray();
		//String vps[]=null;
		int i=0;
		
		
		
		for(int j=0;j<arr.length;j++) {
			//System.out.println(vps[j]);
			if(arr[j]=='(') {
				i+=1;
			}else {
				i-=1;
			}
			
			
		}
		
		if(i==0) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}

	}

}
