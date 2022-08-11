package ProgrammingPractices;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);   
		System.out.println("Enter a number you want to print multiplication table for");
		// reading a number whose table has to be print
		int num = sc.nextInt();
		// loop starts execution from and until the condition i<=10
		for(i=1; i<=10; i++)
		{
			System.out.println(num+"*"+i+" = "+num*i);
		}
	}
}
