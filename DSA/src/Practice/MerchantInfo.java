package Practice;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MerchantInfo {
    ArrayList<Merchant> list = new ArrayList<>();
    ArrayList<Merchant> merchant(){
        list.add(new Merchant("prajwal",1,"kopargaon"));
        list.add(new Merchant("prajwal1",2,"kopargaon1"));
        list.add(new Merchant("prajwal2",3,"kopargaon2"));
        return list;
    }
}
