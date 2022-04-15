import java.io.IOException;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws IOException {
      double x1, x2, y1, y2, distance;

    	Scanner reader = new Scanner(System.in);

      x1 = reader.nextDouble();
      y1 = reader.nextDouble();
      x2 = reader.nextDouble();
      y2 = reader.nextDouble();
      
      distance = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
      
      System.out.println(String.format("%.4f", distance)); 
    }
	
}