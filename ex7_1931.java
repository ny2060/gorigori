package ex1_1;

import java.util.Arrays;
import java.util.Scanner;

public class ex7_1931 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Conference [] arr = new Conference[n];
        
        for(int i=0; i<n; i++)
            arr[i] = new Conference(scan.nextInt(), scan.nextInt());
        
        Arrays.sort(arr);
        
        int cnt = 1;
        int end = arr[0].end;
        for(int i=1; i<n; i++) {
            if(arr[i].start>=end) {
                cnt++;
                end = arr[i].end;
            }
        }
        
        System.out.println(cnt);
    
    }
 
}
class Conference implements Comparable<Conference> {
    int start;
    int end;
    
    public Conference(int start, int end) {
        this.start = start;
        this.end = end;
    }
 
    @Override
    public int compareTo(Conference o) {
        int r = this.end - o.end;
        if(r==0)
            r = this.start - o.start;
        return r;
    }


	

}
