package code;
//import java.util.*;
import java.util.Arrays;

public class ArrayOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= new int[] {1,2,3,2,7,4,6,10};
		Arrays.sort(arr);
		System.out.println("min-"+arr[0]+  "max-"+arr[arr.length-1]); //min and max
		System.out.println(Arrays.toString(arr));
		int [] arr2= new int[] {1,5,2,8,3,5,9,0};
		System.out.println(arr.length);
		System.out.println(arr2.length);
		//int  ans = arr.length+ arr2.length;
		//int [] res = new int[ans];
		//System.out.println(Arrays.toString(arr)+Arrays.toString(arr2));
		System.out.println(arr.equals(arr2));
		int [] arr3= new int[] {1,2,3};
		int [] arr4= new int[] {1,2,3};
		System.out.println(Arrays.equals(arr3,arr4));
		int max=arr[arr.length-1];
		int min=arr[0];
		System.out.println("Max-Min="+(max-min));
		
	}

	boolean isSorted(int [] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
				return false;
			}
				return true;
	}
}
