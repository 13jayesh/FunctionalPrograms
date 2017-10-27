import java.util.Scanner;
public class primefactor 
{ 
	static int j,k,i,reversedInteger,remainder;
public static void primefact(int a, int b)
 			
{			int Array[]=new int[b];
	         for(int i=1;i<=b;i++)
	 		{
	             int count=0;
	             for(int j=2;j<=i/2;j++){
	                 if(i%j==0)
	                 count++;
	             }
	             if(count==0&&i!=0&&i!=1)/* if counter is equal to 0 then its prime number*/
	 			{
	               
	            	 
	                 	 while( Array[i]!=0 )
	                     {
	                         remainder = Array[i]%10;
	                         reversedInteger = reversedInteger*10 + remainder;
	                         Array[i]/= 10;
	                     }       
	                 	 if (Array[i] == reversedInteger)
	                         println(" is a palindrome"+Array[i]);
	                     else
	                         println(null);
	                     
	                      }
}
}
	  private static void println(String string) {
	// TODO Auto-generated method stub
	
}
	public static void main(String args[])
	 	{
	         int a=Integer.parseInt(args[0]);
	         int b=Integer.parseInt(args[1]);
	         int count;
	         primefact(a,b);
	 }
	
}

	
	

