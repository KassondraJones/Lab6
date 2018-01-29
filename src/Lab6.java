import java.util.Scanner;

public class Lab6 {

	public static void main(String[] args) {

		// initialize all variables
		Scanner scan = new Scanner(System.in);
		String userResponse = "y";
		String word;

		// introduce the program to user
		System.out.println("Welcome to the Pig Latin Translator!");

		// set up while loop for continuation option
		while (userResponse.equalsIgnoreCase("y")) {

			// prompt user to enter a line to translate
			System.out.println(" ");
			System.out.println("Enter a line to be translated:  ");
			word = scan.nextLine();

			// split phrase by " " and store as an array
			String[] wordArr = word.split(" ");

			// for loop that will run through every word in a given sentence
			for (int i = 0; i < wordArr.length; i++) {

				// call pig Latin method on the whole array and put all to lowercase
				System.out.print(toPigLatin(wordArr[i]).toLowerCase());
			}

			// prompt user if they would like to continue
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("Translate another line?  (y/n):");
			userResponse = scan.nextLine();

		}

		// terminate program if user does not wish to continue
		System.out.println("Thank you for your time!");
		System.out.println("Goodbye!");

		scan.close();

	}

	public static String toPigLatin(String word) {

		int vowelLocation = 0;

		// Find location of first vowel
		for (int i = 0; i < word.length(); i++) {
			if (checkVowel(word.charAt(i))) {
				vowelLocation = i;
				break;
			} else
				vowelLocation = i;
		}

		// If first letter is vowel print "way" at end
		if (vowelLocation == 0) {
			return (word + "way ");
		}
		// Converts to pig Latin from location of first vowel
		else {
			String first = word.substring(0, vowelLocation);
			String last = word.substring(vowelLocation);
			return (last + first + "ay ");
		}
	}

	public static boolean checkVowel(char vowel) {
		if (vowel == 'a' || vowel == 'A') {
			return true;
		}
		if (vowel == 'e' || vowel == 'E') {
			return true;
		}
		if (vowel == 'i' || vowel == 'I') {
			return true;
		}
		if (vowel == 'o' || vowel == 'O') {
			return true;
		}
		if (vowel == 'u' || vowel == 'U') {
			return true;
		}

		return false;
	}

}
