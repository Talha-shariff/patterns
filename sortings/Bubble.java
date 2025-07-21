//package sortings;
import java.util.Scanner;

public class Bubble {
//package sortings;
    static void bubbleSort(int arr[], int n ){
        for(int i=n-1; i>=0; i--){
            //didSwap is used for the optimization
            int didSwap = 0 ;
            for(int j = 0; j<=i-1; j++){
                if(arr[j]>arr[j+1]){
                int temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp ;
                didSwap = 1 ;
        }
    }
    //if any swap happens then upper loops are printed if no swaps happens then the loop breaks
    if(didSwap==0){
        break ;
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
        bubbleSort(arr, n);

        System.out.print("the sorted array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
      //  System.out.println( );
    }
}

