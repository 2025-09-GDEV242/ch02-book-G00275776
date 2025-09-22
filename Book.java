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
    private int pages;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
    }

    
    private String getAuthor ()
    {
        return author;
    }
    
    private String getTitle()
    {
        return title;
    }
    
    private int getPages()
    {
        return pages;
    }
    
    private void printAuthor()
    {
        System.out.println(author);
    }
    
    private void printTitle()
    {
        System.out.println(title);
    }
    
}
