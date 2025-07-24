/*brute approach -> {2,3,5,6,7,7} now to find the slargest, 
 * first sort the array, we can have the 2nd element as same as the Flargest
 * Flargest = n-1;
 * Slargest = n-2 to 0 where we can compare the slargest with flargest
 * if slargest ele = flargest we dont conisder it to be the slargest
 * and if slargest = flargest then we say that we have the slargest
 * {1,7,7,7,7,,77,7,7,7,7,} then we can set slargest to -1 ; break
 */

/* better appraoch -> {2,3,5,6,7,7} now to find the largest ele
 * first we can find the largest element where largest variable which holds the arr[0] and it iterates with the array 
 * if arr[[i]>largest then largest = arr[i]; and we have the first largest
 * and for the second largest = -1 where it iterates to the array elements and it checks if the [slargest ele = largest]
 * if slargest = largest then skip
 * and if slargest!= largest then 
 * if(arr[i]>slargest && arr[i]!=largest){
 * slargest =arr[i]
 * }
 * time complexity
 * for the larges element it is O(n) and for the second largest ele it is O(n)
 * O(n+n) = O(2n)
 */
//optimal approach
//finding the largest and the slargest and smallest and the ssmallest
class SecondLEle{
    public static int  largest(int []arr, int n){
        int largest =arr[0];
        int slargest = -1;
        for (int i = 1; i < n; i++) {
            if(arr[i]>largest){
                slargest = largest ;
                largest= arr[i];
            }else if(arr[i]<largest && arr[i]> slargest){
                slargest = arr[i];
            }
        }
    
        return slargest;
    }
    public static int Smallest(int[ ]arr, int n){
        int smallest = arr[0];
        int ssmallest = Integer.MAX_VALUE;
         for (int i = 1; i < n; i++) {
             if(arr[i]<smallest){
                ssmallest = smallest;
                smallest = arr[i];
             }else if (arr[i]!= smallest && arr[i]<ssmallest) {
                 ssmallest = arr[i];
             }
         
            }
            return ssmallest;
    }
    public static void main(String[] args) {
int [] arr ={2,3,4,5,12,34,5,6};
int n = arr.length ;
        int slarge = largest(arr, n);
        int ssmall = Smallest(arr, n);
        System.out.println("second large ele is " +slarge+"and the second small ele is "+ssmall);
    }
} 