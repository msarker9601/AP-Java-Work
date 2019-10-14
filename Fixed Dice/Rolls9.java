public class Rolls9
{
    public static void main (String[] args)
    {
        int[] frequency = new int[7];
        int numberOfRolls = 70;
        int rollsSoFar = 0;

        while(rollsSoFar < numberOfRolls)
        {
            frequency[roll()]++;
            rollsSoFar++;

        }
        for(int i = 1; i < frequency.length ; i++)
        {
            double percent = ((double)frequency[i]/numberOfRolls)*(100);
            System.out.println("Frequency of roll[" + i + "] = " + frequency[i] + ", " + percent + "%");
        }

        /*
        int[] rolls = new int[6];
        for(int i = 0; i < rolls.length; i++)
            rolls[i] = roll();
        }
        for (int i = 0; i < rolls.length; i++)
        {
            System.out.println(rolls[i]);
        }
        */

        /*
        int theRoll = roll();
        System.out.println(theRoll);
        */
    }
    public static int roll()
    {
        return (int)(Math.random()* 6) + 1;
    }
}
