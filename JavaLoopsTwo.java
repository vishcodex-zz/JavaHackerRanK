package org.hackerank.solutions;

import java.util.Scanner;

public class JavaLoopsTwo
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		for(int i=0;i<q;i++)
		{
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			for(int j=0;j<c;j++)
			{
				a += b * Math.pow(2, j);
				System.out.print(a + " ");
			}
			System.out.println();
		}
		scan.close();
	}
	

}
