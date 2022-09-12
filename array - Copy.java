package javaprograms;

import java.util.Scanner;

public class array {
	
	public static void main(String[] args) {
		int a[]=new int[5];
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter your values");
		for(int i=0;i<5;i++)
		{
			a[i]=scanner.nextInt();
		}
		System.out.println("output");
		for (int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
