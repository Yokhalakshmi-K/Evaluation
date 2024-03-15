import java.util.*;
public class zerosones{

	public static void main(String[] args){
	int a[]={6,7,8,0,0,0,1,3,4};
	int start=0;
	int temp[]=new int[a.length];
	for(int i=0;i<a.length;i++){
		if(a[i]!=0){
			temp[start++]=a[i];
		}
		
	}
	System.out.println(Arrays.toString(temp));
	
	}
}
