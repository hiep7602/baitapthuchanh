import java.util.HashSet;
import java.util.Scanner;
public class App113 {
    public static void main (String[]args){
    int name;
    HashSet<String> hashSetString = new HashSet<>();
    Scanner scanner = new Scanner(System.in);
    scanner.close();

    hashSetString.add("Cam");
    hashSetString.add("Táo");
    hashSetString.add("Nho");
    hashSetString.add("Mít");
    hashSetString.add("Bưởi");
    hashSetString.add("Nhãn");

    System.out.print("Nhập số phần tử có trong HashSet:");
    System.out.println(hashSetString);
    System.out.println("Nhập phần tử cần xóa!");
    name = scanner.nextInt();

    if(!hashSetString.contains(name)){
    hashSetString.remove(name);
    System.out.println("Thêm thành công:");
    System.out.println("Các phần tử có trong HashSetInteger sau khi thêm:");
    System.out.println(hashSetString);
    } else {
        System.out.println("Xóa không thành công:");
       
    }
    }        
}
