import java.util.*;
class LargestElement{
    public static void main(String[] args){
        ArrayList <Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array ");
        int n = sc.nextInt();
        System.out.println("enter the " + n + "elements to the array");   
        for(int i=0 ; i<n; i++){
            arr.add(sc.nextInt());
        }
        //here coz we are using the collections 
        /*
         * 1. arr[i] -> arr.add(sc.next int)for the input
         * and 2.arr[i] -> arr.get(i) .. to get all the elements from the i/p
         * 3. arr.length() -> arr.size()
         *          */
        int largest = arr.get(0);
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i)> largest){
                largest = arr.get(i);
            }
        }
        System.out.println("largest element is " +largest);
    }
}