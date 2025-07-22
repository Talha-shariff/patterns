
import java.util.ArrayList;
import javax.sound.midi.MidiMessage;

 class Solution {
    private static void merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;

        while (left<=mid && right<=high) {
             if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
             }else{
                temp.add(arr[right]);
                right++;
             }
         }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        for(int i=low; i<=high; i++){
            arr[i]=temp.get(i-low);
        }
            
        }
    
        public static void mergeSort(int[] arr ,int low, int high){
            if(low>=high)
                return;
          int mid = (low + high) /2 ;
          mergeSort(arr, low, mid);
          mergeSort(arr, mid+1, high);
          merge(arr, low, mid, high);
        
        }
    }
    public class Merge{

        public static void main(String[] args) {
            int n = 8;
            int arr [] = {4,3,2,14,5,6,8,9};
            System.out.println("before unsorted array ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            Solution.mergeSort(arr, 0, n-1);
            System.out.println("after sorted array is ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
    
