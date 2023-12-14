package databaseClass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

public class transactionsCRUD
{
    static Connection conn = null;
    static PreparedStatement sttm = null;

    public ArrayList<transactions> getAllTransactions()
    {
        ResultSet rs = null;
        Statement sttm = null;
        ArrayList<transactions> transactions = new ArrayList();
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
                trans.setBookID(rs.getInt("bookID"));
                trans.setReaderID(rs.getInt("readerID"));
                trans.setTransactionstatus(rs.getString("transactionstatus"));
                transactions.add(trans);
            }
            Collections.reverse(transactions);
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
        try
        {
            String sSQL = "SELECT * FROM transactions WHERE transactionID = " + id;
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
                trans.setBookID(rs.getInt("bookID"));
                trans.setReaderID(rs.getInt("readerID"));
                trans.setTransactionstatus(rs.getString("transactionstatus"));
                return trans;
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
            } catch (SQLException ex)
            {
                Logger.getLogger(transactionsCRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
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
            String sSQL = "INSERT INTO transactions VALUES(?,?,?,?,?,?,?)";

            conn = DatabaseConnect.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, transactions.getTransactionID());
            sttm.setString(2, transactions.getStartDay());
            sttm.setString(3, transactions.getEndDay());
            sttm.setInt(4, transactions.getQuantity());
            sttm.setInt(5, transactions.getBookID());
            sttm.setInt(6, transactions.getReaderID());
            sttm.setString(7, transactions.getTransactionstatus());
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

    public void deleteTransactionsByReaderID(int id)
    {
        try
        {
            String sSQL = "delete transactions where readerID= " + id;
            conn = DatabaseConnect.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.executeUpdate();
        } catch (Exception e)
        {
        }
    }

    public ArrayList<transactions> getTransactionsByReaderID(int id)
    {
        ResultSet rs = null;
        Statement sttm = null;
        try
        {
            ArrayList<transactions> transactions = new ArrayList();
            String sSQL = "SELECT * FROM transactions WHERE readerID = " + id;
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
                trans.setBookID(rs.getInt("bookID"));
                trans.setReaderID(rs.getInt("readerID"));
                trans.setTransactionstatus(rs.getString("transactionstatus"));
                transactions.add(trans);
            }
            Collections.reverse(transactions);
            return transactions;
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
            } catch (SQLException ex)
            {
                Logger.getLogger(transactionsCRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public int updateTransactionStatus(int id,String status)
    {
        try
        {
            String sSQL = "update dbo.transactions \n"
                    + "set transactionstatus=?\n"
                    + "where transactionID=?";
            conn = DatabaseConnect.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, status);
            sttm.setInt(2, id);
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
    public void updateTransactionDetail(int transid,int bookid, int quantity)
    {
        try
        {
            String sSQL = "update dbo.transactions \n"
                    + "set bookID=?,quantity=?\n"
                    + "where transactionID=?";
            conn = DatabaseConnect.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, bookid);
            sttm.setInt(2, quantity);
            sttm.setInt(3, transid);
            sttm.executeUpdate();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public int getTransactionsStatus(int id)
    {
        ResultSet rs = null;
        Statement sttm = null;
        try
        {
            ArrayList<String> status = new ArrayList<>();
            String sSQL = "SELECT transactionstatus FROM transactions WHERE readerID = " + id;
            conn = DatabaseConnect.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next())
            {
                status.add(rs.getString("transactionstatus"));
            }
            if(status.contains("NOT RETURNED"))
                return 3;
            else if(status.contains("BORROWING"))
                return 2;
            else if(status.contains("RETURNED"))
                return 1;
            else
                return 0;
            
        } catch (Exception e)
        {
            return 0;
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
    public ArrayList<transactions> getTransactionsByStatus(String status)
    {
        ResultSet rs = null;
        Statement sttm = null;
        try
        {
            ArrayList<transactions> transactions = new ArrayList();
            String sSQL = "SELECT * FROM transactions WHERE transactionstatus = '" + status +"'";
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
                trans.setBookID(rs.getInt("bookID"));
                trans.setReaderID(rs.getInt("readerID"));
                trans.setTransactionstatus(rs.getString("transactionstatus"));
                transactions.add(trans);
            }
            return transactions;
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
            } catch (SQLException ex)
            {
                Logger.getLogger(transactionsCRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public ArrayList<transactions> getTransactionsByBook(int bookID, int readerID)
    {
        ResultSet rs = null;
        Statement sttm = null;
        try
        {
            ArrayList<transactions> transactions = new ArrayList();
            String sSQL = "SELECT * FROM transactions WHERE bookID = " + bookID + "AND readerID =" + readerID;
            conn = DatabaseConnect.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            if(rs.next())
            {
                while (rs.next())
                {
                    transactions trans = new transactions();
                    trans.setTransactionID(rs.getInt("transactionID"));
                    trans.setStartDay(rs.getString("startDay"));
                    trans.setEndDay(rs.getString("endDay"));
                    trans.setQuantity(rs.getInt("quantity"));
                    trans.setBookID(rs.getInt("bookID"));
                    trans.setReaderID(rs.getInt("readerID"));
                    trans.setTransactionstatus(rs.getString("transactionstatus"));
                    transactions.add(trans);
                }
                return transactions;
            }else
            {
                return null;
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
            } catch (SQLException ex)
            {
                Logger.getLogger(transactionsCRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
