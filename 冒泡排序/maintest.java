package 冒泡排序;

public class maintest {
    public static void main(String[] args) {
        //冒泡排序原理：（按从小到大排序）将前一个元素与后一个元素作比较，若后一个更小则交换两个的位置
        //每一次遍历可以将一个最大的元素移动到数组末尾
        //如此遍历一个循环即可
        int[] arr={1,5,7,13,24,9,56,9,17,36,34,24,23};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
