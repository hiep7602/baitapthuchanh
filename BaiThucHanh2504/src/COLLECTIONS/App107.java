package COLLECTIONS;

import java.util.TreeMap;
import java.util.Set;
import java.util.Map;
public class App107 {
    public static void main (String[]args){
        TreeMap<Integer, Double> treeMap = new TreeMap<>();
        treeMap.put(1, 9d);
        treeMap.put(2, 10.1d);
        treeMap.put(3, 7d);
        treeMap.put(4, 15d);
        treeMap.put(5, 20d);

        System.out.println("Các phần tử có trong TreeMap:");
        Set<Map.Entry<Integer, Double>> setTreeMap = treeMap.entrySet();
        System.out.println(setTreeMap);

        treeMap.replace(5, 9.9d);
        treeMap.replace(2, 10.1d, 12d);

        System.out.println("Các phẩn tử có trong treeMap sau khi thay thế:");
        setTreeMap = treeMap.entrySet();
        System.out.println(setTreeMap);
    }
}