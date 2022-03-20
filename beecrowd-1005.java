import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    double A, B, media;
    
    Scanner reader = new Scanner(System.in);

    A = reader.nextDouble();
    B = reader.nextDouble();

    media = ((A * 3.5) + (B * 7.5))/11;
    
    System.out.printf("MEDIA = %.5f\n", media);

  }
}  