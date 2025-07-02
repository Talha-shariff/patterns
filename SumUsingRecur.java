public class SumUsingRecur {
    static void add(int i,int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
add(i-1, sum+i);
    }
    public static void main(String[] args) {
        add(10,0);
    }
}
