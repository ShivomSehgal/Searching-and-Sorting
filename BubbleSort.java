import java.util.*;

public class BubbleSort {

    public static void bubble(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j+1]<arr[j]){
                    int temp =arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args){
        int[] arr={1,4,6,8,9,7,3,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
