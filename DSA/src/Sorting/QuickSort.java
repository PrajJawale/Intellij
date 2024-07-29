package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 9, 7};
        QuickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void QuickSort(int[] arr , int start , int end){
        if(start>=end){
            return;
        }
        int pivot = partion(arr,start,end);
        QuickSort(arr,start,pivot-1);
        QuickSort(arr,pivot+1,end);
    }

    public static int  partion(int[] arr , int  start , int end){
        int pivot = arr[start];
        int count = 0;
        for (int i = start+1; i <=end ; i++) {
            if(arr[i]<=pivot){
                count ++;
            }
        }
         // to get the correct pivot position
         int pivotIndex = start+count;
         swap(arr,start,pivotIndex);

        //arrange the left and right element which is smaller and greater than the pivot
        int i = start;
        int j = end;

        while(i<pivotIndex&& j>pivotIndex){
            while (arr[i]<=pivot){
                i++;
            }
            while (arr[j]>pivot){
                j--;
            }

            if(i<pivotIndex&& j>pivotIndex){
                swap(arr,i,j);

            }

        }
        return pivotIndex;


    }


    static void swap(int[] arr, int start , int end){
        int temp = arr[start];
        arr[start]= arr[end];
        arr[end] = temp;
    }
}
