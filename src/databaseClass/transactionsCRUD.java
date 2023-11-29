package databaseClass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class transactionsCRUD
{
    static Connection conn = null;
    static PreparedStatement sttm = null;

    public List<transactions> getAllTransactions()
    {
        ResultSet rs = null;
        Statement sttm = null;
        List<transactions> transactions = new ArrayList();
        try
        {
            String sSQL = "SELECT * FROM transactions";

            conn = DatabaseConnect.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next())
            {
                transactions trans = new transactions();
                trans.setTransactionID(rs.getInt("transactionID"));
                trans.setStartDay(rs.getString("startDay"));
                trans.setEndDay(rs.getString("endDay"));
                trans.setQuantity(rs.getInt("quantity"));
                trans.setBookID(rs.getInt("bookid"));
                trans.setUserID(rs.getInt("userID"));
                transactions.add(trans);
            }
            return transactions;
        } catch (Exception e)
        {
            return transactions;
        } finally
        {

            try
            {
                rs.close();
                sttm.close();
                conn.close();
            } catch (SQLException ex)
            {
                Logger.getLogger(transactionsCRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public transactions getTransactionsByID(int id)
    {
        ResultSet rs = null;
        Statement sttm = null;
        transactions trans = new transactions();
        try
        {
            String sSQL = "SELECT * FROM transactions WHERE transactionID = " + id;

            conn = DatabaseConnect.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next())
            {
                trans.setTransactionID(rs.getInt("transactionID"));
                trans.setStartDay(rs.getString("startDay"));
                trans.setEndDay(rs.getString("endDay"));
                trans.setQuantity(rs.getInt("quantity"));
                trans.setBookID(rs.getInt("bookid"));
                trans.setUserID(rs.getInt("userID"));
            }
            return trans;
        } catch (Exception e)
        {
            return trans;
        } finally
        {

            try
            {
                rs.close();
                sttm.close();
                conn.close();
            } catch (SQLException ex)
            {
                Logger.getLogger(transactionsCRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public int getIdTransactions()
    {

        ResultSet rs = null;
        Statement sttm = null;
        try
        {
            String sSQL = "SELECT MAX(transactionID) as 'maxID' FROM transactions";

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
        } finally
        {

            try
            {
                rs.close();
                sttm.close();
                conn.close();
            } catch (SQLException ex)
            {
                Logger.getLogger(transactionsCRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public int addNewTransaction(transactions transactions)
    {
        try
        {
            String sSQL = "INSERT INTO transactions VALUES(?,?,?,?,?,?)";

            conn = DatabaseConnect.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, transactions.getTransactionID());
            sttm.setString(2, transactions.getStartDay());
            sttm.setString(3, transactions.getEndDay());
            sttm.setInt(4, transactions.getQuantity());
            sttm.setInt(5, transactions.getBookID());
            sttm.setInt(6, transactions.getUserID());

            if (sttm.executeUpdate() > 0)
            {
                return 1;
            }

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return -1;
    }

    public int delete(int id)
    {
        try
        {
            String sSQL = "delete transactions where transactionID= " + id;
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

    public transactions getTransactionsByReaderID(int id)
    {
        ResultSet rs = null;
        Statement sttm = null;
        try
        {
            
            String sSQL = "SELECT * FROM transactions WHERE userID = " + id;
            conn = DatabaseConnect.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next())
            {
                transactions trans = new transactions();
                trans.setTransactionID(rs.getInt("transactionID"));
                trans.setStartDay(rs.getString("startDay"));
                trans.setEndDay(rs.getString("endDay"));
                trans.setQuantity(rs.getInt("quantity"));
                trans.setBookID(rs.getInt("bookid"));
                trans.setUserID(rs.getInt("userID"));
                return trans;
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
            } catch (SQLException ex)
            {
                Logger.getLogger(transactionsCRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
}
