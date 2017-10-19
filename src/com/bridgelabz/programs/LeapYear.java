package com.bridgelabz.programs;

import com.bridgelabz.util.Futility;

public class LeapYear
{
    
public static void main(String args[])
{
		int year=Integer.parseInt(args[0]);
		int length=Integer.toString(year).length();
		Futility.leapY(year,length);
	}
}
