package App79;

public class NhanVienPartTime extends NhanVien{
    private int gioLamViec;
    
    public Nhanvienthoivu(String ten, int gioLamViec){
        this.ten=ten;
        this.gioLamViec=gioLamViec;
       
    }
    @Override
    public String loaiNhanVien(){
        return "Nhan vien lam theo gio";
    }
    public void tinhLuong(){
        luong= configs.LUONG_PART_TIME_MOI_GIO* gioLamViec;
    }
}
