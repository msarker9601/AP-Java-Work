public class DiceProbability 
{
  private PairOfDice dice;
  private int[] outcomes;
  private int numberOfRolls;
  public static final int DEFAULT_ROLLS = 50;
  
  public DiceProbability(int numRolls)
  {
    dice = new PairOfDice();
    outcomes = new int[13];
    numberOfRolls = numRolls;
  }
  
  public DiceProbability() 
  { 
    dice = new PairOfDice();
    int a = dice.getDie1Size();
    int b = dice.getDie2Size();
    outcomes = new int[a + b + 1];
    outcomes = new int[13];
    numberOfRolls = DEFAULT_ROLLS;
  }
  /*
  Optional
  public DiceProbability() {
   this(DEFAULT_ROLLS, new PairOfDice()); 
  }
  Optional 
  public DiceProbability(int numRolls) {
   this(numRolls, new PairOfDice()); 
  }
  Optional
  public DiceProbability(PairOfDice theDice) {
   this(DEFAULT_ROLLS, theDice);  
  }
   */
  public DiceProbability(PairOfDice theDice)
  {
    dice= theDice;
    int a = dice.getDie1Size();
    int b = dice.getDie2Size();
    outcomes = new int[a + b + 1];
    numberOfRolls = DEFAULT_ROLLS;
  }
  
  public DiceProbability(int numRolls, PairOfDice theDice)
  {
    dice = theDice;
    int a = dice.getDie2Size();
    int b = dice.getDie2Size();
    outcomes = new int[a + b + 1];
    if (numRolls<1) {
      numberOfRolls= DEFAULT_ROLLS;
    }
    else {
      numberOfRolls= numRolls
    }
  }
  
  public void roll()
  {
    int rollsSoFar = 0;
    while(rollsSoFar < numberOfRolls)
    {
      outcomes[dice.roll()]++;
      rollsSoFar++;
    }
  }
 
  public void printOutcomes()
  {
    int a = dice.getDie1Size();
    int b = dice.getDie2Size();
    System.out.println("die1 has " + a + " sides.");
    System.out.println("die2 has " + b + " sides.");
    
    for(int i = 2; i < outcomes.length; i++)
    {
      System.out.println("Rolls of " + i + "s " + outcomes[i]);
    }
    System.out.println();
  }
  
  
  
}
