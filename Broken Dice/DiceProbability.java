/**
 * Auto Generated Java Class.
 */
public class DiceProbability {
  private PairofDice dice;
  private int[] outcomes;
  public static final int DEFAULT_ROLLS= 50; //final makes it so that it becomes a constant. All uppercase for the variable means that it is a constant
  
  public DiceProbability() { 
    dice= new PairOfDice();
    int a= dice.getDice1Size();
    int b = dice.getDice2Size();
    outcomes= new int[a + b + 1];
    numberOfRolls= DEFAULT_ROLLS;
    //roll();
   // printOutcomes();
  }
  
  public DiceProbablity(int numOfRolls) {
    dice= new PairOfDice();
    int a= dice.getDice1Size();
    int b = dice.getDice2Size();
    outcomes= new int[a+b+1];
    numberOfRolls= numOfRolls;
    
    System.out.println("die 1 has " + a + " sides");
    System.out.println("die 2 has " + b + " sides");
    //roll();
   // printOutcomes();
  }
  
  public void roll() {
   int rollsSoFar= 0;
   while (rollsSoFar<numberOfRolls) {
     outcomes[dice.roll()]++;
     rollsSoFar++;
   }
  }
  
  public void printOutcomes() {
    for (int i=2; i<outcomes.length; i++) {
      System.out.println("Roll of " + i + " = " + outcomes[i]);
    
    System.out.println();
    }
  }
  
  
}