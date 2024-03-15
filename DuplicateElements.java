import java.util.Scanner;

public class DuplicateElements{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of elements");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int j=0;
		for(int i=0;i<arr.length-1;i++){
		   
			if(arr[i]!=arr[i+1]){
			
			           arr[j++]=arr[i];
			}
			
		}
		arr[j++]=arr[arr.length-1];
		for(int k=0;k<j;k++){
			System.out.println(arr[k]);
		}
		
			
		
		}

}
