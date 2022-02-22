import java.util.Scanner;
public class App4 {
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
            System.out.print("Nhap n = ");
            int n = sc.nextInt();
            System.out.printf("so nguyen to nho hon %d la: ", n);
            if (n >= 2) {
                System.out.print(2);
            }
            for (int i = 3; i < n; i+=2) {
                if (snt(i)) {
                    System.out.print(" " + i);
                }
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