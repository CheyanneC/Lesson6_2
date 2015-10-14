import hsa.*;

public class LibraryInterface 
{
    public static void main(String[] args) 
    {
        Console c = new Console();
        
        String pname;
        
        Patron p;
        
        Book b1, b2, b3, b4, b5;
        b1 = new Book("From Russia With Love", "Greg Hines");
        b2 = new Book("Living Smart", "Rita Langill");
        b3 = new Book("Singing in the Rain", "Harry Conner");
        b4 = new Book("Good Housekeeping", "Pat Burns");
        b5 = new Book("To Be A Model", "Lisa Lahey");
        
        c.println("Here are the books available: ");
        c.println(b1.toString());
        c.println(b2.toString());
        c.println(b3.toString());
        c.println(b4.toString());
        c.println(b5.toString());
        
//        c.println("What is your name? ");
//        pname = c.readLine();
        
        p = new Patron("Cheyanne Carvajal");
        
        c.println("\nLending 4 books to " + p.getName());
        
        if(p.Borrow(b1)) c.println(b1.getTitle() + " successfully borrowed.");
        else c.println(b1.getTitle() + " could not be borrowed.");
        
        if(p.Borrow(b2)) c.println(b2.getTitle() + " successfully borrowed.");
        else c.println(b2.getTitle() + " could not be borrowed.");
        
        if(p.Borrow(b3)) c.println(b3.getTitle() + " successfully borrowed.");
        else c.println(b3.getTitle() + " could not be borrowed.");
        
        if(p.Borrow(b4)) c.println(b4.getTitle() + " successfully borrowed.");
        else c.println(b4.getTitle() + " could not be borrowed.");
        
        c.println("\n-------------Attempting to return the first book-------------");
        
        if(p.returnBook(b1)) c.println(b1.getTitle() + " successfully returned.");
        else c.println(b1.getTitle() + " was not borrowed out.");
        
        c.println("\n-------------Current list of books lent to " + p.getName() + "-------------");
        
        if(p.hasBook(b1)) c.println(b1.toString());
        if(p.hasBook(b2)) c.println(b2.toString());
        if(p.hasBook(b3)) c.println(b3.toString());
        if(p.hasBook(b4)) c.println(b4.toString());
        if(p.hasBook(b5)) c.println(b5.toString());
    }
}
