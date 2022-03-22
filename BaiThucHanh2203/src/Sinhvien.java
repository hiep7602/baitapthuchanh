import java.util.Date;
import java.util.Scanner;
public class Sinhvien{
public static void main (String[] agrs){
    Scanner sc = new Scanner(System.in);
    SinhVien ps = new SinhVien();
    ps.nhapThongTin(sc);
    ps.hienThi();
}
}
class SinhVien{
    String MaSV;
    String HoTen;
    Boolean GioiTinh;
    String DiaChi;
    Date NgaySinh;

public String getMaSV() {
    return MaSV;
}

public void setMaSV(String MaSV) {
    this.MaSV = MaSV;
}

public String getHoTen() {
    return HoTen;
}

public void setHoTen(String HoTen) {
    this.HoTen = HoTen;
}

public boolean getGioiTinhr() {
    return GioiTinh;
}

public void setGioiTinh(Boolean GioiTinh) {
    this.GioiTinh = GioiTinh;
}

public String getDiaChi() {
    return DiaChi;
}

public void setDiaChi(String DiaChi) {
    this.DiaChi = DiaChi;
}
public Date getNgaySinh() {
    return NgaySinh;
}

public void setNgaySinh(Date NgaySinh) {
    this.NgaySinh = NgaySinh;
}
public void hienThi() {
    System.out.println("\tId: " + MaSV);
    System.out.println("\tHo ten: " + HoTen);
    System.out.println("\tGioi tinh: " + GioiTinh);
    System.out.println("\tDia chi: " + DiaChi);
    System.out.println("\tngay sinh: " + NgaySinh);
    
}
public void nhapThongTin(Scanner sc) {
    System.out.print("\tNhap id: ");
    MaSV = sc.nextLine();
    System.out.print("\tNhap ho ten: ");
    sc.nextLine();
    HoTen= sc.nextLine();
    System.out.print("\tNhap gioi tinh: ");
    GioiTinh = sc.nextBoolean();
    System.out.print("\tNhap dia chi: ");
    DiaChi = sc.nextLine();
    System.out.print("\tNhap ngay sinh: ");
   
}
}