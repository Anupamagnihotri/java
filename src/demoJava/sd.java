package demoJava;

import java.util.Scanner;



    public class sd {

        public static void main(String[] args) {


                 Scanner sc=new Scanner(System.in);
                 int n=sc.nextInt();  
          
                 String ans="";
                 if(n%2==1)
                 {
                	
                   ans = "Weird";
                 }
                 else 
                 {   
                   if (n>=2 && n<=5) 
                   {
                   ans="Not Weird";//Complete the code
                   	}
                   else if(n>=6 && n<=20)
                   {
                   ans = "Weird";
                   }
                   else if(n>20)
                   {
                   ans = "not Weird";   
                   }
                 }
                 System.out.println(ans);
                 
             }
    }

