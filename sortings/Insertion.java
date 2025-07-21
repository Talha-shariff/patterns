//package sortings;

import java.util.*;

public class Insertion {
    static void insertionSort(int arr[], int n){
        for (int i = 0; i <= n-1; i++) {
            int j =i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp ;
            j--;
            }
        }
    }
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements of the array: ");
        int n = sc.nextInt();

        int [] arr = new int[n];
         System.out.print("enter the unsorted array :");
        for(int i=0; i<n; i++){
           
             arr[i] = sc.nextInt();
        }
        insertionSort(arr, n);

        System.out.print("the sorted array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
      //  System.out.println( );
    }
}



