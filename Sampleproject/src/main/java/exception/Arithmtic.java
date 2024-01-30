package exception;

public class Arithmtic {
	
	
	public void method()
	{
		
		int a=10 ;
		try {
		
		System.out.println(a/0);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
				
	}
	
		public static void main(String args[])
		{
			Arithmtic a=new Arithmtic();
			a.method();
			
		}

}
