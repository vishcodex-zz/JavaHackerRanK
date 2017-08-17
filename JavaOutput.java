package org.vish.oz;

import java.util.Scanner;

public class JavaOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.format("%-15s%03d%n", s1, x);
            
        }
        sc.close();
        System.out.println("================================");
	}

}
