
public class Converts_days {

	public static void main(String[] args)
	{
		int m,y,w,d;
		m=375;
		
		y=m/366;
		m=m%365;
		w=m/7;
		m=m%7;
		d=m;		
		System.out.println("Years "+y);
		System.out.println("Weeks "+w);
		System.out.println("Days "+d);
	}

}
