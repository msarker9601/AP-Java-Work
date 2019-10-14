/**
 * Auto Generated Java Class.
 */
public class Die {
  private int numberOfSides;
  public static final DEFAULT_SIZE= 6;
    
  public Die() { 
    numberOfSides= DEFAULT_SIZE;
  }
  
  public Die (int size) {
    numberOfSides= size;
  }
  
   public int roll() {
    return (int)(Math.random()* numberOfSides)+1;
  }
  
   
  
}

