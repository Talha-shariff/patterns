class FirstPattern{
    public void pat(){
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public void pat2(){
        for(int i=0; i<5; i++){
            for(int j=0; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public void pat3(){
        for(int i=1; i<5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j + "  ");
            }
            System.out.println();
        }
    }
    public void pat4(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i + "  ");
            }
            System.out.println();
        }
    }
    public void pat5(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<5-i+1; j++){
                System.out.print( " * ");
            }
            System.out.println();
        }
    }
    public void pat6(){
        for(int i=0; i<5; i++){
            // space
            for(int j=0; j<5-i-1; j++){
                System.out.print( " ");
            }
            // stars
            for(int j=0; j<2*i+1; j++){
                System.out.print( "*");
            }
            // space
            for(int j=0; j<5-i-1; j++){
                System.out.print( " ");
            }
            System.out.println();
        }
    }
    public void pat7(){
        for(int i=0; i<5; i++){
            // space
            for(int j=0; j<i; j++){
                System.out.print( " ");
            }
            // stars
            for(int j=0; j<2*5-(2*i+1); j++){
                System.out.print( "*");
            }
            // space
            for(int j=0; j<i; j++){
                System.out.print( " ");
            }
            System.out.println();
        }
    }
    // public void pat8(){
    //     for(int i=1; i<=5; i++){
    //         for(int j=1; j<5-i+1; j++){
    //             System.out.print(j + " ");
    //         }
    //         System.out.println();
    //     }
    // }
    public void pat9(){
         
        for(int i=0; i<=2*5-1; i++){
            int stars = i;
            // star values is updated with reduction
            if(i>5) stars = 2*5-i;
                for(int j=0; j<stars; j++){
                    //  here the j prints the star var value
                    System.out.print( "*");
                } 
            System.out.println();
        }
    }
    public void pat10(){
        int s = 1;
        for(int i=0; i<=5; i++){
            if(i%2==0){
                s=1;
            }else{
                s=0;
            }
            for(int j=0; j<i; j++){
                System.out.print(s + " ");
                 s = 1-s;
            }
            System.out.println();
        }
    }
    public void pat11(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<5-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public void pat12(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<5-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public void pat13(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<5-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public void pat14(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<5-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
public class Patt1{
    public static void main(String[] args) {
        FirstPattern obj = new FirstPattern();
        //  obj.pat();
        //  obj.pat2();
        //  obj.pat3();
        //  obj.pat4();
        //  obj.pat5();
        //  obj.pat6();
        //  obj.pat7();
        //   obj.pat9();
          obj.pat10();
    }
}