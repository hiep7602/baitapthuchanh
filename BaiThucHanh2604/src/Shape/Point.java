package Shape;
import java.util.Scanner;
public class Point {
    public static void main (String [] args ){       
    }
private String kytu;
private float hoanhdo;
private float tungdo;
public Point() {
	super();
}
public Point(String kytu, float hoanhdo, float tungdo) {
	super();
	this.kytu = kytu;
	this.hoanhdo = hoanhdo;
	this.tungdo = tungdo;
}
public String getKytu() {
	return kytu;
}
public void setKytu(String kytu) {
	this.kytu = kytu;
}
public double getHoanhdo() {
	return hoanhdo;
}
public void setHoanhdo(float hoanhdo) {
	this.hoanhdo = hoanhdo;
}
public double getTungdo() {
	return tungdo;
}
public void setTungdo(float tungdo) {
	this.tungdo = tungdo;
}
public void nhapDL() {
	Scanner sc = new Scanner(System.in);
	System.out.print("Nhap ky tu: ");
	this.kytu = sc.nextLine();
	System.out.print("Nhap hoanh do: ");
	this.hoanhdo = sc.nextFloat();
	System.out.print("Nhap tung do: ");
	this.tungdo = sc.nextFloat();
    sc.close();
}
public void xuatDL() {
	System.out.println(kytu + "(" + hoanhdo + "," + tungdo + ")");
}
}