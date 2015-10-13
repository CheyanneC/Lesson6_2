public class GuessMachine 
{
    private int num, numg, guess;
    
    public GuessMachine()
    {
        numg = 0;
        guess = 0;
        num = (int)(Math.random() * 100) + 1;
    }
    
    public int getNumGuesses()
    {
        return numg;
    }
    
    public boolean setGuess(int g)
    {
        boolean isValid = (g >=1 && g <= 100);
        
        if(isValid)
        {
            guess = g; 
            numg ++;
            return true;
        }
        
        else
            return false;
    }
    
    public String giveHint()
    {
        if(guess > num)
            return "Too high, guess lower";
        else if(guess < num)
            return "Too low, guess higher";
        else
            return "You got it!";
    }
}
