public class ConsOne {
    static int findMaxConsOne(int nums[]){
        int count =0;
        int maxi=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                count++;
            }else{
                count = 0;
            }
            maxi = Math.max(maxi, count);
        }
        return maxi;
    }
    public static void main(String[] args) {
        int nums[]={1,0,1,1,1,1,1,0,1,1};
        int ans = findMaxConsOne(nums);
        System.out.println("the max number of consecutive ones is : "+ans);
    }
}
