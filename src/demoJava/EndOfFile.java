package demoJava;

import java.util.Scanner;

public class EndOfFile {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		for (int i =1; sc.hasNext(); i++) 
		{
			String s=sc.nextLine();
			System.out.println(i+" "+s);
		}
	}
}
