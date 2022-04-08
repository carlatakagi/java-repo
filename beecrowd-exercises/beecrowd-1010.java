import java.io.IOException;
import java.util.Scanner;


public class Main {
 
    public static void main(String[] args) throws IOException {
      int codigo1, quant1, codigo2, quant2;
      double valorUnit1, valorUnit2, total;

      Scanner reader = new Scanner(System.in);
      codigo1 = reader.nextInt();
      quant1 = reader.nextInt();
      valorUnit1 = reader.nextDouble();
      codigo2 = reader.nextInt();
      quant2 = reader.nextInt();
      valorUnit2 = reader.nextDouble();

      total = (quant1 * valorUnit1) + (quant2 * valorUnit2);
      System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));
    }
 
}