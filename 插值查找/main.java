package 插值查找;

public class main {
    public static void main(String[] args) {
        //该方法实际是二分查找法的改进版，但该方法有使用局限
        //要求当数据分布较均匀时才能更加降低复杂度，当数据分布不均匀时，反而会导致更复杂
        //mid=min+(des-arr[min])/(arr[max]-arr[min]*(max-min)
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
        int mid=min+(num-arr[min])/(arr[max]-arr[min])*(max-min);
        while(min<=max){
            if(arr[mid]==num){
                return mid;
            }else if(arr[mid]>num){
                max=mid-1;
                mid=min+(num-arr[min])/(arr[max]-arr[min])*(max-min);
            }else if(arr[mid]<num){
                min=mid+1;
                mid=min+(num-arr[min])/(arr[max]-arr[min])*(max-min);
            }
        }
        return -1;
    }
}
