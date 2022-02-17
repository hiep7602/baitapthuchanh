import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in); 
        int n, soDu, tong = 0;

        System.out.println("Nhập vào số nguyên dương bất kỳ: ");
        n = sc.nextInt();

        while (n > 0) {
            soDu = n % 10;
            n = n / 10;
            tong += soDu;
        }

        System.out.println("Tổng các chữ số = " + tong);
    }
}
    