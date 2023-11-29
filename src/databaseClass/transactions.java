
package databaseClass;

public class transactions {

    int transactionID;
    String startDay;
    String endDay;
    int quantity;
    int bookID;
    int userID;
    

    public transactions() {

    }
    public transactions(int transactionId, String startDay, String endDay, int quantity, int bookid, int userID) {
        this.transactionID = transactionId;
        this.startDay = startDay;
        this.endDay = endDay;
        this.quantity = quantity;
        this.bookID = bookid;
        this.userID = userID;
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

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
