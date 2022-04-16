import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int A, B, SOMA;

        Scanner reader = new Scanner(System.in);

        A = reader.nextInt();
        B = reader.nextInt();
        SOMA = A + B;

        System.out.println("SOMA = " + SOMA);
    
    }
 
}