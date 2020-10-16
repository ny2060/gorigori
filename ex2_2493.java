package ex1_1;
import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

import java.util.Scanner;

import java.util.Stack;

import java.util.StringTokenizer;
public class ex2_2493 {
	public static void main(String [] args){

        //Scanner scan= new Scanner(System.in);

        

        int num, number, top;

        //값을 저장하는 스택과 위치를 저장하는 스택을 사용한다.

        Stack<Integer> stack= new Stack<Integer>();

        Stack<Integer> index= new Stack<Integer>();

        

        scan.init();

        num= scan.nextInt();

        

        //stack 첫번째 값은 비교대상이 없으므로 받자마자 stack.push 해줍니다.

        number= scan.nextInt();

        stack.push(number);

        index.push(1);

        System.out.print("0");

        

        for(int i=2; i<=num; i++) {

            number= scan.nextInt();

            while(true) {

                if(!stack.empty()) {

                    top= stack.peek();

                    if(top > number) {

                        //현재 탑보다 높은 탑 발견, index 출력하고 현재값은 스택에 저장

                        System.out.print(" "+index.peek());

                        stack.push(number);

                        index.push(i);

                        break;

                    }else {

                        //현재 탑보다 작은 탑 발견,

                        //현재 탑보다 작은 탑은 필요 없으므로 스택에서 제거

                        stack.pop();

                        index.pop();

                    }

                }else {    //현재 탑보다 높은 탑이 없어서 수신가능한 탑이 없음

                    System.out.print(" 0");

                    stack.push(number);

                    index.push(i);

                    break;

                }

            }

        }//end for

    }

    

    //scan을 재정의함.

    static class scan {

        private static BufferedReader br;

        private static StringTokenizer st;

        

        static void init() {

            br = new BufferedReader(new InputStreamReader(System.in));

            st = new StringTokenizer("");

        }

 

        static String next() {

            while (!st.hasMoreTokens()) {

                try {

                    st = new StringTokenizer(br.readLine());

                } catch (IOException e) {

                }

            }

            return st.nextToken();

        }

 

        static int nextInt() {

            return Integer.parseInt(next());

        }

    }
}
