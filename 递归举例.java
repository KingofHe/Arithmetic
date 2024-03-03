package 快速排序;

public class 递归举例 {
    public static void main(String[] args) {
        //求1-100的和
        int sum=getSum(100);
        System.out.println(sum);
        int mul=getMul(5);
        System.out.println(mul);
    }
    public static int getSum(int number){
        if(number==1)
            return number;
        return number+getSum(number-1);
    }
    public static int getMul(int number){
        if(number==1)
            return 1;
        return number*getMul(number-1);
    }
}
