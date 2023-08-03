import java.util.*;
import java.util.Random;
import java.io.Console;

public class Main {

	public static void pattern_1() {
		System.out.println("\t");
		for (int i = 1; i <= 11; i++) {

			for (int j = 1; j <= 10; j++) {
				System.out.print("*");
			}
		}
	}

	public static int Show_screen() {
		int user_choice;
		pattern_1();
		Scanner obj = new Scanner(System.in);
		System.out.println("\n\n\t\t\t\t********** ROCK PAPER SCISSORS GAME********** ");
		System.out.println("\n\n\t\t\t\t********** RULES TO PLAY THE GAME **********");
		System.out.println("\t\t\t\t********** 1. SCISSORS BEATS PAPER **********");
		System.out.println("\t\t\t\t********** 2. ROCK BEATS SCISSORS  **********");
		System.out.println("\t\t\t\t********** 3. PAPER BEATS ROCK **********");

		System.out.println("\n\n\t\t\t\t********** PRESS 1 TO PLAY WITH COMPUTER **********");
		System.out.println("\t\t\t\t********** PRESS 2 TO PLAY WITH YOUR FRIEND **********");
		System.out.print("\n\t\t\t\t\tYOUR CHOICE : ");
		// RULES

		user_choice = obj.nextInt();
		return user_choice;
	}

	public static int validate_choice(int x) {
		int valid = 0;

		if (x == 1 || x == 2)
			valid = 1;
		else
			valid = 0;
		return valid;
	}

