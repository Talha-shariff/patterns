public class SortArray {
     //int nums[] = new int[n];
    public boolean check(int[] nums ) {
        int n=nums.length;
        int count =0 ;
        for(int i=0; i<n; i++){
            int next = (i+1)%n;
            if(nums[i]>nums[next]){
            count++;
            }else{

              //  return false;
            }
        
        }
    return count<=1;
}
public static void main(String[] args) {
    //int [] nums = {1,2,3,4,5,6};
    int [] nums = {1,2,3,4,5,6,8,9,3,2,3};
    SortArray c = new SortArray();
     
     System.out.println(c.check(nums));
}
}
