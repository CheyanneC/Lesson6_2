public class Employee 
{
    private int type;
    private double rate, hours;
    private String name;
    
    public Employee()
    {
        name = "";
        type = 0;
        hours = 0;
        rate = 0;
    }
    
    public boolean setType(int t)
    {
        if(t != 1 && t != 2) return false;
        
        else
        {
            type = t;
            return true;
        }
    }     
    
    public boolean setRate(double r)
    {
        boolean rateok = (r >= 6.75 && r <= 30.50);
        if(rateok)
        {
            rate = r;
            return true;
        }
        
        else
            return false;
    } 
    
    public boolean setHours(double h)
    {
        boolean hoursok = (h >= 1 && h <= 60);
        if(hoursok)
        {
            hours = h;
            return true;
        }
        
        else
            return false;
    }
    
    public boolean setName(String n)
    {
        if(n.length() > 0)
        {
            name = n;
            return true;
        }
        
        else
            return false;
    }
    
    //four metjods that return rules to follow
    
    public String getNameRules()
    {
        return "Name must noy be blank";
    }
    
    public String getHourRules()
    {
        return "Name must be between 1 and 60";
    }
    
    public String getRateRules()
    {
        return "Name must be between 6.75 to 30.50";
    }
    
    public String getTypeRules()
    {
        return "Name must be 1 or 2";
    }
    
    //this will allow us to go c.print(getTypeRules());
    
    public String getName()
    {
        return name;
    }
    
    public double getPay()          
    {
        if(type == 2) 
            return rate*hours;
        
        else
        {
            if(hours <= 40) 
                return rate * hours;
            
            else
                return (rate* 40) + (hours - 40) * rate * 2;
        }
    }
}
