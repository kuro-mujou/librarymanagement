package databaseClass;
/**
 *
 * @author Ther
 */
public class Sach
{
    private int BookID;
    private String NameBook;
    private String Description;
    private String Type;
    private String Writing;
    private int Quantity;
    private int YearRelease;

    public Sach() {
    }

    public Sach(int bookID, String NameBook, String Description, String Type, String Writing, int Quantity, int YearRelease) {
        this.BookID = bookID;
        this.NameBook = NameBook;
        this.Description = Description;
        this.Type = Type;
        this.Writing = Writing;
        this.Quantity = Quantity;
        this.YearRelease = YearRelease;
    }

    public Sach(String NameBook, String Description, String Type, String Writing, int Quantity, int YearRelease) {
        this.NameBook = NameBook;
        this.Description = Description;
        this.Type = Type;
        this.Writing = Writing;
        this.Quantity = Quantity;
        this.YearRelease = YearRelease;
    }

    public int getBookID() {
        return BookID;
    }

    public String getNameBook() {
        return NameBook;
    }

    public String getDescription() {
        return Description;
    }

    public String getType() {
        return Type;
    }

    public String getWriting() {
        return Writing;
    }

    public int getQuantity() {
        return Quantity;
    }

    public int getYearRelease() {
        return YearRelease;
    }

    public void setBookID(int BookId) {
        this.BookID = BookId;
    }

    public void setNameBook(String NameBook) {
        this.NameBook = NameBook;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public void setWriting(String Writing) {
        this.Writing = Writing;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public void setYearRelease(int YearRelease) {
        this.YearRelease = YearRelease;
    }

    
    
   
}
