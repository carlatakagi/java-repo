import java.io.IOException;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws IOException {
        int velocidade, total;
        
        Scanner reader = new Scanner(System.in);
        velocidade = reader.nextInt();
        
        total = (60 * velocidade) / 30;

        System.out.println(total + " minutos"); 
    }
	
}