package databaseClass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SachCRUD
{
    Connection conn = null;
    PreparedStatement sttm = null;

    public SachCRUD()
    {
    }

    public int add(Sach sach)
    {
        try
        {
            String sSQL = "insert into dbo.book(bookID,nameBook,description,type,author,quantity,yearRelease)\n"
                    + "values (?,?,?,?,?,?,?);";

            conn = DatabaseConnect.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, sach.getBookID());
            sttm.setString(2, sach.getNameBook());
            sttm.setString(3, sach.getDescription());
            sttm.setString(4, sach.getType());
            sttm.setString(5, sach.getAuthor());
            sttm.setInt(6, sach.getQuantity());
            sttm.setInt(7, sach.getYearRelease());
            if (sttm.executeUpdate() > 0)
            {

                return 1;
            }

        } catch (Exception e)
        {
        }
        return -1;
    }

    public int update(Sach sach)
    {
        try
        {
            String sSQL = "update dbo.book \n"
                    + "set nameBook=?,description=?,type=?,author=?,quantity=?,yearRelease=?\n"
                    + "where bookID=?";
            conn = DatabaseConnect.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, sach.getNameBook());
            sttm.setString(2, sach.getDescription());
            sttm.setString(3, sach.getType());
            sttm.setString(4, sach.getAuthor());
            sttm.setInt(5, sach.getQuantity());
            sttm.setInt(6, sach.getYearRelease());

            sttm.setInt(7, sach.getBookID());
            if (sttm.executeUpdate() > 0)
            {
                return 1;
            }

        } catch (Exception e)
        {
        }
        return -1;
    }

    public int delete(int id)
    {
        try
        {
            String sSQL = "delete book where bookID= " + id;

            conn = DatabaseConnect.getDBConnect();
            sttm = conn.prepareStatement(sSQL);

            if (sttm.executeUpdate() > 0)
            {
                return 1;
            }

        } catch (Exception e)
        {
        }
        return -1;
    }

    public List<Sach> getAll()
    {
        List<Sach> ls = new ArrayList<>();
        ResultSet rs = null;
        Statement sttm = null;
        try
        {
            String sSQL = "select book.bookID,nameBook,description,type,author,quantity,yearRelease from book";
            conn = DatabaseConnect.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next())
            {
                Sach sach = new Sach();
                sach.setBookID(rs.getInt(1));
                sach.setNameBook(rs.getString(2));
                sach.setDescription(rs.getString(3));
                sach.setType(rs.getString(4));
                sach.setAuthor(rs.getString(5));
                sach.setQuantity(rs.getInt(6));
                sach.setYearRelease(rs.getInt(7));
                ls.add(sach);
            }
        } catch (Exception e)
        {
        } finally
        {
            try
            {
                rs.close();
                sttm.close();
                conn.close();
            } catch (Exception e)
            {
            }
        }
        return ls;
    }

    public Sach findSachById(int MaSach)
    {
        ResultSet rs = null;
        Statement sttm = null;
        try
        {
            String sSQL = "select bookID,nameBook,description,type,author,quantity,yearRelease from book where bookID=" + MaSach;
            conn = DatabaseConnect.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next())
            {
                Sach sach = new Sach();
                sach.setBookID(rs.getInt(1));
                sach.setNameBook(rs.getString(2));
                sach.setDescription(rs.getString(3));
                sach.setType(rs.getString(4));
                sach.setAuthor(rs.getString(5));
                sach.setQuantity(rs.getInt(6));
                sach.setYearRelease(rs.getInt(7));
                return sach;
            }

        } catch (Exception e)
        {
            return null;
        } finally
        {
            try
            {
                rs.close();
                sttm.close();
                conn.close();
            } catch (Exception e)
            {
            }
        }
        return null;
    }

    public Sach findSachByName(String Name)
    {
        ResultSet rs = null;
        Statement sttm = null;
        try
        {
            String sSQL = "select top 1 bookID,nameBook,description,type,author,quantity,yearRelease from book where nameBook= '" + Name + "'";

            conn = DatabaseConnect.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next())
            {
                Sach sach = new Sach();
                sach.setBookID(rs.getInt(1));
                sach.setNameBook(rs.getString(2));
                sach.setDescription(rs.getString(3));
                sach.setType(rs.getString(4));
                sach.setAuthor(rs.getString(5));
                sach.setQuantity(rs.getInt(6));
                sach.setYearRelease(rs.getInt(7));
                return sach;
            }

        } catch (Exception e)
        {
        } finally
        {
            try
            {
                rs.close();
                sttm.close();
                conn.close();
            } catch (Exception e)
            {
            }
        }
        return null;

    }
    public int UpdateQuantity(int id, int quantity)
    {
        try
        {
            String sSQL = "update book set quantity =?  where bookID = ?";
            conn = DatabaseConnect.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, quantity);
            sttm.setInt(2, id);

            if (sttm.executeUpdate() > 0)
            {

                return 1;
            }

        } catch (Exception e)
        {
        }
        return -1;
    }
    public int getMaxBookID()
    {
        ResultSet rs = null;
        Statement sttm = null;
        try
        {
            String sSQL = "SELECT MAX(bookID) as 'maxID' FROM book";

            conn = DatabaseConnect.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            int id = 1;
            while (rs.next())
            {
                id = rs.getInt("maxID");
            }
            return id;
        } catch (Exception e)
        {
            return -1;
        }
    }
}
