package studio7;

public class Die {

	private int NumOfSides;
	public Die(int Sides)
	{
		NumOfSides= Sides;
	}
	
	public int Thow()
	{
		int landed = (int)Math.random()*NumOfSides+1;
		return landed;
	}
	
	
}
