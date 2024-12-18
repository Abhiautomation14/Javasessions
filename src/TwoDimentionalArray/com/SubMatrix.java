package TwoDimentionalArray.com;

public class SubMatrix {
	
	static int[][] sub(int a[][], int b[][])
	{
		int rows=a.length;
		int column=a[0].length;
		int c[][]=new int[rows][column];
		
		System.out.println("Using for loop");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<column;j++)
			{
				c[i][j]=a[i][j]-b[i][j];
			}
			System.out.println();
		}
		return c;
	}

	public static void main(String[] args) {
		int a[][]= {{8,7},{6,5}};
		int b[][]= {{4,3},{2,1}};
		
		int c[][]=sub(a,b);
		System.out.println("Using for each loop");
		System.out.println("Matrix of Subtracting A-B");
		for(int[] d:c)
		{
			for(int ab:d)
				System.out.println(ab + " ");
		}


	}

}
