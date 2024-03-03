package 选择排序;

public class miantest {
    public static void main(String[] args) {
        //选择排序原理：对每一个索引的元素依次与其后方所有的元素依次作比较，若前者大那么交换二者
        //每一轮外层循环都能将一个最小的数确定在数组最左侧
        int[] arr={12,4,7,9,23,34,56,8,9,10};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
