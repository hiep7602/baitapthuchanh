package COLLECTIONS;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
public class App87 {
    public static void main (String[]args){
        HashMap<String, String> hashMapCity = new HashMap<>();
        hashMapCity.put("HN", "Hà Nội");
        hashMapCity.put("HD", "Hải Dương");
        hashMapCity.put("Th", "Thanh Hóa");
        hashMapCity.put("NA", "Nghệ An");

        System.out.println("Danh sách các thành phố trong hashMapCity:");
        Set<Map.Entry<String, String>> setCity = hashMapCity.entrySet();
        System.out.println(setCity);

        System.out.println("HN: " + hashMapCity.get ("HN"));
        System.out.println("BN:" + hashMapCity.get ("BN"));

        if (hashMapCity.containsValue("Thành phố Hà Nội"));
            System.out.println("Có thành phố Hà Nội trong hashMapCity");
    }
}
