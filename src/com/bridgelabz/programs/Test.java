package com.bridgelabz.util;
import java.util.Scanner;
public  class array
{
static Scanner sc=new Scanner(System.in);
static int i,j;

	public static void Integerval()
	{
	System.out.println("enter no rows");
	int row=sc.nextInt();
	System.out.println("enter no coloum");
	int coloum=sc.nextInt();
	System.out.println("enter no rows");
	int a[][]=new int[row][coloum];
	for(i=0;i<row;i++)
		{
		for(j=0;j<coloum;j++)
			{
			a[i][j]=sc.nextInt();
			}
		}
	System.out.println("the array in integer is");
				for(i=0;i<row;i++)
					{
					for(j=0;j<coloum;j++)
						{
					System.out.println(a[i][j]+ " ");
						}

					}		
	}

