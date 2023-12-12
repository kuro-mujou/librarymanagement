
package databaseClass;

public class transactions {

    int transactionID;
    String startDay;
    String endDay;
    int quantity;
    int bookID;
    int readerID;
    String transactionstatus;
    

    public transactions() {

    }
    public transactions(int transactionId, String startDay, String endDay, int quantity, int bookid, int readerID,String transactionstatus) {
        this.transactionID = transactionId;
        this.startDay = startDay;
        this.endDay = endDay;
        this.quantity = quantity;
        this.bookID = bookid;
        this.readerID = readerID;
        this.transactionstatus = transactionstatus;
    }

    public int getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(int transactionId) {
        this.transactionID = transactionId;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookid) {
        this.bookID = bookid;
    }

    public int getReaderID() {
        return readerID;
    }

    public void setReaderID(int readerID) {
        this.readerID = readerID;
    }
    
    public String getTransactionstatus()
    {
        return transactionstatus;
    }

    public void setTransactionstatus(String transactionstatus)
    {
        this.transactionstatus = transactionstatus;
    }
}