	public static void play_with_computer() {
		int computer_choice, user_choice, i = 1, score1 = 0, score2 = 0, valid = 0;
		Scanner obj = new Scanner(System.in);
		String user_name, user;
		pattern_1();
		System.out.println("\n\t\t\t\t**********COOL !! THE COMPUTER IS EXCITED TO PLAY WITH YOU**********");
		System.out.print("\n\t\t\t\t\t**********PLEASE ENTER YOUR NAME : ");
		user = obj.nextLine();
		user_name = user.toUpperCase();
		System.out.println("\n\t\t\t\t\tHELLO " + user_name + " , NICE TO MEET YOU.  ");
		System.out.println("\n\t\t\t\t\tGOOD LUCK FOR THE GAME !!!");
		pattern_1();

		while (i <= 5) {

			int min = 1;
			int max = 3;
			computer_choice = (int) Math.floor(Math.random() * (max - min + 1) + min);
			pattern_1();
			System.out.println("\n\t\t\t\t\t\t\tROUND - " + i);

			System.out.println("\n\t\t\t\t**********THE COMPUTER ALREADY MADE ITS CHOICE ********** ");
			System.out.println("\n\t\t\t\t**********PLEASE MAKE YOURS **********");
			System.out.println("\n\t\t\t\t\tPRESS 1 FOR ROCK ");
			System.out.println("\n\t\t\t\t\tPRESS 2 FOR PAPER ");
			System.out.println("\n\t\t\t\t\tPRESS 3 FOR SCISSORS ");
			System.out.print("\n\t\t\t\t\t\tYOUR CHOICE : ");
			user_choice = obj.nextInt();

			if (computer_choice == 1 && user_choice == 1) // rock and rock = tie
			{

				System.out.println("\n\t\t\t\tOOPS !! BOTH CHOOSES THE SAME ! ");
				System.out.println("\n\t\t\t\tTHE RESULT IS TIE !");
			}

			if (computer_choice == 2 && user_choice == 2) // paper and paper = tie
			{

				System.out.println("\n\t\t\t\tOOPS !! BOTH CHOOSES THE SAME ! ");
				System.out.println("\n\t\t\t\tTHE RESULT IS TIE !");
			}

			if (computer_choice == 3 && user_choice == 3) // scissors and scissors = tie
			{

				System.out.println("\n\t\t\t\tOOPS !! BOTH CHOOSES THE SAME ! ");
				System.out.println("\n\t\t\t\tTHE RESULT IS : TIE !");
			}

			if (computer_choice == 1 && user_choice == 2) // rock and paper = paper
			{

				score2++;
				System.out.println("\n\t\t\t\tTHE COMPUTER CHOOSED ROCK AND YOU CHOOSED PAPER ");
				System.out.println("\n\t\t\t\tTHE PAPER WINS AGAINST ROCK ");
				System.out.println("\n\t\t\t\tTHE RESULT IS :" + user_name + " WINS THIS ROUND");
			}

			if (computer_choice == 2 && user_choice == 1) // paper and rock = paper
			{
				score1++;

				System.out.println("\n\t\t\t\tTHE COMPUTER CHOOSED PAPER AND YOU CHOOSED ROCK ");
				System.out.println("\n\t\t\t\tTHE PAPER WINS AGAINST ROCK ");
				System.out.println("\n\t\t\t\tTHE RESULT IS :COMPUTER WINS THIS ROUND!!");
			}

			if (computer_choice == 1 && user_choice == 3) // rock and scissors = rock
			{
				score1++;

				System.out.println("\n\t\t\t\tTHE COMPUTER CHOOSED ROCK AND YOU CHOOSED SCISSORS ");
				System.out.println("\n\t\t\t\tTHE ROCK WINS AGAINST SCISSORS ");
				System.out.println("\n\t\t\t\tTHE RESULT IS :COMPUTER WINS THIS ROUND!!");
			}

			if (computer_choice == 3 && user_choice == 1) // scissors and rock = rock
			{

				score2++;
				System.out.println("\n\t\t\t\tTHE COMPUTER CHOOSED SCISSORS AND YOU CHOOSED ROCK ");
				System.out.println("\n\t\t\t\tTHE ROCK WINS AGAINST SCISSORS ");
				System.out.println("\n\t\t\t\tTHE RESULT IS :" + user_name + " WINS THIS ROUND!!");
			}

			if (computer_choice == 2 && user_choice == 3) // paper and scissors = scissors
			{
				score2++;
				System.out.println("\n\t\t\t\tTHE COMPUTER CHOOSED PAPER AND YOU CHOOSED SCISSORS ");
				System.out.println("\n\t\t\t\tTHE SCISSORS WINS AGAINST PAPER ");
				System.out.println("\n\t\t\t\tTHE RESULT IS :" + user_name + " WINS THIS ROUND!!");

			}

			if (computer_choice == 3 && user_choice == 2) // scissors and paper = scissors
			{
				score1++;

				System.out.println("\n\t\t\t\tTHE COMPUTER CHOOSED SCISSORS AND YOU CHOOSED PAPER ");
				System.out.println("\n\t\t\t\tTHE SCISSORS WINS AGAINST PAPER ");
				System.out.println("\n\t\t\t\tTHE RESULT IS :COMPUTER WINS THIS ROUND!!");
			}

			i++;
		}

		pattern_1();
		pattern_1();

		if (score1 > score2) {
			System.out.print("\n\t\t\t\t\tSCORE OF COMPUTER : " + score1);

			System.out.print("\n\t\t\t\t\tSCORE OF " + user_name + " : " + score2);

			System.out.println("\n\t\t\t\t\t**********OOPS !! YOU LOSE AGAINST COMPUTER********** ");
			System.out.println("\n\t\t\t\t\t**********TRY YOUR LUCK NEXT TIME **********");

			pattern_1();
			pattern_1();
			pattern_1();

		} else if (score1 < score2)

		{
			System.out.print("\n\t\t\t\t\tSCORE OF COMPUTER : " + score1);

			System.out.print("\n\t\t\t\t\tSCORE OF " + user_name + " : " + score2);
			System.out.println("\n\t\t\t\t\t**********CONGRATULATIONS !! YOU WON AGAINST COMPUTER**********");

			pattern_1();
			pattern_1();
			pattern_1();
		}

		else if (score1 == score2) {
			System.out.print("\n\t\t\t\t\tSCORE OF COMPUTER : " + score1);

			System.out.print("\n\t\t\t\t\tSCORE OF " + user_name + " : " + score2);
			System.out.println("\n\t\t\t\t**********OOPS !! BOTH HAVE THE SAME POINTS !!**********");
			System.out.println("\n\t\t\t\t**********THE FINAL RESULT IS TIE BETWEEN THE TWO TEAMS********** ");
			pattern_1();
			pattern_1();
			pattern_1();
		}

	}

