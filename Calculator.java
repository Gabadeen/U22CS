import java.util.Scanner;

public class Calculator

{

public static void main (String args[])

{

char c;

double a,b;

Scanner sc = new Scanner(System.in);

System.out.println("Enter the first number:");

a = sc.nextDouble();

System.out.println("Enter the operator (+,-,*,/)");

c = sc.next().charAt(0);

System.out.println("Enter the second number :");

b = sc.nextDouble();

sc.close();

switch (c)

{

case'+':

System.out.printf("%.2f+%.2f=%.2f",a, b, (a+b));

break;

case'-':

System.out.printf("%.2f-%.2f=%.2f",a, b, (a-b));

break;

case'*':

System.out.printf("%.2f*%.2f=%.2f",a, b, (a*b));

break;

case'/':

if(b!=0)

System.out.printf("%.2f/%.2f = %.2f",a, b, (a/b));

else

System.out.printf("Division by zero is not possible ");

break;

default :

System.out.println("you entered invalid operator ");

break;

//lets run the program

}

}

}