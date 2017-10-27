package com.bridgelabz.util;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Futility
{

static Scanner sc=new Scanner(System.in);

public static char[] sort1(String upper)
{ 	
	char[] n1=upper.toCharArray();
	int length1=upper.length();
	char temp;
	for(int i=0;i<length1;i++)
	{
		for(int j=1;j<length1;j++)
		{ 
	         if(n1[j-1] > n1[j])
	                {  
	                 //swap elements  
	                temp = n1[j-1];  
	                n1[j-1] = n1[j];  
	                n1[j] = temp;         
	                }
         }
     }
        
   System.out.println("array after sort");
   		for(int i=0;i<length1;i++)
   			{
   				System.out.println(n1[i]);
   			}
   				return n1;

   }

		public static char[] sort2(String lower)
			{ 	
	
				char[] n2=lower.toCharArray();
				int length2=lower.length();
				char temp;
				for(int i=0;i<length2;i++)
					{
						for(int j=1;j<length2;j++)
							{ 
							if(n2[j-1] > n2[j])
								{  
								//swap elements  
								temp = n2[j-1];  
								n2[j-1] = n2[j];  
								n2[j] = temp;         
								}
							}
					}
        
						System.out.println("array after sort");
							for(int i=0;i<length2;i++)
								{
									System.out.println(n2[i]);
								}
									return n2;
			}
		public static void Function()
		{	System.out.println("enter string");
			String name1=sc.next();
			String name2=sc.next();
			System.out.println("enter string");
		String upper = name1.toLowerCase();
		String lower = name2.toLowerCase(); 
		char []s1 =sort1(upper);
		char []s2=sort2(lower);
			int counter=0;
			int size=s1.length;
			int size1=s2.length;
			for(int i=0;i<size;i++)
			{
				if(s1[i]==s2[i])
				{
					counter++;
				}	
			}		
				if(counter==size)
				{
					System.out.println("its anagram");
				}
				else
				{
					System.out.println("its not anagram" ); 
				}
}
public static void Primarypalindrom()
{		
	int a,cou=0,i1,counterr=0;
	int b;
	for(i1=2;i1<=1000;i1++)
	{	String wwe="",a1="";
     int count = 0;
    for(int j1=2;j1<=i1/2;j1++)
     {
    if(i1%j1==0)
     count++;
    }
   if(count==0&&i1!=0&&i1!=1)
	{	
	
	String wwe1 =""+i1;
	String reverse = new StringBuffer(wwe1).reverse().toString();
	if(wwe1.equals(reverse))
	{
		System.out.println(wwe1);
		counterr++;
	}
			}
	} 
	System.out.println("number of primepalindrom is"+counterr);
}

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
					System.out.print(a[i][j]+ " ");
						}

					}		
	}
	public static void Doubleval()
	{
	System.out.println("enter no rows");
	int row=sc.nextInt();
	System.out.println("enter no coloum");
	int coloum=sc.nextInt();
	
	double a[][]=new double[row][coloum];
	System.out.println("enter no rows");
	for(i=0;i<row;i++)
		{
		for(j=0;j<coloum;j++)
			{
			a[i][j]=sc.nextDouble();
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

	public static void booleanval()
	{
	System.out.println("enter no rows");
	int row=sc.nextInt();
	System.out.println("enter no coloum");
	int coloum=sc.nextInt();
	
	boolean a[][]=new boolean[row][coloum];
	System.out.println("enter elements");
	for(i=0;i<row;i++)
		{
		for(j=0;j<coloum;j++)
		{
			{
			a[i][j]=sc.nextBoolean();
			}
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
	static int count=0;
	public static void  Functions(int a[],int noofcoupon)
	{
		System.out.println("coupon rang ");
		for(int i=0;i<noofcoupon;)
		{
			
	
			int Randomno=100000+(int)(Math.random()*(999999-100000));
			//System.out.println(Randomno);
				int found=0;
			for(int j=i-1;j>=0;j--)
			{
				if(Randomno==a[j])
					found=1;
			}
	
		if(found==0)
		{
			a[i]=Randomno; 
				
			System.out.println("COUPONS NUMBER "+a[i]+ " ");
			i++;
		}
		count++;
	}
	System.out.println("total trial number "+count);
	}


public static void Function(int x,int y)
{
double distance = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));

System.out.println("ecludian distance is"+distance);

}
public static void coin()
{
float flip=0;
    float Count0=0;
        float Count1=0;
	for(int i=0;i<=10;i++)
            
	{       
		if(Math.random()>= 0.5)
		{
		System.out.println("Head");
		Count0++;
    		}
		else
        		{
		System.out.println(" Tail");
            	Count1++;
		}
	flip++;
		
	}
	System.out.println(Count0);
	System.out.println(Count1);	
	System.out.println(flip);
	float s=(Count0/flip)*100;
            float s1=(Count1/flip)*100;
	System.out.println("avg of head"+s);
	System.out.println("avg of tails"+s1);
}
public static void Function(int bet,int goal,int trial)
{
double i,cash=0.6;
while(cash>0 && cash>goal)
{
for(i=0;i<=trial;i++)
{
bet++;
if(Math.random()>0.5)
{
cash++;

}
else
{
cash--;
}
}
if(cash==goal)
{
System.out.println("you win");
}else
{
	System.out.println("you win");
}
}
}
public static void Function(int num)
{
int harmonic=0,i;
int numar=1;
int deno=1;
if(num>0)

for(deno=1;deno<=num;deno++)
    {

System.out.println(numar+"/"+deno);
}
}

public static void leapY(int year,int length)
{ 
   if(length==4)
{	
  
  if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
  {
  System.out.println("its leap year"+year);
  }
  else 
  {
  System.out.println("its not leap year"+year);
  }
}else
	{
		System.out.println("enter 4 digit number");
	}
}
public static void Poweoftwo(int x)
{
double b=0;
double i;
for(i=1;i<x;i++)
{
b=Math.pow(2,i);

System.out.println("powers of 2 is"+b );
}
}

public static void Quadratic(int a,int b,int c)
	{
double root1,root2;
System.out.println("Your Quadratic equation is: " + a + "x^2+" + b + "x+" + c);

int delta = ((b * b) - (4 * a * c));

if(delta > 0){
    System.out.println("There are two real roots");
    root1 = ((-b + Math.sqrt(delta)) / (2 * a));
    root2 = ((-b - Math.sqrt(delta)) / (2 * a));
    System.out.println("Root1 of x=" + root1);
    System.out.println("Root2 of x=" + root2);
}
else if (delta == 0){
    System.out.println("There is one real root");
    root1 = ((-b + Math.sqrt(delta)) / (2 * a));
    System.out.println("Root of x=" + root1);
}
else {
    System.out.println("There is no real root");
}
}
public static void Stopwat() {
	 long start = System.currentTimeMillis();
	 System.out.println("time is");
	 elapsedTime(); 
}

private static void elapsedTime() {
	long now = System.currentTimeMillis();
   long start = 0;
long elapsedT = (long) ((now - start));
   System.out.println(elapsedT);
   long durationInMs = TimeUnit.MILLISECONDS.convert(elapsedT, TimeUnit.NANOSECONDS);
}

public static void windChill(double temp, double windspeed) {
double a, b, c, windchil = 0; 
if (temp <= 50 && (windspeed <= 120 && windspeed >= 3)) {
	a = (35.74 + 0.6215); 
	b = ((0.4275 * temp) - 35.75);
	
	c = Math.pow(windspeed, 0.16); 
	windchil = (a + (b * c));
}
System.out.println("windspeed =" + windspeed + "\ntemperature =" + temp + "\nWind Chill=" + windchil);
}



public static void Function(int a[])
{	int length=a.length;
	 int i,j,k,size = 0;
	System.out.println("enter values");
	for(i=0;i<length;i++)
	{
		a[i]=sc.nextInt();
	}   
	int length1=a.length;
	
for(i=0;i<length1-2;i++)
{
	for(j=i+1;j<length1-1;j++)
	{
		for(k=j+1;k<length1;k++)
		{
			if(a[i]+a[j]+a[k]==0)
			{
				System.out.println(a[i]+ " - " +a[j]+" = " +a[k]);
			}
		}
	}
}

}	
}