package code;

public class MatrixOperations {
	public static void main(String[] args)
	{
		int a[][]={{1,2,3},{2,3,4},{3,4,5}};
		int b [] []= {{1,3,5},{2,4,6},{3,5,7}};
		int c[][]=new int [3][3];
		int d[][]=new int [3][3];
		int e[][]=new int [3][3];
		for( int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				d[i][j]=a[i][j]-b[i][j];
				e[i][j]=a[i][j]*b[i][j];
			System.out.print(c[i][j]);
			//System.out.print(d[i][j]);
			//System.out.print(e[i][j]);
			
		}
			System.out.println();
	}
}
}
