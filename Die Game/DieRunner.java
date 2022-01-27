/**
 * Write a description of class DieRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner; 
public class DieRunner
{
    public static void main (String [] args)
    {
        Die d1 = new Die();
        Die d2 = new Die();
        int roll2 = 0;
        int roll1 = d1.roll() + d2.roll();
        System.out.println(d1 + "\n" + d2);
        System.out.println("Your initial roll is a(n): " + roll1);
        int score = 0;
        int scoreW = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nDo you think your next roll will be higher,\nlower,or the same(h/l/s) as the current roll?");
        String guess = sc.next();
        
        while(scoreW < 3)
        {
            while(!guess.equals("h") && !guess.equals("l") && !guess.equals("s"))
            {
                System.out.println("Please enter l for lower, h for higher or s for same");
                guess = sc.next();
            }
            
            roll1 = d1.roll() + d2.roll();
            System.out.println(d1 + "\n" + d2);
            System.out.println("Your new roll is a(n): " + roll1);
            
            if(guess.equals("h") && roll1 > roll2)
            {    
                score++;
                System.out.println("Correct\n");
            }
            else if(guess.equals("l") && roll1 < roll2)
            {    
                score++;
                System.out.println("Correct\n");
            }
            else if(guess.equals("s") && roll1 == roll2) 
            {    
                score++;
                System.out.println("Correct!\n");
            }
            else
            {    
                scoreW++;
                System.out.println("Incorrect\n");
            }
            roll2 = roll1;
            System.out.println("Score: " + score + "\tIncorrect guesses: " + scoreW);
            System.out.println("Last roll was: " + roll1);
            if(scoreW != 3)
            {
                 System.out.println("Will the roll be higher, lower, or the same(h/l/s) as the current roll ?");
                 guess = sc.next();
            }
            
        }
       
        System.out.println("Your final score is: " + score);
          
                
    }
}

