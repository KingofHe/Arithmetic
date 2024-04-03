package 车站;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int n=sc.nextInt();
        int m=sc.nextInt();
        int x=sc.nextInt();
        System.out.println(getRe(a,n,m,x));
        
    }
    public static int getRe(int a,int n,int m,int x){
        int A1=getOnnumber(a,1,n-1);
        int A2=getDownnumber(a,1,n-1);
        int A3=getOnnumber(a,0,n-1);
        int A4=getDownnumber(a,0,n-1);
        int n1=A1-A3;
        int n2=A2-A4;
        int a0=(m-A3+A4)/(n1-n2);
        return getOnnumber(a,a0,x-1)-getDownnumber(a,a0,x-1);
    }
    public static int getOnnumber(int a,int a1,int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=getOnNum(a,a1,i);
        }
        return sum;
    }
    public static int getOnNum(int a,int a1,int n){
        if(n==1) return 0;
        else if(n==2) return a1;
        return getOnNum(a,a1,n-1)+getOnNum(a,a1,n-2);
    }
    public static int getDownnumber(int a,int a1,int n){
        int sum=0;
        for (int i = 1; i <=n; i++) {
            sum+=getDoNum(a,a1,i);
        }
        return sum;
    }
    public static int getDoNum(int a,int a1,int n){
        if(n==1) return a;
        else if(n==2) return a1;
        return getOnNum(a,a1,n-1);
    }
    
}
