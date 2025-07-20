package sortings;


import java.util.Scanner;

//package sortings;
public class Selection {
    static void selectionSort(int arr[], int n ){
        for(int i=0; i<=n-2; i++){
            int min = i ;
            for(int j = i; j<=n-1; j++){
                if(arr[j]<arr[min]){
                    min = j ;
                }
            }
            int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp ;
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
        selectionSort(arr, n);

        System.out.print("the sorted array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
      //  System.out.println( );
    }
}
