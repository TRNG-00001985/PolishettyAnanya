package code;

import java.lang.reflect.Array;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		int sum=0;
		int i;
		int length=a.length;
		for(i=0;i<a.length;i++)
		{
			sum =sum+a[i];
		}
		
System.out.println("sum:"+sum);
double average=sum/length;
System.out.println("average is:"+average);
	}
	

}
