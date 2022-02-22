import java.util.Scanner;
public class App3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap n : ");
        int n = sc.nextInt();
        if (snt(n)) {
            System.out.println(n + " là so nguyen to");
        } else {
            System.out.println(n + " khong phai so nguyen to");
        }
        sc.close();
    }
    public static boolean snt(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
 }
