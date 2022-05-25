package COLLECTIONS;
import java.util.HashSet;
import java.util.Scanner;
public class App53 {
    public static void main(String[] args) throws Exception {
    int number;
    HashSet<Integer> hashSetInteger = new HashSet<>();
    Scanner scanner = new Scanner (System.in);
    scanner.close();
    hashSetInteger.add(0);
    hashSetInteger.add(1);
    hashSetInteger.add(2);
    hashSetInteger.add(3);
    hashSetInteger.add(4);
    hashSetInteger.add(5);
    System.out.println("Các phần tử có trong HashSet:");
    
    System.out.println(hashSetInteger);
    System.out.println("Nhập phần tử cần thêm:");

    number = scanner.nextInt();
    if(!hashSetInteger.contains(number)){
        hashSetInteger.add(number);
        System.out.println("Thêm thành công!");
        System.out.println("Các phần tử trong HashSetInteger sau khi thêm:");
        System.out.println(hashSetInteger);
    
    } else {
        System.out.println("Phần tử " + number + "đã tồn tại!" );
    }
}
}