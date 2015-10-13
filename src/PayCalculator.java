import hsa.*;

public class PayCalculator 
{
    public static void main(String[] args) 
    {
        Console c = new Console();
        
        Employee e = new Employee();
        
        int type;
        
        String name;
        
        double rate, hours;
        
        while(true)
        {
            c.print("Enter name");
            c.print("(" + e.getNameRules() + ") -> ");
            name = c.readLine();
            
            if(e.setName(name)) break;
            else c.println("Error try again.");
        }
        
        while(true)
        {
            c.print("Enter type");
            c.print("(" + e.getTypeRules() + ") -> ");
            type = c.readInt();
            
            if(e.setType(type)) break;
            else c.println("Error try again.");
        }
        
        while(true)
        {
            c.print("Enter hours");
            c.print("(" + e.getHourRules() + ") -> ");
            hours = c.readDouble();
            
            if(e.setHours(hours)) break;
            else c.println("Error try again.");
        }
        
        while(true)
        {
            c.print("Enter rate");
            c.print("(" + e.getRateRules() + ") -> ");
            rate = c.readDouble();
            
            if(e.setRate(rate)) break;
            else c.println("Error try again.");
        }
        
        c.println(e.getName() + " has a weekly pay of $" + e.getPay());
    }
    
}
