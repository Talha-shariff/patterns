
import java.util.HashSet;

public class RmvDupEle {
//brute force approach to remove the duplicate elements from the array
public static void main(String[] args) {
    int [] nums= {1,1,2,2,2,3,3,3,3,3,4,4,4};
    int n = remove(nums);
    System.out.println("the array after removing the dupicate eleements is ");
    for(int i=0;i<n ;i++){
        System.out.print( nums[i]+" " );
    }
    System.out.println();
    int o = removeDuplicates(nums);
    System.out.println("the array after removing the dupicate eleements using the optimal approach is ");
    for(int i=0;i<n ;i++){
        System.out.print( nums[i]+" " );
    }

}  
//this below code is the optimal solution for the following
 public static int removeDuplicates(int[] nums) {
    int i =0 ;
    for(int j =1; j<nums.length; j++){
        if(nums[i]!= nums[j]){
            i++;
            nums[i]=nums[j];
        }

    }
    return i+1;
    } 
public static int remove(int []nums){
    
    HashSet<Integer> st = new HashSet<>();
     for(int i=0; i<nums.length; i++){
        st.add(nums[i]);
     }
     int k=st.size();
     int j=0;
     for(int x:st){
        nums[j++]=x;
     }
return k;
} 
}
