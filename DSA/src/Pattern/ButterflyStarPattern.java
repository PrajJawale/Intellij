package Pattern;

public class ButterflyStarPattern {
    public static void main(String[] args) {
        int n = 5;

         // upper half

         for(int i = 1 ; i<=n; i++){

           //print * before the spaces
           for(int j = 1;j<=i;j++){
               System.out.print("*");
           }

           int spaces = (n-i)*2;
           for(int j = 1 ; j<=spaces;j++){
               System.out.print(" ");
           }

           //after spaces star
           for(int j = 1; j<=i;j++){
               System.out.print("*");
           }

             System.out.println();

         }
         //lower part
         for(int i = n ; i>=1;i--){
             for(int j = 1 ; j<=i ; j++){
                 System.out.print("*");
             }

             int spaces = (n-i)*2;
             for (int j = 1; j <=spaces ; j++) {
                 System.out.print(" ");
             }

             for (int j = 1; j <=i ; j++) {
                 System.out.print("*");
             }
             System.out.println();
         }




        }
    }


