import java.util.Scanner;
public class PhuongTrinhBac2 {
    public static void main(String[] args) throws Exception {
        
    }
    
}
    class PhuongTrinhBacHai{
        float a, b, c, x1, x2, delta;
        void nhapa(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap a: ");
            a = scanner.nextFloat();
            scanner.close();
        }
        
        void nhapb() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap b: ");
            b = scanner.nextFloat();
            scanner.close();
        }
        void nhapc() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap c: ");
            c = scanner.nextFloat();
            scanner.close();
        }
        void tinhdelta(){
            delta = b * b - 4 * a * c ;
        }
        void indelta() {
            System.out.println("delta =" + delta);
        }
        void giaiptb2(){
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                x1 = x2 = (-b / (2 * a));
                System.out.println("Phuong trinh co nghiem kep x1 = x2= " + x1);
            } else {
                x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
                x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
                System.out.println("PT co 2 nghiem x1 = " + x1 + "x2 = " + x2);
            }
        }
       /* void indelta(){
            System.out.println("delta ="+delta);
        }
        void deltanhohon0(){
            System.out.println("Phuong trinh vo nghiem");
        }
        void deltabang0(){
            System.out.println("Phuong trinh co nghiem kep x1 = x2= " + x1);
        }
        void deltalonhon0(){
            x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("PT co 2 nghiem x1 = " + x1 + "x2 = " + x2);
        }*/

    }
    