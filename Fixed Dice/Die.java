public class Die 
{
  private int numberOfSides;
  public static final int DEFAULT_SIZE = 6;
  public static final int MAX_SIZE= 100;
  public static final int MIN_SIZE= 2;
 //final makes DEFAULT_SIZE a constant, which is static
  
  public Die() 
  { 
    numberOfSides = DEFAULT_SIZE;
  }
  
  public Die(int size)
  {
    if (size<MIN_SIZE || size>MAX_SIZE) {
      numberOfSides= DEFAULT_SIZE;
    }
    else {
      numberOfSides = size;  
    }
  }
  
  public int roll()
  {
    return (int)(Math.random()* numberOfSides) + 1;
  }
  
  public int getNumberOfSides()
  {
    return numberOfSides;
  }
  
  
}
