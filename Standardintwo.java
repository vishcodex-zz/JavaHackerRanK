package org.vish.oz;

import java.util.Scanner;

public class Standardintwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
	        Scanner scan = new Scanner(System.in);
	        int i = scan.nextInt();
	        double d = scan.nextDouble();
	        scan.nextLine();
			String s = scan.nextLine();
	       // scan.nextLine();
			scan.close();
	        // Write your code here.

	        System.out.println("String: " + s);
	        System.out.println("Double: " + d);
	        System.out.println("Int: " + i);
	    }

	}

