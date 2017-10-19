package com.bridgelabz.programs;

import com.bridgelabz.util.Futility;

public class wind
{

public static void main(String args[])
{
		double windspeed =Double.parseDouble(args[0]);
		double temp =Double.parseDouble(args[0]);
		Futility.windChill(temp,windspeed);
	}


 }
