import java.util.Scanner;
public class matrix{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int n = sc.nextInt();

		int arr[][] = new int[n][n];

		System.out.println("Enter the elements of the matrix: ");

		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        arr[i][j] = sc.nextInt();
		    }
		}
			for (int i=0;i<n;i++)
			{
			    for (int j=0;j<n;j++)
			    {
				if(i==j)
				{
				    System.out.println("\n"+"["+arr[i][j]+"]");
				}
			       else
				{
				    System.out.print("["+arr[i][j]+"]");
				}
			    }
			}
			System.out.println("]");
			}
		
		}



