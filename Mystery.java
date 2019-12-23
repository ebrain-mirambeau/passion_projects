import java.io.IOException;
import java.util.Scanner;

public class Mystery {
	public static void main(String[] args) throws IOException {
		
		int a, b, c, d;
		Scanner s = new Scanner(System.in);
		
		System.out.println("\n\t\tGreetings!!!\nLet's Play \"Secret\" Santa's Secret Message.");
		System.out.println();
		System.out.println("\t\tRules of the Game");
		System.out.println("1. You must correctly answer 2 of 3 questions for the grand reveal.");
		System.out.println("2. You only have ONE attempt to answer each question.");
		System.out.println("3. Answers to questions are multiple choice (case insensitive), so choose wisely!");
		System.out.println("   (Make sure to type the LETTER corresponding to your selection)");
		System.out.println("\n\t\tLet's Start!");
		
		System.out.println("\nWho is the author of \"Der Steppenwolf\"?");
		System.out.println("A. Cornelia Funke");
		System.out.println("B. Hermann Hesse");
		System.out.println("C. J.K. Rowling");
		
		System.out.println();
		//input
		System.out.print("Enter your response: ");
		//a = System.in.read();
		
		a = s.next().charAt(0); 
		System.out.println("\nYou entered: " + (char) a);
		//System.in.reset();
		
		
		System.out.println("\nWho is the author of \"The Nutcracker and the Mouse King\"?");
		System.out.println("A. Robert Frost");
		System.out.println("B. Jean-Paul Satre");
		System.out.println("C. E.T.A. Hoffmann");
		
		System.out.println();
		//input
		System.out.print("Enter your response: ");
		//b = System.in.read();
		b = s.next().charAt(0);
		System.out.println("\nYou entered: " + (char) b);
		
		System.out.println("\nHow many operas did Ludvig van Beethoven compose?");
		System.out.println("A. 1");
		System.out.println("B. 5");
		System.out.println("C. 9");
		
		System.out.println();
		//input
		System.out.print("Enter your response: ");
		//c =  System.in.read();
		c = s.next().charAt(0);
		System.out.println("\nYou entered: " + (char) c + "\n");
		
		int counter = 0;
		
		if (a == 'b' || a == 'B') {
			counter++;
		}
		if (b == 'c' || b == 'C') {
			counter++;
		}
		if(c == 'a' || c == 'A') {
			counter++;
		}
		
		System.out.println("You answered " + counter + " out of 3 correctly.");
		System.out.println();
		
		if(counter >= 2) {
			System.out.println("\t**********SECRET MESSAGE**********\n");
			System.out.println("A. How many years are in a decade?");
			System.out.println("B. Which year did the \"Miracle on Ice\" happen?");
			System.out.println("C. Which year was J.F.K. was elected to office?");
			System.out.println("D. What is the area code for Memphis, TN?");
			System.out.println();
			System.out.println();
			System.out.println("A^3+(B-C)*4+D = The year that your Santa was born!\n\nThank you for your "
					+ "service inside and outside of Oxford House.\nYour gift will both challenge you intellectually and bring you great joy.");
			
			System.out.println("\nWould you like a few hints?\n(If so, type either \'y\' or \'Y\')\n");
			
			//c =  System.in.read();
			System.out.print("Enter your response: ");
			d = s.next().charAt(0);
			System.out.println("\nYou entered: " + (char) d + "\n");
			
			if(d == 'y' || d == 'Y') {
				System.out.println("1. Remember the order of operations of arithmetic: Please Excuse My Dear Aunt Sally.");
				System.out.println("2. a^b = \'a\' raised to the power of \'b\'.");
				System.out.println("3. \'*\' is the multiplication symbol.");
			}
			System.out.println("\n\t\tGood luck!");	
		}
		else {
			System.out.print("Happy Holidays!!!\nTry again.");
		}
		
		
		
		s.close();
		System.exit(0);
		}
}
