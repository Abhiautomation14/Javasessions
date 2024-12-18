package TwoDimentionalArray.com;

public class Matrix {
	
	static int[][] add(int a[][], int b[][])
	{
		int rows=a.length;
		int column=a[0].length;
		int c[][]=new int[rows][column];
		
		System.out.println("Using for loop");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<column;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
			System.out.println();
		}
		return c;
	}

	public static void main(String[] args) {
		
		int a[][]= {{1,2},{3,4}};
		int b[][]= {{5,6},{7,8}};
		
		int c[][]=add(a,b);
		System.out.println("Using for each loop");
		System.out.println("Matrix of Adding A+B");
		for(int[] d:c)
		{
			for(int ab:d)
				System.out.println(ab + " ");
		}
		
		
	}

}
