public class Fact {
    static double  factorial(int n){
        if (n==0){
// at last the function will have the 0 value where 0! =  1 and if you are trying to return the 0 then anything multiplied with 0 =0
            return 1;
        }

return n*fact(n-1);
    }
    public static void main(String[] args) {
        int n =9;
        System.out.print(factorial(n));
    }
}
