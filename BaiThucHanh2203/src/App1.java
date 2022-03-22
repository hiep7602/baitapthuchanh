import java.util.Scanner;
import static java.lang.System.out;
public class App1 {

    public static void main (String[] agrs){
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.nhapchieudai();
        hcn.nhapchieurong();
        hcn.tinhchuvi();
        hcn.tinhdientich();
        hcn.inchuvi();
        hcn.indientich();
    }
}
class HinhChuNhat{
    float chieuDai, chieuRong, chuVi, dienTich;
    void nhapchieudai(){
        out.println("nhập chiều dài hình chữ nhật: ");
        Scanner scanner = new Scanner(System.in);
        chieuDai = scanner.nextFloat();
        scanner.close();
    }
    void nhapchieurong(){
        out.println("nhập chiều rộng hình chữ nhật: ");
        Scanner scanner = new Scanner(System.in);
        chieuRong = scanner.nextFloat();
        scanner.close();
    }
    void tinhchuvi(){
        chuVi = 2 * (chieuDai + chieuRong);
    }
    void tinhdientich(){
        dienTich = chieuDai * chieuRong ;
    }
    void inchuvi(){
        out.println("chu vi hình chữ nhật: " + chuVi);
    }
    void indientich(){
        out.println("diện tích hình chữ nhật: " + dienTich);
    }
}

