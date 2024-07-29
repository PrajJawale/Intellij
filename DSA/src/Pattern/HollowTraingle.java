package Pattern;

public class HollowTraingle {
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {
            if(i<5){
                // for the spaces
                for(int j = 1;j<=5-i ; j++){
                    System.out.print(" ");
                }

                // for the star pattern

                for(int j = 1 ; j<=1;j++){
                    System.out.print("*");
                }

                //for the middle spaces

                for (int j = 1; j <= 2 *(i-1) ; j++) { // spaces are increasig 0 2 4 6 8
                    System.out.print(" ");
                }

                // for the
               if(i>1){
                   for(int j = 1 ; j<=1;j++){
                       System.out.print("*");
                   }
               }
            }
            else{
                for (int j = 1; j <=5 ; j++) {
                    System.out.print("*"+" ");
                }
            }


            System.out.println();

        }
    }
}
