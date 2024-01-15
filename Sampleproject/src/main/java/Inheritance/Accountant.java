package Inheritance;

public class Accountant extends Employee {
	
	
	int pf =5000;
	public void method(int pf )
	{
		System.out.println(pf );
	}
	
	public static void main(String args[])
	{
		 Accountant a=new Accountant();
		 a.print1(3000);
		 System.out.println(a.salary);
		 a.method(6000);
		 System.out.println(a.pf);
	}

}
