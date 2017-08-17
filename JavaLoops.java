package org.hackerank.solutions;

import java.util.Scanner;

public class JavaLoops {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i=1;
		int result;
		for(i=1;i<=10;i++)
		{
			System.out.format("%d * %d = %d%n",n,i,n*i);
		}

	}

}
