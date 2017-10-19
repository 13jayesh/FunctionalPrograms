import java.util.Scanner;

public class ZERO 
{	
	static Scanner sc=new Scanner(System.in);
	static int i,j,k,size;

	public static void Function(int a[])
	{	
		
		System.out.println("enter values");
		for(i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}   
		int length=a.length;
		
	for(i=0;i<length-2;i++)
	{
		for(j=i+1;j<length-1;j++)
		{
			for(k=j+1;k<length;k++)
			{
				if(a[i]+a[j]+a[k]==0)
				{
					System.out.print(a[i]+ " " +a[j]+" " +a[k]);
				}
			}
		}
	}
	
	}	
	
public static void main(String[] args) {
	
	System.out.println("enter size");
	size=sc.nextInt();
	int a[]=new int[size];
		Function(a);

	}

}
