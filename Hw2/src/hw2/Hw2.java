
package hw2;

import java.io.*;

public class Hw2 {

    public static void main(String[] args)throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("輸入費氏數列項數：");
        int fibo_n=Integer.parseInt(buffer.readLine());
        System.out.println("費氏數列第"+fibo_n+"項數之值為"+fib(fibo_n));

    }

    public static long fib(int n) {
        if(n==1||n==2){
            return 1;
        }
        else if(n==0){
            return 0;
        }
        else
            return fib(n-1)+fib(n-2);
    }
    
}
