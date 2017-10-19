package com.bridgelabz.programs;
import java.util.Scanner;
public class replacestring
{  static String username; 
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		username=sc.next();
		if(username.length()<3)
		{
		System.out.println("Name has min 3 char");
		}
		else
			{
			System.out.println("hellooo"+username+"How are you?");
			}
	}
}
