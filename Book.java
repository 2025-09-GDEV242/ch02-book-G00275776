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
    private final boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean isCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        borrowed = 0;
        courseText = isCourseText;
    }

    
    public String getAuthor ()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public int getBorrowed()
    {
        return borrowed;
    }
    
    public boolean isCourseText()
    {
          return courseText;  
    }

    /**
     * Exercise 2.87, 2.89, 2.90
     */
    public void printDetails()
    {
        String tempref = "ZZZ";
        if (refNumber.length()>=3)
        {
            tempref = refNumber;
        }
        
        
        System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages + ", Reference Number: " + tempref + ", Times borrowed: " + borrowed + ", Course Text? " + courseText);
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
         if(ref.length()>3)
         {
             refNumber = ref;
         }
         else
         {
             System.out.println("Error: Must be longer than 3 characters");
         }
        
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
