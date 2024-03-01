package 二分法查找;

public class realmain {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,7,9,10,23,34,45};
        int num=7;
        int re=seek(arr,num);
        if(re==-1){
            System.out.println("数组中不存在该数");
        }else{
            System.out.println("该数在数组中的下标为："+re);
        }
    }
    public static int seek(int[] arr,int num){
        int min=0;
        int max=arr.length-1;
        int mid=(min+max)/2;
        while(min<=max){
            if(arr[mid]==num){
                return mid;
            }else if(arr[mid]>num){
                max=mid-1;
                mid=(min+max)/2;
            }else if(arr[mid]<num){
                min=mid+1;
                mid=(min+max)/2;
            }
        }
        return -1;
    }
}
