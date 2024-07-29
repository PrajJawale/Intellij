package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4,3,5,6,7,1};
        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));


    }

    public static void InsertionSort(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j >0 ; j--) {  //j>0 to avoid j-1 goes into the arrayoutofbound
                //sort the arr until i+1
                //check the arr until i+1 and sort it
                if(arr[j-1]>arr[j]){
                    swap(arr, j-1, j);
                }
                else{
                    break;
                }
            }
        }
    }

    public static void swap(int[]arr , int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end]=temp;

    }
}
