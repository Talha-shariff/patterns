// import java.util.Scanner;
 
public class recur3 {
     static  void iterate(int i,int n){
        if(i<1)  return ;
        System.out.println(i);
          print(i-1, n); 
     }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // System.out.println(n);
        // int n = 7;
        iterate(7,7); 
    }
}
