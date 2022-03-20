import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    double n, area, raio;
    
    n = 3.14159;
    
    Scanner reader = new Scanner(System.in);

    raio = reader.nextDouble();

    area = n * (raio * raio);
    
    System.out.printf("A=%.4f\n", area);
    reader.close();

  }
}