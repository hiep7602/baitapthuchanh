import java.util.HashMap;
import java.util.TreeMap;
public class App78 {
    public static void main(String[]args){
        HashMap<Integer, Float> hashMap1 = new HashMap<>();
        HashMap<Integer, Float> hashMap2 = new HashMap<>();
        HashMap<Double, Double> hashMap3 = new HashMap <>(4, 0.75f);
        HashMap<Float, Integer> hashMap4 = new HashMap<>(new TreeMap<>());
    }
}