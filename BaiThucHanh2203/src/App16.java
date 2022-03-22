import java.util.Scanner;
import static java.lang.System.out;
public class App16 {
    public static void main (String[] agrs){
        hinhtron ht = new hinhtron();
        ht.nhapbankinh();
        ht.tinhchuvi();
        ht.tinhdientich();
        ht.inchuvi();
        ht.indientich();
    }
}
class hinhtron{
    final float pi = 3.14f;
    float r,cv,dt;
    void nhapbankinh(){
        out.println("nhập bán kính hình tròn: ");
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextFloat();
        scanner.close();
    }
    void tinhchuvi(){
        cv = 2 * pi * r;
    }
    void tinhdientich(){
        dt = pi * r * r;
    }
    void inchuvi(){
        out.println("chu vi hình tròn: " + cv);
    }
    void indientich(){
        out.println("diện tích hình tròn: " + dt);
    }
}    