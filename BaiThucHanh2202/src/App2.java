import java.util.Scanner;
public class App2 {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap canh a = ");
        int a = sc.nextInt();
        System.out.print("Nhap canh b = ");
        int b = sc.nextInt();
        System.out.print("Nhap canh c = ");
        int c = sc.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Day la tam giac thuong");
        } else if (a == b && b == c) {
            System.out.println("Day la tam giac deu");
        } else if (a == b || b == c || a == c) {
            System.out.println("Day la tam giac can");
        } else if(a*a == b*b + c*c || b*b == a*a + c*c || c*c == a*a + b*b) {
            System.out.println("Day la tam giac vuong");
        } else if(((a * a + b * b == c * c) && (a == b)) ||
        ((a * a + c * c == b * b) && (a == c)) ||
        ((b * b + c * c == a * a) && (b == c))) 
        {
            System.out.println("Tam giác vuông cân!");
        } else {
            System.out.println("Day khong phai tam giac");
        
        }
            
        sc.close();
    }
}
    
