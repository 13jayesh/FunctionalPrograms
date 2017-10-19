/********************************************************************************
 * Purpose: takes a command-line argument n and prints the nth harmonic number
 *
 * @author:  jayesh patil
 * @version: V1.0
 * @since:   7-8-2017
 *********************************************************************************/

package com.bridgelabz.programs;

import com.bridgelabz.util.Futility;

public class harmonicseries
{
	
public static void main(String args[])
	{
	  int num = Integer.parseInt(args[0]);
	  Futility.Function(num);
	}
}
