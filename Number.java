public class Number {
    static int findMaxOne(int nums[]){
        int xor =0;
        for(int i=0; i<nums.length; i++){
            xor =  xor ^ nums[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int nums[] ={1,1,2,3,3,5,5};
        int ans = findMaxOne(nums);
        System.out.println("the number which appers once is : " +ans);
    }
    
}
