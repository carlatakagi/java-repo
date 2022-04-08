import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        double A, B, C, media;
        
        Scanner reader = new Scanner(System.in);
        A = reader.nextDouble();
        B = reader.nextDouble();
        C = reader.nextDouble();
        
        media = ((A * 2) + (B * 3) + (C * 5)) / 10;
        
        System.out.println(String.format("MEDIA = %.1f" , media));

    }
 
}