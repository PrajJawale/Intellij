public class FindCapitalInString {

    public static void main(String[] args) {
        String st = "prajWaLJaWlae";

        for(int i = 0 ; i<st.length();i++){
            char ch = st.charAt(i);
            if((int) ch > 65 && (int)ch < 97){
                System.out.println(ch);
            }
        }
    }
}
