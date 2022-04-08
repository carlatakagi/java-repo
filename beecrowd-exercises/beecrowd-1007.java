import java.io.IOException;
import java.util.Scanner;


public class Main {
 
    public static void main(String[] args) throws IOException {
        int A, B, C, D, dif;
        
        Scanner reader = new Scanner(System.in);
        A = reader.nextInt();
        B = reader.nextInt();
        C = reader.nextInt();
        D = reader.nextInt();
        dif = A * B - C * D;
        
        System.out.println("DIFERENCA = " + dif);

    }
 
}