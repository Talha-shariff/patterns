public class Recursion {
    static int count = 0;
    static void iterate(){
        if(count == 5) return;
        System.out.println(count);
        count++;
        iterate();

    }
    public static void main(String[] args) {
        iterate();
    }
}
