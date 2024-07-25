package code;

public class TransposeOfAMatrix {
	public static void main(String[] args)
	
	{
		int a[][]={{1,2,7},{9,5,4},{8,4,6}};
		int aT[][]=new int [3][3];//aT-Transpose Matrix
		for( int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
		aT[i][j]=a[j][i];
		System.out.print(aT[i][j]);
		
	}

}
	}
}
