package 基本查找算法;

/*public class main {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int num=35;
        for (int i = 0; i < arr.length; i++) {
            if(num==arr[i]){
                System.out.println("该数组中存在目标元素");
                return;
            }
        }
        System.out.println("不存在该元素");

    }
}*/

public class main{
    public static void main(String[] args) {
        //现在有一个数组，要求返回数组中存在的目标元素的下表，考虑重复数字，返回多个下标
        //可以利用数组存储多个返回值，在主函数中再分离
        int a=10;
        int[] arr={10,2,3,4,5,6,7,8,9,10};
        int[] result=new int[arr.length];
        result=seek(arr,a);
        if(result[arr.length-1]!=0){
            System.out.println("该目标在数组中的位置下标分别为：");
            for (int i = 0; i < result[arr.length - 1]; i++) {
                System.out.print(result[i]+"\t");
            }
        }else if(result[arr.length-1]==0){
            System.out.println("未查找到该元素");
        }
    }
    public static int[] seek(int[] arr,int a){
        int[] re=new int[arr.length];
        int k=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==a){
                re[k]=i;
                k++;
            }
        }
        re[arr.length-1]=k;
        return re;
    }
}
