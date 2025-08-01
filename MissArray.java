
public class MissArray {
    public static int missingNumber(int []nums, int n) {
//  int n=nums.length;
        for(int i=1; i<=n; i++){
            int flag =0 ;
            for(int j=0; j<n-1; j++){
                if(nums[j]==i){
                    flag =1;
                    break;
                }
            }
                if(flag==0)
                return i;
        }
            return -1;
}
/* code using the better approach which uses the hashmaps
 *       int n = nums.length;
       int hash[] = new int[n+1];
       for(int i=0; i<=n-1; i++){
        hash[nums[i]]++;
       }
       for(int i=0; i<=n; i++){
        if(hash[i]==0){
            return i ;
        }
       }
       return -1;
}
*/
    //optimal solution 1 is where we doing the sum{
    /*
     * public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum = (n*(n+1))/2;
        int s2 =0;
        for(int num : nums){
            s2+=num;
        }
        int miss = sum-s2;
        return miss;
}
        //optimal approach using the xor logic
        int n = nums.length;
        int xor1=0, xor2=0;
      for(int i=0; i<=n-1; i++){
        xor2^= nums[i];
        xor1^= (i+1);
      }
     
     return(xor1 ^ xor2);     
}
    */

    public static void main(String args[]) {
        int n = 5;
        int nums[] = {1, 2, 4, 5};

        int ans = missingNumber(nums, n);
        System.out.println("The missing number is: " + ans);
    }

}