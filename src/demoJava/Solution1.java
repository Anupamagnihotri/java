package demoJava;

import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		int[] b = new int[10];
		int[] n = new int[100];
		
		{
			int t = sc.nextInt();
			for (int i = 0; i < t; i++) {
				a[i] = sc.nextInt();
				b[i] = sc.nextInt();
				n[i] = sc.nextInt();
				if(n[i]>=0 && n[i]<=15)
				{

					for (int i1 = 0; i1 < t; i1++) {
						double result = a[i1];
						int c = 0;
						for (int j = 0; j < n[i1]; j++) {
							result = result + ((Math.pow(2, c)) * (b[i1]));
							System.out.print((int) result + " ");
							c++;
						}
					System.out.println();
				}
				
			}
		}
		
		}
	}
}