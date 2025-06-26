 // import java.util.Scanner;
 
public class recur2 {
     static  void   print(int i,int n){
        if(i>n)  return ;
        System.out.println(i);
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
