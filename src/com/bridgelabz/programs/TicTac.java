/********************************************************************************
	 * Purpose: It Print & play tic tac game
	 *
	 * @author:  jayesh patil
	 * @version: V1.0
	 * @since:   7-8-2017
	 *********************************************************************************/package com.bridgelabz.programs;
import java.util.Scanner;
public class TicTac
	{
	static int i;
	
	public static char A[][]=new char[3][3];        
	public static char  user ='x';
	public static char computer = 'o';

	public static void main(String args[])
	{
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++)
				A[i][j]=' ';
		}
	System.out.println("welcome to tic tac game");
	if(Math.random()>0.5)
		{
		System.out.println("user is 1st");
		User(A);
		}
		else
		{
		System.out.println("compature is 1st");
		computer(A);
		int i;

		}

	}

	public static void User(char A[][])
		{	
			Scanner sc=new Scanner(System.in);
			System.out.println("Your Turn:");
			int row=sc.nextInt();
			int coloum=sc.nextInt();
			
			if(A[row][coloum] !='x' && A[row][coloum] !='o')
			{
				A[row][coloum]='x';
				System.out.println("A["+row+"]["+coloum+"]"+user);
				System.out.println();
				printTheBoard(A);
				if(userwin(A))
				{
				System.out.println("user win");	
				}
				else
					computer(A);
			}
			else{
				int i;		System.out.println("Non Empty Feild");
				User(A);
			}
			sc.close();
		}

	public static void computer(char A[][])
		{	
			System.out.println("Computer Turn:");
			int row=(int) (Math.random()*3);
			int coloum=(int)(Math.random()*3);
			System.out.println("A["+row+"]["+coloum+"]"+computer);
			System.out.println();
			if(A[row][coloum] !='x' && A[row][coloum] !='o')
			{
				A[row][coloum]='o';
				printTheBoard(A);
				if(computerwin(A))
				{
				System.out.println("computer win");
				}
				else
					User(A);
			}
			else{
				System.out.println("Non Empty Feild");
				computer(A);
			}
		}

	public static boolean computerwin(char A[][])
		{


	if((A[0][0]=='o' && A[0][1]=='o' && A[0][2]=='o') ||
		   (A[i][0]=='o' && A[i][1]=='o' && A[i][2]=='o') ||
		   (A[0][i]=='o' && A[1][i]=='o' && A[2][i]=='o') ||
		   (A[0][0]=='o' && A[1][1]=='o' && A[2][2]=='o') ||
		   (A[0][2]=='o' && A[1][1]=='o' && A[2][0]=='o'))
			{
			return true;
			}
		else
			return false;
	}		

	public static boolean userwin(char A[][])
		  {
		 if((A[i][0]=='x' && A[i][1]=='x' && A[i][2]=='x') ||
		    (A[0][i]=='x' && A[1][i]=='x' && A[2][i]=='x') ||
		    (A[0][2]=='x' && A[1][2]=='x' && A[2][2]=='x') ||

		    (A[0][0]=='x' && A[1][1]=='x' && A[2][2]=='x') ||
		    (A[0][2]=='x' && A[1][1]=='x' && A[2][0]=='x')) 
			{
			return true;
			}
		else
			{
			
			return false;			
			}

		}

	public static void printTheBoard(char A[][]) {
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print("_");
				System.out.print(A[i][j]+" | ");
			}	
			System.out.println();
		}
	}



	
}