import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		int counter;
		counter = 0;
		
		Scanner reader = new Scanner(System.in);
		
		for (int i = 1; i < 6; i++) {
			double number = reader.nextDouble();
			if (number % 2 == 0) {
				counter++;
			}
		}
		System.out.println(counter + " valores pares");
	}
}