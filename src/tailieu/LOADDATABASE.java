package tailieu;

import databaseClass.DocGia;
import databaseClass.DocGiaCRUD;
import databaseClass.NhanVien;
import databaseClass.NhanVienCRUD;
import databaseClass.Sach;
import databaseClass.SachCRUD;

public class LOADDATABASE
{
    public static void main(String[] args)
    {
        LOADDATABASE a = new LOADDATABASE();
        a.user();
        a.book();
        a.reader();
    }

    private void user()
    {
        NhanVien nhanVien = new NhanVien(0, "nhan vien", "0123456789", "dia chi", "user@gmail.com", "123456", "khong ro");
        NhanVienCRUD nhanVienCRUD = new NhanVienCRUD();
        nhanVienCRUD.add(nhanVien);
    }

    private void book()
    {
        SachCRUD sachCRUD = new SachCRUD();
        for(int i = 0; i <= 100; i++)
        {
            Sach sach = new Sach(i, "book"+i, "description"+i, "Type"+i, "Author"+i, 50, 2023);
            sachCRUD.add(sach);
        }
    }

    private void reader()
    {
        DocGiaCRUD docGiaCRUD = new DocGiaCRUD();
        for(int i = 0; i<=100; i++)
        {
            DocGia docGia = new DocGia(i, i, "name"+i, "phone"+i, "email"+i, "adrress"+i, "gender"+i, 20, DocGia.ReaderStatus.READY_TO_BORROW);
            docGiaCRUD.add(docGia);
        }
    }
}
