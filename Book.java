/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Jimmy Arias
 * @version 9/22/25
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private String detail;
    private String refNumber;
    private int pages;
    private int borrowed;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        borrowed = 0;
    }

    
    public String getAuthor ()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Exercise 2.87
     */
    public void printDetails()
    {
        String tempref = "ZZZ";
        if (refNumber.length()>0)
        {
            tempref = refNumber;
        }
        
        System.out.println("Title: " + title + "Author: " + author + "Pages: " + pages + "Reference Number: " + tempref);
    }
    
    public int getPages()
    {
        return pages;
    }
    
    public void borrow()
    {
        borrowed++;
    }
    
    public void setRefNumber(String ref)
    {
         refNumber = ref; 
        
    }
    
    
    public void printAuthor()
    {
        System.out.println(author);
    }
    
    public void printTitle()
    {
        System.out.println(title);
    }
    
}
