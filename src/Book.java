public class Book 
{
    private String title, author;
    
    public Book(String t, String a)
    {
        title = t;
        author = a;
    }
    
    public String toString()
    {
        return title + "\t" + author;
    }
    
    public String getTitle()
    {
        return title;
    }
}
