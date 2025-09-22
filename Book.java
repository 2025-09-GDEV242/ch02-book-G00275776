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
    private int borrow;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, String printDetails, String refNumber, int bookPages, int borrowed)
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
    public String printDetails()
    {
        return("Title: " + title + "Author: " + author + "Pages: " + pages);
    }
    
    public int getPages()
    {
        return pages;
    }
    
    public void borrow()
    {
        borrow++;
    }
    
    public void setRefNumber(String ref)
    {
        String getRefNumber = refNumber ; 
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
