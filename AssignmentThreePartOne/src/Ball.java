
public class Ball implements Tossable
{
    private String brandName;
    public Ball(String brandName)
    {
        this.brandName=brandName;
    }
    public String getBrandName()
    {
        return brandName;
    }
    public void toss()
    {
        System.out.println("Aya Haga");
    }
    public abstract void bounce(int num);
}
