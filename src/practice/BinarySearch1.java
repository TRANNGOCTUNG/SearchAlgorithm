package practice;

import java.util.Scanner;

public class BinarySearch1 {
    static int arr[] = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
    static int binarySearch(int arr[],int low, int high,int value){
        if(high >= low){
            int mid = low + (high - low) / 2;
            if(arr[mid] == value)
                return mid;
            if(arr[mid] > value)
                return binarySearch (arr, low,mid-1,value);
            return binarySearch(arr,low,mid +1, value);
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(arr,0, arr.length / 2,10 ));
        System.out.println(binarySearch(arr,7, arr.length -1, 66));

    }

}
