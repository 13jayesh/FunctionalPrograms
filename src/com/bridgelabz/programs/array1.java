/********************************************************************************
	 * Purpose: It Print decimal number to binary number. 
	 *
	 * @author:  jayesh patil
	 * @version: V1.0
	 * @since:   7-8-2017
	 *********************************************************************************/
package com.bridgelabz.programs;
import java.util.Scanner;

import com.bridgelabz.util.Futility;
public  class array1
{


public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("1)INTEGER VALUE,2)dOUBLE VALUE,3)bOOLEAn VALUE");
int choice=sc.nextInt();
switch(choice)
{
	case 1:
	Futility.Integerval();
	break;
	case 2:
		Futility.Doubleval();
	break;
	case 3:
		Futility.booleanval();
	break;
	
}
}
}
