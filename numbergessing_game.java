package first;

import java.util.Scanner;
import java.util.Random;

public class numbergessing_game 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		int NumberToGuess=rand.nextInt(100)+1;
		int guess;
		int NumberOfGuess=0;
		System.out.println("Welcome to Number Guessing Game....!!");
		System.out.println("I have selected the number between 1 to 100. Please try to guess it...!");
		do
		{
			System.out.println("Enter your guess number");
			guess=sc.nextInt();
			NumberOfGuess++;
			if(guess<NumberToGuess)
			{
				System.out.println("Too Low..!! Please try again");
			}
			else if(guess>NumberToGuess)
			{
				System.out.println("Too High..!! Please try again");
			}
			else
			{
				System.out.println("Congratulations..!! You Guess the Number"   +NumberOfGuess + " " + "attempt");
			}
		}while(guess!=NumberOfGuess);
	}

}
