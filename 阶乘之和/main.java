package 阶乘之和;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        getSum(n);
        System.out.println(getSum(n));
    }
    public static int getSum(int num){
        if(num==1)
            return 1;
        return getJc(num)+getSum(num-1);
    }
    public static int getJc(int num){
        if(num==1)
            return 1;
        return num*getJc(num-1);
    }
}
