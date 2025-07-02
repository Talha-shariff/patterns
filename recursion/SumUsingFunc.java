public class SumUsingFunc {
    static int add(int n){
        if(n==0){
            return 0 ;
        }
        return n+add(n-1);
    }
    public static void main(String[] args) {
        int n = 20;
        System.out.println(add(n));
    }
}
