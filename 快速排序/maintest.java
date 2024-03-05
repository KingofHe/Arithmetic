package 快速排序;

public class maintest {
    public static void main(String[] args) {
        int[] arr={4,3,7,1,9,8,2};
        quickSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }

    }
    public static void quickSort(int[] arr,int i,int j){
        int start=i;
        int end=j;
        if(start>end){
            return;
        }
        int baseNumber=arr[i];
        while(start!=end){
            while(true){
                if(end<=start || arr[end]<baseNumber)
                    break;
                end--;
            }
            while(true){
                if(end<=start || arr[start]>baseNumber)
                    break;
                start++;
            }
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
        int tamp=arr[i];
        arr[i]=arr[start];
        arr[start]=tamp;
        quickSort(arr,i,start-1);
        quickSort(arr,start+1,j);


    }
}
