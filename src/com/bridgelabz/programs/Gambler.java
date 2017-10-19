/********************************************************************************
 * Purpose: Smulate a gambler where he starts with certain stake in INR and
 *          places fair Re 1 bet until he/she goes broke or reaches the goal set
 *          as input. Keeps track of the number of times won and number of
 *          bets made. Run the simulation N times.
 *
 * @author:  jayesh patil
 * @version: V1.0
 * @since:   7-8-2017
 *********************************************************************************/

package com.bridgelabz.programs;

import com.bridgelabz.util.Futility;

public class Gambler
{

public static void main(String args[])
{

int bet=Integer.parseInt(args[0]);
int goal=Integer.parseInt(args[0]);
int trial=Integer.parseInt(args[0]);
Futility.Function(bet,goal,trial);
}
}
