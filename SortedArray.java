import java.util.*;

public class SortedArray{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of elements");
		int n=sc.nextInt();
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		int res[]=new int[arr1.length+arr2.length];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++){
		
			arr1[i]=sc.nextInt();
		
		}
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++){
		
			arr2[i]=sc.nextInt();
		
		}
		for(int i=0;i<arr1.length;i++){
			res[i]=arr1[i];
		
		}
		for(int i=0;i<arr2.length;i++){
			res[i+arr1.length]=arr2[i];
		
		}
		System.out.println("Merged Array:"+Arrays.toString(res));
		
	}

}
