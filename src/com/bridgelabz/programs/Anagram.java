
/******************************************************************************
*  Compilation:  javac -d bin threenames.java
*  Execution:    java -cp bin com.threenames.util.PrimeChecker n
*  
*  Purpose: cheack either it is anagram or not.
*
*  @author  jayesh patil
*  @version 1.0
*  @since   11-08-2017
*
******************************************************************************/
package com.bridgelabz.programs;
import java.util.Scanner;
public class Anagram
{
	static Scanner sc=new Scanner(System.in);
	
	public static char[] sort1(String upper)
	{ 	
		char[] n1=upper.toCharArray();
		int length1=upper.length();
		char temp;
		for(int i=0;i<length1;i++)
		{
			for(int j=1;j<length1;j++)
			{ 
		         if(n1[j-1] > n1[j])
		                {  
		                 //swap elements  
		                temp = n1[j-1];  
		                n1[j-1] = n1[j];  
		                n1[j] = temp;         
		                }
	         }
	     }
	        
	   System.out.println("array after sort");
	   		for(int i=0;i<length1;i++)
	   			{
	   				System.out.println(n1[i]);
	   			}
	   				return n1;

	   }

			public static char[] sort2(String lower)
				{ 	
				
					char[] n2=lower.toCharArray();
					int length2=lower.length();
					char temp;
					for(int i=0;i<length2;i++)
						{
							for(int j=1;j<length2;j++)
								{ 
								if(n2[j-1] > n2[j])
									{  
									//swap elements  
									temp = n2[j-1];  
									n2[j-1] = n2[j];  
									n2[j] = temp;         
									}
								}
						}
	        
							System.out.println("array after sort");
								for(int i=0;i<length2;i++)
									{
										System.out.println(n2[i]);
									}
										return n2;
				}
			public static void Function()
			{	System.out.println("enter string");
				String name1=sc.nextLine();
				System.out.println("enter string");
				String name2=sc.nextLine();
				System.out.println(name2);
				name1 = name1.replace(" ","");
				name2 = name2.replace(" ","");
				System.out.println("enter string");
			String upper = name1.toLowerCase();
			String lower = name2.toLowerCase(); 
			char []s1 =sort1(upper);
			char []s2=sort2(lower);
				int counter=0;
				int size=s1.length;
				int size1=s2.length;
				for(int i=0;i<size;i++)
				{
					if(size==size1)
					{
					if(s1[i]==s2[i])
					{
						counter++;
					}	
				}
				}
					if(counter==size)
					{
						System.out.println("its anagram");
					}
					else
					{
						System.out.println("its not anagram" ); 
					}

			}
public static void Primarypalindrom()
{		
		int a,cou=0,i1,counterr=0;
		int b;
		for(i1=11;i1<=1000;i1++)
		{	String wwe="",a1="";
         int count = 0;
        for(int j1=2;j1<=i1/2;j1++)
         {
        if(i1%j1==0)
         count++;
        }
       if(count==0&&i1!=0&&i1!=1)
		{	
    	
		String wwe1 =""+i1;
		String reverse = new StringBuffer(wwe1).reverse().toString();
		if(wwe1.equals(reverse))
		{
			System.out.println(wwe1);
			counterr++;
		}
				}
		} 
		System.out.println("number of primepalindrom is"+counterr);
}
			 
			
	 
public static void main (String args[])	
	{
	
		System.out.println("enter choice-1)anagram...2)primary anagram no ");
		int choice=Integer.parseInt(sc.nextLine());
		switch(choice)
		{
		case 1:
		{
		Function();
		break;
		}
		case 2:
		{
			Primarypalindrom();
		}
		}
	}

}
