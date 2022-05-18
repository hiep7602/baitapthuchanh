import java.util.HashMap;
import java.util.Set;
import java.util.Map;
public class App86 {
    public static void main (String[]args){
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("CSDL", "Cơ sở lập trình");
        hashMap.put("C++", "C++");
        hashMap.put("PHP", "PHP");
        hashMap.put("C#", "C#");
        hashMap.put("Python", "Python");

        Set<Map.Entry<String, String>> setHashMap = hashMap.entrySet();

        System.out.println("Các entry có trong setHashMap:");
        System.out.println(setHashMap);
    }
}
