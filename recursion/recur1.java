// import java.util.Scanner;
 
public class recur1 {
     static  void   print(int i,int n){
        if(i>n)  return ;
        System.out.println("Mohammed Talha Shariff ");
          print(i+1, n); 
     }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // System.out.println(n);
        // int n = 7;
        print(1,7); 
    }
}
