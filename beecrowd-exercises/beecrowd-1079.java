import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int number;
    double teste1, teste2, teste3, total, media;

    Scanner reader = new Scanner(System.in);
    number = reader.nextInt();

    for (int i = 0; i < number; i++) {
      teste1 = reader.nextDouble();
      teste2 = reader.nextDouble();
      teste3 = reader.nextDouble();
      total = (teste1 * 2) + (teste2 * 3) + (teste3 * 5);
      media = total / 10;
      System.out.printf("%.1f\n", media);
    }
  }
}