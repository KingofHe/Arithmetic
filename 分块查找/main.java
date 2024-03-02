package 分块查找;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //块内无序，块间有序
        //对于一个无序数组，要查找目标元素，将该数组分为若干块，一般为N^0.5块
        int[] arr={16,5,9,12,21,18,
                   32,23,37,26,45,34,
                   50,48,61,52,73,66};
        Block b1=new Block(21,0,5);
        Block b2=new Block(45,6,11);
        Block b3=new Block(73,12,17);
        Block[] blocks={b1,b2,b3};
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您要查寻的数字");
        number=sc.nextInt();
        int index=getIndex(arr,blocks,number);
        if(index==-1){
            System.out.println("未查找到该元素");
        }else{
            System.out.println("该元素的下标为："+index);
        }
    }
    public static int getIndex(int[] arr,Block[] blocks,int num){
        int index=inget(blocks,num);
        if(index==-1)
            return -1;
        for(int i=blocks[index].getStartIndex();i<=blocks[index].getEndIndex();i++){
            if(arr[i]==num)
                return i;
        }
        return -1;
    }
    public static int inget(Block[] blocks,int num){
        for (int i = 0; i < blocks.length; i++) {
            if(blocks[i].getMax()>=num)
                return i;
        }
        return -1;
    }
}
