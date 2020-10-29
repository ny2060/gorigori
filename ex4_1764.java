package ex1_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class ex4_1764 {

	
	public static void main(String[] args) throws Exception {
		
		  int a,b;
		  HashSet<String> hs=new HashSet<String>();
		  ArrayList<String> ans = new ArrayList<String>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		for(int i=0; i<a; i++) {
			//arr1[i]=br.readLine();
			hs.add(br.readLine());
		}
		for(int i=0; i<b; i++) {
			String s=br.readLine();
			if(hs.contains(s)) {
				ans.add(s);
			}
			
		}
		Collections.sort(ans);
		System.out.println(ans.size());
		for(int i=0; i<ans.size(); i++) {
			System.out.println(ans.get(i));
		}

	}
}
