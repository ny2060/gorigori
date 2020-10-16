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

        //���� �����ϴ� ���ð� ��ġ�� �����ϴ� ������ ����Ѵ�.

        Stack<Integer> stack= new Stack<Integer>();

        Stack<Integer> index= new Stack<Integer>();

        

        scan.init();

        num= scan.nextInt();

        

        //stack ù��° ���� �񱳴���� �����Ƿ� ���ڸ��� stack.push ���ݴϴ�.

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

                        //���� ž���� ���� ž �߰�, index ����ϰ� ���簪�� ���ÿ� ����

                        System.out.print(" "+index.peek());

                        stack.push(number);

                        index.push(i);

                        break;

                    }else {

                        //���� ž���� ���� ž �߰�,

                        //���� ž���� ���� ž�� �ʿ� �����Ƿ� ���ÿ��� ����

                        stack.pop();

                        index.pop();

                    }

                }else {    //���� ž���� ���� ž�� ��� ���Ű����� ž�� ����

                    System.out.print(" 0");

                    stack.push(number);

                    index.push(i);

                    break;

                }

            }

        }//end for

    }

    

    //scan�� ��������.

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
