package ex2;

import java.util.LinkedList;
import java.util.Scanner;

public class ex2_1966 {
	
	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in); 
		int testcase = sc.nextInt(); 
		
		int n, m, count;
		
		for(int i=0; i<testcase; i++) { 
			
			LinkedList<int[]> queue = new LinkedList<>();
			count = 0; 
			n=sc.nextInt(); //입력받는 개수 
			
			m=sc.nextInt();
			for(int j=0; j<n; j++) 
				queue.add(new int[] {j, sc.nextInt()});
			// 인덱스, 중요도 입력받기
			
			
			while(!queue.isEmpty()){ 
				// 큐가 빌 때까지
				int[] now = queue.poll();
				boolean able = true;
				
				
				for (int[] q : queue) 
					if(q[1] > now[1]) able = false;
				if (able) {
					count++; if (now[0]==m) break; 
					
				} 
				else 
					queue.add(now);
				} 
			
			System.out.println(count); 
				} 
		}
			
		
	


}
