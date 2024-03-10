package 全排列;

public class mian {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        perm(arr,0,arr.length-1);
    }
    public static void perm(int[] arr,int begin,int end){
        if(begin==end){
           print(arr);
        }else{
            for(int i=begin;i<=end;i++){
                swap(arr,begin,i);
                perm(arr,begin+1,end);
                swap(arr,begin,i);
            }
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
}
