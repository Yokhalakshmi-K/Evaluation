import java.util.Scanner;

public class ReverseArray{

	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of elements");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++){
		
			arr[i]=sc.nextInt();
		
		}
		System.out.print("The Reversed Array is: ");
		for(int i=arr.length-1;i>=0;i--){
		
			System.out.print(arr[i]+" ");
		
		}
	
		System.out.println();
	}

}
