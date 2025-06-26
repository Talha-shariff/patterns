public class backtrack2 {

    static void print(  int n){
        if(n>10)
        return;
// here iam backtracking ,, basically calling the function first and then printing the statement
print( n+1);
System.out.println(n);
// first the function call thing is completed then from backtracking the values are printed
    }    
    public static void main(String[] args) {
        int n = 1;
        print(  n);
    }
}

