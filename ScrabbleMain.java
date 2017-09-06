import java.util.Scanner;

/**
 * Beginnings of a Scrabble game.
 * 
 * @author Tim Corica, Peddie
 * @version 9/5/2017
 */
public class ScrabbleMain {

	public static void main(String[] args) {
		System.out.println("Hey, I'm running!");

		Dictionary.testMe();

		Dictionary d = new Dictionary();
		Scanner userInput = new Scanner(System.in);
		String s;
		do {
			System.out.print("Enter word to test (END to end):");
			s = userInput.nextLine();
			System.out.println(d.isWord(s));

		} while (!s.equals("END"));
		userInput.close();
		System.out.println("So long!");
	}
}
