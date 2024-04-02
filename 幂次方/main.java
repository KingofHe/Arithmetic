package 幂次方;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            System.out.println(getRe(num));
    }
    public static String getRe(int n){
        if(n==0)
            return "0";
        else if (n==2)
            return "2";
        else {
            String re = null;
            int count = 0;
            while (n > 0) {
                if (n % 2 == 1) {
                    if(count==1) {
                        if (re == null)
                            re = "2";
                        else re=2+"+"+re;
                    }else{
                        if(re==null)
                            re=2+"("+getRe(count)+")";
                        else re=2 + "(" + getRe(count) + ")"+"+"+re;
                    }


                }
                n = n >> 1;
                count++;
            }
            return re;
        }
    }
}





