package com.nec.exceptionHandling;

import java.util.Scanner;

//how to create custom exception...
class AgeInvalidException extends Exception
{	AgeInvalidException()
	{
		super("Age is Invalid");
	}
	AgeInvalidException(String message)
	{		super(message);
	}

}
public class ExceptionHandlingClass
{
	public static void main(String[] args) {
		System.out.println("Started===Enter Two Numbers");//starting ...
		try
		{
			Scanner sc=new Scanner(System.in);
			int n1=sc.nextInt();
			int n2=sc.nextInt();
			System.out.println("We have got two numbers..");
			int result=n1/n2;
			System.out.println("Division is "+result);
			if(n2<10)
			{
				throw new AgeInvalidException("My age is invalid !!");
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("n2 can not be 0 !!");
			System.out.println(e.getMessage());	
		}
		catch (NumberFormatException e) {
			System.out.println("Invalid Numbers !!");
			System.out.println(e.getMessage());	
		}
		catch (AgeInvalidException e) {
			System.out.println("Coustom Method Call");
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Error !!");
			System.out.println(e.getMessage());
		}
		finally
		{			//always gets executed ..
			System.out.println("i am in finally block");
			System.out.println("closing all the resources...");
		}

		System.out.println("Terminated..");//ending point
	}
}


