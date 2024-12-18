package Exception.com;
public class ExceptionSesion {
	
	int ab=25;

	public static void main(String[] args) {
		
	ExceptionSesion obj=new ExceptionSesion();
	
	obj=null;
	try
	{
		System.out.println(obj.ab);
	}
	
	catch(Exception z)
	{
		System.out.println(z);
	}
	
		
		System.out.println("Exception Session");
		//int a=100/0;
		//int b=220/0;
		  int c=100/10;
		try
		{
			int a=100/0;
		}
		
		catch(Exception z)
		{
			System.out.println(z);
		}
		
		System.out.println("Welcome to Session");
		try
		{
			int b=220/0;
		}
		
		catch(Exception x)
		{
			
		}
		
		System.out.println(c);
		
	}

}
