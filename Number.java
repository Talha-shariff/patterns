public class Number {
    static int findMaxOneNumber(int arr[]){
        int xor =0;
        for(int i=0; i<arr.length; i++){
            xor =  xor ^ nums[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int arr[] ={1,1,2,3,3,5,5};
        int ans = findMaxOneNumber(nums);
        System.out.println("the number which appers once is : " +ans);
    }
    
}
// here the xor is used coz
// xor of same number is 0
// and the single number remains 
// then 0 ^ 2=2 .. hence optimal sol