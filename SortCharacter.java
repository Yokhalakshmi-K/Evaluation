import java.util.*;
public class SortCharacter{

	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);
		
		String str=sc.next().toLowerCase();
		char temp;
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length-1;i++){
		      for(int j=i+1;j<ch.length;j++)
			if(ch[i]>ch[j]){
				temp=ch[j];
				ch[j]=ch[i];
				ch[i]=temp;
			
			}
		
		}
		System.out.println(new String(ch));
		
		
		
	
	}
	}


