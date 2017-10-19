/********************************************************************************
	 * Purpose: It Print different number of coupon
	 *
	 * @author:  jayesh patil
	 * @version: V1.0
	 * @since:   7-8-2017
	 *********************************************************************************/
package com.bridgelabz.programs;
import java.util.Scanner;

import com.bridgelabz.util.Futility;
public class coupon12
{
	

	
public static void main(String args[])
	{	
		 Scanner sc=new Scanner(System.in);
		System.out.println("numbers of coupon");
		int noofcoupon =sc.nextInt();
		int a[]=new int[noofcoupon];
		Futility.Functions(a,noofcoupon);
 	}
}
