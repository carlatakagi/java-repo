import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
      double renda;

      Scanner reader = new Scanner(System.in);
      renda = reader.nextDouble();

      if(renda > 0 && renda <= 2000) {
        System.out.println("Isento");
      } else if (renda > 2000 && renda <= 3000) {
        System.out.printf("R$ %.2f\n", ((renda - 2000) * 0.08));
      } else if (renda > 3000 && renda <= 4500) {
        System.out.printf("R$ %.2f", ((renda - 3000)  * 0.18) + 80));
      } else {
        System.out.printf("R$ %.2f", ((renda - 4500) * 0.28) + 350));
      }
    }
}