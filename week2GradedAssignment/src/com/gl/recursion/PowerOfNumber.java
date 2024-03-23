package com.gl.recursion;
import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base number: ");
		int a = sc.nextInt();
		System.out.println("Enter the power: ");
		int b = sc.nextInt();
		System.out.printf("%d ^ %d = %d",a, b, power(a,b));
		
		sc.close();
	}
	
	public static int power(int a, int b) {
		if(b>0) {
			return a*power(a, b-1);
		}
		return 1;
	}

}
