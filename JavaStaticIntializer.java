package org.hackerank.solutions;

import java.util.Scanner;

public class JavaStaticIntializer {
	private static int B;
	private static int H;
	private static boolean flag;
	
	static {
		Scanner scan = new Scanner(System.in);
		B = scan.nextInt();
		H = scan.nextInt();
		scan.close();
		if (B<=0 || H<=0)
		{
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		} else {
			flag = true;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(flag) {
			int area = B * H;
			System.out.print(area);
		}
		
	}

}
