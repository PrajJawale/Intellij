import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        String st = "#Java By Kiran";
        int count = 0;
        for(int i = 0 ; i< st.length();i++){
            char ch = st.charAt(i);
            if(((int)ch>=65 && (int)ch<=90)  || ((int)ch>=97 && (int)ch<=122)) {
                count+=1;
            }
        }

        System.out.println(count);





    }




}
