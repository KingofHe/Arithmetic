package 二分法查找;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //使用前提：要求是有序数组排列
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您要查找的整数");
        num=sc.nextInt();
        int index=seek(arr,num);
        if(index==-1){
            System.out.println("该数在数组中不存在");
        }else{
            System.out.println("该数在数组中的下标是："+index);
        }
    }
    public static int seek(int[] arr,int des){
        int index=0;
        if(des>arr[arr.length-1] || des<arr[0]){
            return -1;
        }else if(arr[0]==des){
            return 0;
        }else if(arr[arr.length-1]==des){
            return (arr.length-1);
        }
        int end=arr.length-1;
        int begin=0;
        int mid=(begin+end)/2;
        while(true) {
            if (arr[mid] == des)
                return mid;
            else if (arr[mid] > des) {
                end = mid;
                mid = (begin + end) / 2;
            } else if (arr[mid] < des) {
                begin = mid;
                mid = (begin + end) / 2;
            } else if (end == begin + 1) {
                return -1;
            }
        }
    }
}
