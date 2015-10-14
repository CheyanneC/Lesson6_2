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
    }
}
