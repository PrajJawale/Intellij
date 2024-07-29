package Pattern;

public class DiamondPattern {
//         *
//        * *
//       * * *
//      * * * *
//       * * *
//        * *
//         *
    public static void main(String[] args) {
       int n = 5;
       for (int i = 1; i<=n;i++){
           for (int j = 1; j <=(n-i)*2; j++) {
               System.out.print(" ");
           }
           for (int j = 1; j <=i; j++) {
               System.out.print("*"+" ");
           }
           System.out.println();
       }
       for (int i = n ; i<=(n*2)-1;i++){
           for(int j = n ; j<=i ; j++){
               System.out.print(" ");
           }
           for (int j = i+1 ; j <=(n*2)-1 ; j++) {
               System.out.print("*"+" ");
           }
           System.out.println();
       }


       }
    }
