/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Steven Tristan
 */

import java.util.Scanner;

public class example3
{
	public static void main(){
		ex3();
	}

	private static void ex3()
	{
		System.out.println("What is the input string?");
		Scanner s = new Scanner(System.in);
		String quote = s.nextLine();
		System.out.println("Who said it?");
		String author = s.nextLine();
		System.out.println(author + " says, " + "\"" + quote + "\"");
	}

}
