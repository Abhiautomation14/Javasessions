package DemoClass.com;

class ABC
{
	final int a=100;
	int b=200;
	final int c=300;
	
	void add()
	{
		int add=a+b+c;
		System.out.println("Addition");
		System.out.println(add);
	}
	
	void sub()
	{
		int sub=c-b-a;
		System.out.println("Substraction");
		System.out.println(sub);
	}
	
	final void mul()
	{
		int mul=a*b*c;
		System.out.println("Multiplication");
		System.out.println(mul);
	}
	
}

class DEF extends ABC
{
	void add()
	{
		int add1=a+b;
		System.out.println("Addition");
		System.out.println(add1);
	}
	
	void sub()
	{
		int sub2=b-a;
		System.out.println("Substraction");
		System.out.println(sub2);
	}
	
/*	final void mul()
	{
		System.out.println("Multiplication");	
	}
*/	
}

public class Session1 {

	public static void main(String[] args) {
		DEF obj=new DEF();
		obj.add();
		obj.sub();
		obj.mul();
		obj.add();
		obj.sub();
		System.out.println("Values changes in a,b,c");
		System.out.println(obj.a);
	//	System.out.println(obj.a=150);
		System.out.println(obj.b);
		System.out.println(obj.b=220);
		System.out.println(obj.c);
	//	System.out.println(obj.c=250);
		obj.add();
		obj.sub();
		obj.mul();

	}

}
