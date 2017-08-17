package org.vish.oz;

import java.util.Scanner;

public class JavaIfElse {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		scan.close();
		
		String ans="";
		if(n%2==1)
		{
			ans = "Weird";
		}
		else 
		{
			if(n >= 6 && n <=20) {
				ans="Weird";
			} else {
				ans = "Not Weird";
			}
		}
		System.out.println(ans);
	}
}
