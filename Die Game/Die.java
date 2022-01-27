
/**
 * Write a description of class Die here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Die
{
    private int die;
    public Die ()
    {
         die =(int)(Math.random()*6+1);
    }

    public String toString()
    {
        return "This die is showing "+die;

    }

    public void setDie(int newd)
    {
        die= newd;
    }

    public int getDie()
    {
        return die;
    }

    public int roll()
    {
        die =(int)(Math.random()*6+1);
        return die;
    }
}


