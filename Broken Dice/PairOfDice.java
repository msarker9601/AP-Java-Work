public class PairOfDice {
  private Die die1;
  private Die die2;
    
  public PairOfDice() { 
   die1= new Die();
   die2= new Die();
  }
  
  public PairOfDice(int size) // This function makes it so that you can get two dice with the same number of sides
  {
   die1= new Die(size);
   die2= new Die(size);
  }
  
  public PairOfDice(int size1, int size2) //This function makes it so that you can get two dice with different number of sides
  {
   die1= new Die(size1);
   die2= new Die(size2);
  }
                    
  public int roll() {
   return die.roll() + die2.roll(); 
  }
}
  public int getDie1Size() {
  return die1.getNumberOfSides()
}
  
  public int getDie2Size() {
  return die2.getNumberOfSides()
}
