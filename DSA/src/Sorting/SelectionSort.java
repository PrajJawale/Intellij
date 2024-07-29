package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,3,5,6,7,1};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void SelectionSort(int[]arr){
        for (int i = 0; i <arr.length; i++) {
            int max = 0;
            int correctIndex = arr.length-1-i;
            //find the max element in remaining arr and swap with last or index
            for (int j = 1; j < arr.length-i ; j++) {
                if(arr[j]>arr[max]){
                    max = j ;
                }
            }
            swap(arr,max,correctIndex);
        }
    }

    public static void swap(int[] arr , int start ,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
