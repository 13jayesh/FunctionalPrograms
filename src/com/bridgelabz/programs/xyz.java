package com.bridgelabz.programs;

import java.util.Arrays;

public class xyz {

	public static void main(String[] args) {
		// TODO Auto-generpublic static void main (String args[])
		{
			
			String name1=args[0];
			String name2=args[1];
			Arrays.sort(name1);
			Arrays.sort(name2);
			String upper = name1.toLowerCase();
			String lower = name2.toLowerCase(); 
			if(fooString1.equals(fooString2);)

			}
			}ated method stub

	}

}
import java.util.Scanner;

public class primefactor 
{ static int flag;
	public static void primefact(int number)
	{
		for(int i=1;i*i<=number;i++)
		{
			if(number%i==0)
			{
				System.out.println("factors are");
				//9
				//System.out.println(+i+ "*" +i);
					for(int j=1;j<=number;j++)
				{
					if(number=number/j)
					{
						int (flag=1);
					//	System.out.println();
						}
					else
						{
						//System.out.println("primefactors are");
						//System.out.println(i);
						
						}
					}
				}
	
			}
		
		if(flag==1)
		{
			System.out.println("primefactors are");
			System.out.println(i);
		}
	}
	

	
	
	
	
	
	
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int number=sc.nextInt();
	primefact(number);
	}
//////////////////////////////////////////////////////////	public static void primefact(int n)
	{
		for(int i=2;i<=n;)
	
		  {
		   if(n%i == 0)
		    {
		     System.out.print(i+" ");
		     n=n/i;
		    }
		   else
		   {
		    i++;
		   }
		  }
	}
	
	/**
	 * public static void factorization(int number) {
		for (int factor = 2; factor * factor <= number; factor++) {
			// if factor is a factor of n, repeatedly divide it out
			while (number % factor == 0) {
				System.out.print(factor + " ");
				number = number / factor;
			}
		}
		// if biggest factor occurs only once, number > 1
		if (number > 1)
			System.out.println(number);
		else
System.out.println();**/
}



class Link {
    public int data1;
    public double data2;
    public Link nextLink;

    //Link constructor
    public Link(int d1, double d2) {
        data1 = d1;
        data2 = d2;
    }

    //Print Link data
    public void printLink() {
        System.out.print("{" + data1 + ", " + data2 + "} ");
    }
}

class LinkList {
    private Link first;

    //LinkList constructor
    public LinkList() {
        first = null;
    }

    //Returns true if list is empty
    public boolean isEmpty() {
        return first == null;
    }

    //Inserts a new Link at the first of the list
    public void insert(int d1, double d2) {
        Link link = new Link(d1, d2);
        link.nextLink = first;
        first = link;
    }

    //Deletes the link at the first of the list
    public Link delete() {
        Link temp = first;
        if(first == null){
         return null;
         //throw new NoSuchElementException(); // this is the better way. 
        }
        first = first.nextLink;
        return temp;
    }

    //Prints list data
    public void printList() {
        Link currentLink = first;
        System.out.print("List: ");
        while(currentLink != null) {
            currentLink.printLink();
            currentLink = currentLink.nextLink;
        }
        System.out.println("");
    }
}  

class LinkListTest {
    public static void main(String[] args) {
        LinkList list = new LinkList();

        list.insert(1, 1.01);
        list.insert(2, 2.02);
        list.insert(3, 3.03);
        list.insert(4, 4.04);
        list.insert(5, 5.05);

        list.printList();

        while(!list.isEmpty()) {
            Link deletedLink = list.delete();
            System.out.print("deleted: ");
            deletedLink.printLink();
            System.out.println("");
        }
        list.printList();
    }
}
