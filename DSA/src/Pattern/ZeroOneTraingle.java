package Pattern;

public class ZeroOneTraingle {
//    1
//    0 1
//    1 0 1
//    0 1 0 1

    public static void main(String[] args) {
        for (int i = 1; i <=4; i++) {
            if(i%2==0){
               for(int j = 1 ; j<=i;j++){
                   if(j%2==0){
                       System.out.print("1"+" ");
                   }
                   else{
                       System.out.print("0"+" ");
                   }
               }
            }
            else{
                for (int j = 1; j <=i; j++) {
                    if(j%2==0){
                        System.out.print("0"+" ");
                    }
                    else{
                        System.out.print("1"+" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
