//the following program is the optimal solution previous lrotate follows the brute approach
public class LrotateByD {
   public static void reverse(int arr[], int s, int e){
        while(s<=e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }

    }
    static void rotatearray(int arr[], int k , int n){
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k = 3;
        int n =7 ;
        rotatearray(arr, k, n);
        System.out.println("after rotating the array :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    } 
}
