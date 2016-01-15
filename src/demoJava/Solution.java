package demoJava;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            String s1 = "";
            int x = 0;
            
            for(int i=0;i<3;i++)
            {
                 s1=sc.next();
                 x=sc.nextInt();
                 System.out.printf("%-14s %03d %n",s1,x);
                //Complete this line
            }
            System.out.println("================================");
    }
}