/**
 * Auto Generated Java Class.
 */
public class Test {
  
  public static void main(String[] args) { 
   DiceProbablity prob1= new DiceProbability();
   prob1.roll();
  `prob1.printOutcomes();
   
  `DiceProbablity prob2= new DiceProbability();
   prob2.roll();
  `prob2.printOutcomes();
  
   DiceProbablity prob3= new DiceProbability(1000);
   prob3.roll();
  `prob3.printOutcomes();
   
   DiceProbability prob4= new DiceProbability(37, new PairOfDice(8,12));
   prob4.roll();
   prob4.printOutcomes();
   /** Die die1= new Die();  
    System.out.println(die1.roll());
    PairOfDice ourDice = new PairOfDice();
    System.out.println(ourDice.roll());
  }**/
      
  }
  
  /* ADD YOUR CODE HERE */

}
