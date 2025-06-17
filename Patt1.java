class FirstPattern{
    public void pat(){
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
public class Patt1{
    public static void main(String[] args) {
        FirstPattern obj = new FirstPattern();
         obj.pat();
        
    }
}