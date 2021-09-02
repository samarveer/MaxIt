import java.util.Scanner;
import java.util.Random;

public class PlayGame {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Random rand = new Random();

		String[][] Board = new String[5][5];

		System.out.println("Player One, please enter your name: ");
		String name1 = in.nextLine();
		System.out.println("Player Two, please enter your name: ");
		String name2 = in.nextLine();
		
		
		System.out.println();

		in.close();
	}
}
