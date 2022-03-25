import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);
		int counter = 0;
		for (int i = 1; i < 7; i++) {
			double number = reader.nextDouble();
			if (number > 0) {
				counter++;
			}
		}
		System.out.printf("%d valores positivos\n", counter);
	}
}