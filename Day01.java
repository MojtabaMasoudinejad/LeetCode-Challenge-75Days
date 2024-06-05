import java.util.Scanner;

public class Day01 {

	public static void main(String[] args) {
		String result = "";
		String word1;
		String[] arrOfWord1 = null;
		String[] arrOfWord2 = null;
		Boolean wrongInsertWord1=true;
		Boolean wrongInsertWord2=true;


		Scanner scanner = new Scanner(System.in);

		while(wrongInsertWord1) {
			
			System.out.print("word1: ");
			word1 = scanner.next();
			arrOfWord1 = word1.split("");
			
			if (arrOfWord1.length < 2 || arrOfWord1.length > 100) {
				System.out.println("word cannot be less than 1 or bigger than 100 character; try again");

				

			} else {
				
				wrongInsertWord1 = false;
			}
			
			
		}
		
		
	
		
		while( wrongInsertWord2) {
			
			System.out.print("word2: ");
			String word2 = scanner.next();
			 arrOfWord2 = word2.split("");
		

			if (arrOfWord2.length < 2 || arrOfWord2.length > 100) {
				System.out.println("word cannot be less than 1 or bigger than 100 character; try again");

				

			} else {
				
				wrongInsertWord2 = false;
			}
		}
		
		

		
		if (arrOfWord1.length > arrOfWord2.length) {

			for (int i = 0; i < arrOfWord2.length; i++) {

				result = result + arrOfWord1[i] + arrOfWord2[i];
			}
			for (int i = arrOfWord2.length; i < arrOfWord1.length; i++) {
				result = result + arrOfWord1[i];
			}

		} else {
			for (int i = 0; i < arrOfWord1.length; i++) {

				result = result + arrOfWord1[i] + arrOfWord2[i];
			}
			for (int i = arrOfWord1.length; i < arrOfWord2.length; i++) {
				result = result + arrOfWord2[i];
			}

		}

		System.out.println(result);

	}

}
