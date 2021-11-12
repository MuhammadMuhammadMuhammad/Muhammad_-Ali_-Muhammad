
public class Mammal
{
    private boolean isTravel;
    private String favFood,food;
    private int NoOfLegs;

    public Mammal()
    {
        
    }

    public Mammal(boolean isTravel, String favFood, String food, int NoOfLegs) 
    {
        this.isTravel = isTravel;
        this.favFood = favFood;
        this.food = food;
        this.NoOfLegs = NoOfLegs;
    }
    
    
      public String eat()
      {
          return food;
      }
      
      public boolean travel()
      {
          return isTravel;
      }
      
      public int noOfLegs()
      {
          return NoOfLegs;
      }
      
      public String favouriteFood()
      {
          return favFood;
      }
    
}
