package studio7;

public class Fractions {

	private int num;
	private int dem;
	
	
	public Fractions(int numInt,int demInt){   	
		num = numInt;
		dem = demInt;
	}
	
	
	
	
	
	
	public String Sum(int numerator, int denominator)
	{
		int newdem = denominator*dem;
		int newnum = numerator*dem+num*denominator; 
		
		
		return "newnum" + "/" + "newdem";
	}
	
	
	
	
	
	
}
