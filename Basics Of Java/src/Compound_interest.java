
public class Compound_interest {

	public static void main(String[] args) 
	{
		int p=2000,r=20,t=4;
		double CI;
		
		CI=p*(Math.pow((1+r),t)-1);
		
		System.out.println("CI ="+CI);
		
	}

}
