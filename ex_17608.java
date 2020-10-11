package ex2;

import java.util.Scanner;

public class ex_17608 {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		int[] array=new int[num];
		for(int i=0;i<num;i++) {
			array[i]=sc.nextInt();
		}
		int count=1;
		int max=array[array.length-1];//맨뒤에거 시작
		
		for(int j=array.length-2;j>=0;j--) {
			//제일뒤에서 두번째거부터 시작해야함
			if(array[j]>max) {
				max=array[j];
				count+=1;
			}
		}
		System.out.println(count);
	}

}
