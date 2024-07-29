package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 9, 7};
        mergeSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));

      }

    public static void mergeSort(int[] arr, int start, int end) {
        if(start>=end-1){
            return;
        }

        int mid = start+(end-start)/2;

        mergeSort(arr, start,mid);
        mergeSort(arr,mid,end);

        merge(arr,start,mid,end);

    }

    public static void merge(int[] arr , int start , int mid , int end){
        //take the size of left arr
        int n1 = mid - start;
        // take the size of right arr
        int n2 = end-mid;

        // to take the temporary array

        int[] left = new int[n1];
        int[] right = new int[n2];

        //copying the element in the left array
        for (int i = 0; i <n1 ; i++) {
            left[i] = arr[start+i];
        }

        //copying the element in the right array
        for (int i = 0; i <n2 ; i++) {
            right[i] = arr[mid+i];
        }

        int i = 0;
        int j = 0;
        int k = start;

        while(i<n1 && j<n2){
            if(left[i]<right[j]){
                arr[k]= left[i];
                i++;
                k++;
            }
            else{
                arr[k]= right[j];
                j++;
                k++;
            }
        }

        //copying the remaining the element
        while(i<n1){
            arr[k++] = left[i++];
        }

        while(j<n2){
            arr[k++] = right[j++];
        }
    }

}
