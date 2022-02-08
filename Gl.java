

import java.util.Scanner;



public class Gl {

 

Scanner sc = new Scanner(System.in);

 

           //function to checkPalindrome

       public void checkPalindrome()  {
    	   System.out.println("Enter the no.");
    	   int no=sc.nextInt();
    	   int temp=no;
    	   int rev=0,rem;
    	   while(temp!=0) {
    		   rem=temp%10;
    		   rev=rev*10+rem;
    		   temp=temp/10;
    	   }
    	   if(no==rev){
    		   System.out.println(no+" is palidrome no.");
    	   }else {
    		   System.out.println(no+" is not a palidrome no.");
    	   }

      }

 

            //function to printPattern

       public void printPattern() {
    	   System.out.println("Enter the no.");
           int x=sc.nextInt();
           for(int i=0;i<=x;i++) {
        	   for(int j=x;j>=i;j--) {
        		   System.out.print("*");
        	   }
        	   System.out.println();
           }
      }

 

          //function to check no is prime or not

        public void checkPrimeNumber() {
        	System.out.println("Enter the no.");
        	int x=sc.nextInt();
        	int temp=0;
        	for(int i=2;i<x;i++) {
        		if(x%i==0) {
        			temp=temp+1;
        		}
        	}
            if(temp==0) {
            	System.out.println(x+" It is prime no.");
            }else {
            	System.out.println(x+" It is composite no.");
            }
        }

         

          // function to print Fibonacci Series

          public void printFibonacciSeries() {

                //initialize the first and second value as 0,1 respectively.

           int first = 0, second = 1;
           System.out.println(first+"  "+second);
           int c;
           for(int i=1;i<=15;i++) {
        	   c=first+second;
        	   first=second;
        	   second=c;
           }

          }

 

//main method which contains switch and do while loop

      public static void main(String[] args) {

                Gl obj = new Gl();

                int choice;

                Scanner sc = new Scanner(System.in);

do {

System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

System.out.println();

 

choice = sc.nextInt();

switch (choice) {

 

case 0:

choice = 0;

break;

 

case 1: {

obj.checkPalindrome();

}

break;

 

case 2: {

 

obj.printPattern();

}

break;

 

case 3: {

obj.checkPrimeNumber();

}

break;

 

case 4: {

 

obj.printFibonacciSeries();

}

break;

 

default:

System.out.println("Invalid choice. Enter a valid no.\n");

}

 

} while (choice != 0);

System.out.println("Exited Successfully!!!");

sc.close();

}

 

}

