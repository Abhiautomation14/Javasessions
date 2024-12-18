package DemoClass.com;

import java.util.Arrays;

public class ArrayDemoone {

	//Group of items which as similar type of data is array
	
	//Is a collection of similar elements stored or placed in contiguous memory locations--
			//declaring array
			//---->datatype[] variable_name ; ------>example         int[] a;
			// variable_name[]=new datatype[size];----------->a[]=new  int[size];
				//Syntax of array
			//datatype[] variable_name=new datatype[size];
			//datatype variable_name[]=new datatype[size];
			
//			String aa="dgdfgdfgdfg";
//			System.out.println(aa.length());
	
	
	
	
	public static void main(String[] args) {
		
		
		//String s="banaglore";
		//System.out.println("Length of the given String--->"+s.length());
		
		
		
		
		
		//Array Literals in Java

		
		//declaring array
		
		/* syntax
		 * datatype[] variable_name;
		 * 
		 * or
		 * datatype variable_name[];
		 */
		
		//declaring array
		int[] a;
		int a1[];
		
		//initialize array in java
		
		int[] a2= {1,2,3,4,5};
		
		a2[0]=1;
		a2[1]=2;
		a2[2]=3;
		a2[3]=4;
		a2[4]=5;
		
		System.out.println("Size of array or length of array--->"+a2.length);
		
		System.out.println("Using for loop print array items");
		for(int i=0;i<a2.length;i++)
		{
			System.out.println(a2[i]);
			
		}
		
		//print values without using loops
		
		System.out.println("With out using loop--->"+Arrays.toString(a2));
		
		
		
		System.out.println(a2[6]);
		
		
		
		
		
		//For each loop
		
		
		/*
		 * for(Data_type new_variable:old_variable)
		 * {
		 * 
		 * }
		 * 
		 * 
		 * 
		 */
		
		
		
		System.out.println("Using foreach loop print array items");
		
		for(int a3:a2)
		{
			System.out.println(a3);
			
		}
		
		
		System.out.println("Sum of two arrays--->"+(a2[0]+a2[1]));
		
		System.out.println("Sum of two arrays--->"+(a2[1]+a2[3]));
		
		
		String s[]= {"API","Selenium","Postman","Automation","Jenkins"};
		
		System.out.println("Printing the values ithout loop strings values are--->"+Arrays.toString(s));
		
		
		System.out.println(s[2]);
		System.out.println(s.length);
		
		
		
		for(String ss:s)
		{
			System.out.println("Using foe each loop-->"+ss);
			
		}
		
		for(int i=0;i<s.length;i++)
		{
			
			System.out.println("Normal for loop-->"+s[i]);
		}
	
		
		
		
		
		
		
		


	}

}
