package in.pwskills.nitin.main;

class Arithmetic
{
	public int sum(int x,int y)
	{
		return x+y;
	}
}

public class App 
{
    public static void main( String[] args )
    {
        Arithmetic a = new Arithmetic();
		int result = a.sum(10,20);
		System.out.println("The sum is :: "+result);
    }
}
