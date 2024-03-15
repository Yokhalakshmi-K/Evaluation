import java.util.*;

public class Sorting{

private static int a = 10;

	public static void main(String[] args){
	int arr[]={1,2,3,4,5};
	int a = 6;
	short s=a;
	int temp;
	for(int i=0;i<arr.length-1;i++){
		for(int j=i+1;j<arr.length;j++){
			if(arr[i]<arr[j])   //    |    ||
			{
			temp=arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
			}
	
	}
	}
	System.out.println(Arrays.toString(arr));
	}

}
