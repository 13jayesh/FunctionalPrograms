
/********************************************************************************
 * Purpose: find the roots of the equation a*x*x + b*x + c. Since the equation
 *          is x*x, hence there are 2 roots.
 *
 * @author: jayesh patil
 * @version: V1.0
 * @since: 7-8-2017
 *********************************************************************************/
package com.bridgelabz.programs;
import java.util.Scanner;

import com.bridgelabz.util.Futility;

public class Quadratic {

       
   public static void main(String args[]){
     

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a = sc.nextInt();
        System.out.print("Enter the value of b:");
        int b = sc.nextInt();
        System.out.print("Enter the vale of c:");
        int c = sc.nextInt();
	Futility.Quadratic(a,b,c);
}
}
