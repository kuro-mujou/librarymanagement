package databaseClass;

public class NhanVien
{
    private int MaNhanVien;
    private String ten;
    private String SoDienThoai;
    private String diaChi;
    private String email;
    private String password;
    private String gioiTinh;

    public NhanVien()
    {
    }
    
    public NhanVien(int MaNhanVien, String ten, String SoDienThoai, String diaChi, String email, String password, String gioiTinh)
    {
        this.MaNhanVien = MaNhanVien;
        this.ten = ten;
        this.SoDienThoai = SoDienThoai;
        this.diaChi = diaChi;
        this.email = email;
        this.password = password;
        this.gioiTinh = gioiTinh;
    }
    
    public int getMaNhanVien()
    {
        return MaNhanVien;
    }

    public void setMaNhanVien(int MaNhanVien)
    {
        this.MaNhanVien = MaNhanVien;
    }

    public String getTen()
    {
        return ten;
    }

    public void setTen(String ten)
    {
        this.ten = ten;
    }

    public String getSoDienThoai()
    {
        return SoDienThoai;
    }

    public void setSoDienThoai(String SoDienThoai)
    {
        this.SoDienThoai = SoDienThoai;
    }

    public String getDiaChi()
    {
        return diaChi;
    }

    public void setDiaChi(String diaChi)
    {
        this.diaChi = diaChi;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getGioiTinh()
    {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh)
    {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString()
    {
        return this.MaNhanVien+this.ten+this.diaChi+this.gioiTinh+this.email+this.password;
    }
    
}
