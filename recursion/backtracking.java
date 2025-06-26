public class backtracking {
    static void print(int i, int n){
        if(i<1)
        return;
// here iam backtracking ,, basically calling the function first and then printing the statement
print(i-1, n);
System.out.println(i);
// first the function call thing is completed then from backtracking the values are printed
    }    
    public static void main(String[] args) {
        int n = 10;
        print(n, n);
    }
}
