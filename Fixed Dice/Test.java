public class Test
{
  public static void main(String[] args) 
  { 
    /*Die die1 = new Die();
    System.out.println(die1.roll());*/
    DiceProbability prob1 = new DiceProbability();
    prob1.roll();
    prob1.printOutcomes();
    
    DiceProbability prob2 = new DiceProbability();
    prob2.roll();
    prob2.printOutcomes();
    
    DiceProbability prob3 = new DiceProbability(1000);
    prob3.roll();
    prob3.printOutcomes();
    
    DiceProbability prob4 = new DiceProbability(3700, new PairOfDice(8, 12));
    prob4.roll();
    prob4.printOutcomes();
    
    DiceProbability prob6= new DiceProbability(new PairOfDice(7));
    prob6.roll();
    prob6.printOutcomes();
    
    PairOfDice d= new PairOfDice(5,12);
    DiceProbability prob7= new DiceProbability(210, d);
    int theRoll= d.roll();
  }
}
