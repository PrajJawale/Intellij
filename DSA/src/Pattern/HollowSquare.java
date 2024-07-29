package Pattern;

import java.util.Scanner;

public class HollowSquare {

    //*****
    //*   *
    //*   *
    //*   *
    //*****

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            // this is for the column
           if(i==0 || i==n-1){
               for (int j = 0; j < n; j++) {
                   System.out.print("*");
               }

           }
           else{
               for (int j = 0; j < n; j++) {
                   if(j==0 || j==n-1){
                       System.out.print("*");
                   }
                   else{
                       System.out.print(" ");
                   }
               }
           }
            System.out.println();
        }
    }
}
