package Sorting;


import java.util.Arrays;
//time complexity = O(n^2)
//space complexity = O(1)
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,3,5,6,7,1};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static  void BubbleSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            boolean swap = false;
            for(int j = 1 ; j<arr.length-i ;j++){
                if(arr[j-1]>arr[j]){
                    swap(arr,j-1,j);
                    swap = true;
                }
            }
            if(swap== false){
                break;
            }
        }
    }

    public static void swap(int[]arr , int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end]=temp;

    }
}
