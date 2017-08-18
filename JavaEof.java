package org.hackerank.solutions;

import java.util.Scanner;

public class JavaEof {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int i=1;
		while(scan.hasNextLine())
		{
			System.out.println(i+" "+scan.nextLine());
			i++;
		}
		scan.close();
	} 

}
