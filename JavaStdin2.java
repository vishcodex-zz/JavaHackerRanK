package org.vish.oz;

import java.util.Scanner;

public class JavaStdin2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		double b = scan.nextDouble();
		scan.nextLine();
		String c = scan.nextLine();
		scan.close();
		
		System.out.println(c);
		System.out.println(b);
		System.out.println(a);
		
	}
}