	public static void play_with_user() {
		int score1 = 0, score2 = 0, i = 1, valid = 0;

		String Name = "", Friend_name = "", name, friend_name;
		System.out.println("\n\t\t\t\t**********AWESOME !! YOU TWO BUDDIES ARE GOING TO ENJOY THIS GAME **********");

		System.out.print("\n\t\t\t\t\tPLEASE ENTER YOUR NAME  : ");
		Scanner sc = new Scanner(System.in);
		Name = sc.nextLine();
		System.out.print("\n\t\t\t\t\tPLEASE ENTER YOUR FRIEND'S NAME : ");
		Friend_name = sc.nextLine();
		name = Name.toUpperCase();
		friend_name = Friend_name.toUpperCase();
		System.out.println("\n\t\t\t\t\t**********WELCOME " + name + " AND " + friend_name + " **********");
		System.out.println("\n\t\t\t\t\t**********GOOD LUCK FOR THE GAME **********");
		pattern_1();
		Console cons;

		while (i <= 5) {
			pattern_1();
			System.out.println("\n\t\t\t\t\t\tROUND " + i);
			if ((cons = System.console()) != null) {
				char[] pass_word1 = null;
				char[] pass_word2 = null;
				try {
					pass_word1 = cons.readPassword("\n\t\t\t\t\t" + name + "'S" + " TURN : ");
					int choice1 = Integer.parseInt(new String(pass_word1));

					if (pass_word1.length == 1 && choice1 == 1 || choice1 == 2 || choice1 == 3)
						valid = 1;
					else {
						System.out.println("Not valid ! Please enter a valid one !");
						System.exit(0);
					}

					pass_word2 = cons.readPassword("\n\t\t\t\t\t" + friend_name + "'S" + " TURN :  ");
					int choice2 = Integer.parseInt(new String(pass_word2));
					if (pass_word2.length == 1 && choice2 == 1 || choice2 == 2 || choice2 == 3)
						valid = 1;
					else {
						System.out.println("Not valid ! Please enter a valid one !");
						System.exit(0);
					}

					if (choice1 == 1 && choice2 == 1) // rock and rock = tie
					{

						System.out.println("\n\t\t\t\tOOPS !! BOTH CHOOSES THE SAME ! ");
						System.out.println("\n\t\t\t\tTHE RESULT IS TIE !");
					}

					if (choice1 == 2 && choice2 == 2) // paper and paper = tie
					{

						System.out.println("\n\t\t\t\tOOPS !! BOTH CHOOSES THE SAME ! ");
						System.out.println("\n\t\t\t\tTHE RESULT IS TIE !");

					}

					if (choice1 == 3 && choice2 == 3) // scissors and scissors = tie
					{

						System.out.println("\n\t\t\t\tOOPS !! BOTH CHOOSES THE SAME ! ");
						System.out.println("\n\t\t\t\tTHE RESULT IS TIE !");
					}

					if (choice1 == 1 && choice2 == 2) // rock and paper = paper
					{

						score2++;
						System.out
								.println("\n\t\t\t\t" + name + " CHOOSED ROCK AND " + friend_name + " CHOOSED PAPER ");
						System.out.println("\n\t\t\t\tTHE PAPER WINS AGAINST ROCK ");
						System.out.println("\n\t\t\t\tTHE RESULT IS : " + friend_name + " WINS THIS ROUND");

					}

					if (choice1 == 2 && choice2 == 1) // paper and rock = paper
					{
						score1++;

						System.out
								.println("\n\t\t\t\t" + name + " CHOOSED PAPER AND " + friend_name + " CHOOSED ROCK ");
						System.out.println("\n\t\t\t\tTHE PAPER WINS AGAINST ROCK ");
						System.out.println("\n\t\t\t\tTHE RESULT IS : " + name + " WINS THIS ROUND");

					}

					if (choice1 == 1 && choice2 == 3) // rock and scissors = rock
					{
						score1++;

						System.out.println(
								"\n\t\t\t\t" + name + " CHOOSED ROCK AND " + friend_name + " CHOOSED SCISSORS ");
						System.out.println("\n\t\t\t\tTHE ROCK WINS AGAINST SCISSORS ");
						System.out.println("\n\t\t\t\tTHE RESULT IS : " + name + " WINS THIS ROUND");

					}

					if (choice1 == 3 && choice2 == 1) // scissors and rock = rock
					{

						score2++;
						System.out.println(
								"\n\t\t\t\t" + name + " CHOOSED SCISSORS AND " + friend_name + " CHOOSED ROCK ");
						System.out.println("\n\t\t\t\tTHE ROCK WINS AGAINST SCISSORS ");
						System.out.println("\n\t\t\t\tTHE RESULT IS : " + friend_name + " WINS THIS ROUND");

					}

					if (choice1 == 2 && choice2 == 3) // paper and scissors = scissors
					{

						score2++;
						System.out.println(
								"\n\t\t\t\t" + name + " CHOOSED PAPER AND " + friend_name + " CHOOSED SCISSORS ");
						System.out.println("\n\t\t\t\tTHE SCISSORS WINS AGAINST PAPER ");
						System.out.println("\n\t\t\t\tTHE RESULT IS : " + friend_name + " WINS THIS ROUND");

					}

					if (choice1 == 3 && choice2 == 2) // scissors and paper = scissors
					{
						score1++;

						System.out.println(
								"\n\t\t\t\t" + name + " CHOOSED SCISSORS AND " + friend_name + " CHOOSED PAPER ");
						System.out.println("\n\t\t\t\tTHE SCISSORS WINS AGAINST PAPER ");
						System.out.println("\n\t\t\t\tTHE RESULT IS : " + name + " WINS THIS ROUND");
					}

					i++;
				}

				finally {
					if (pass_word1 != null) {
						java.util.Arrays.fill(pass_word1, '%');
					}
				}
			} else {
				throw new RuntimeException("No console");
			}
		}
		if (score1 > score2) {
			System.out.print("\n\t\t\t\t\tSCORE OF " + name + " : " + score1);
			System.out.print("\n\t\t\t\t\tSCORE OF " + friend_name + " : " + score2);
			System.out.println("\n\t\t\t\t\t**********CONGRATULATIONS !! " + name + " WINS THIS ROUND **********");

		} else if (score1 < score2) {
			System.out.print("\n\t\t\t\t\tSCORE OF " + name + " : " + score1);
			System.out.print("\n\t\t\t\t\tSCORE OF " + friend_name + " : " + score2);
			System.out
					.println("\n\t\t\t\t\t**********CONGRATULATIONS !! " + friend_name + " WINS THIS ROUND **********");

		}

		else if (score1 == score2) {
			System.out.print("\n\t\t\t\t\tSCORE OF " + name + " : " + score1);
			System.out.print("\n\t\t\t\t\tSCORE OF " + friend_name + " : " + score2);
			System.out.println("\n\t\t\t\t**********OOPS !! BOTH HAVE THE SAME POINTS !!**********");
			System.out.println("\n\t\t\t\t**********THE FINAL RESULT IS TIE BETWEEN THE TWO TEAMS********** ");
		}

	}

	public static char play_again() {
		pattern_1();
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\t\t\t\t\t**********DO YOU WANT TO PLAY AGAIN ?(y/n)**********");
		System.out.print("\n\t\t\t\t\t\t********** YOUR RESPONSE : ");
		char response;
		response = sc.next().charAt(0);
		if (response == 'y')
			return response;
		else {
			System.out.println("\n\t\t\t\t\t**********THANKYOU FOR PLAYING WITH US !! **********");
			return 0;
		}
	}

	public static void main(String[] args) {

		int user_choice;
		user_choice = Show_screen();
		int validate = validate_choice(user_choice);

		if (validate == 0) {
			System.out.println("\t\t\t**********PLEASE PROVIDE THE CORRECT RESPONSE **********");
			System.exit(0);
		}

		if (user_choice == 1) {
			play_with_computer();
		}

		if (user_choice == 2) {
			play_with_user();
		}
		char response = play_again();

		while (response == 'y') {

			user_choice = Show_screen();
			validate = validate_choice(user_choice);
			if (user_choice == 1) {
				play_with_computer();
			}

			if (user_choice == 2) {
				play_with_user();
			}

		}

		if (response == 0) {
			System.exit(0);
		}

	}
}
