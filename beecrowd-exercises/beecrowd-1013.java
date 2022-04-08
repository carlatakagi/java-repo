import java.io.IOException;
import java.util.Scanner;


public class Main {
 
    public static void main(String[] args) throws IOException {
      int valor1, valor2, valor3;

      Scanner reader = new Scanner(System.in);
      valor1 = reader.nextInt();
      valor2 = reader.nextInt();
      valor3 = reader.nextInt();
     
      if (valor1 > valor2 && valor1 > valor3) {
        	System.out.println(valor1 + " eh o maior");
        } else if (valor2 > valor3) {
        	System.out.println(valor2 + " eh o maior");
        } else {
        	System.out.println(valor3 + " eh o maior");
        }
    }
}