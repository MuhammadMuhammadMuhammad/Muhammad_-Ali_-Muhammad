
public class Baseball extends Ball
{

    public Baseball( String brandName) 
    {
        super(brandName);
    }

    @Override
    public void bounce(int num)
    {
        System.out.println("The bounce is "+num);
    }
    
     
}
