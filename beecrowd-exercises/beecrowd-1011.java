import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    double R, volume;

    Scanner reader = new Scanner(System.in);

    R = reader.nextDouble();
    volume = (4.0/3) * 3.14159 * (Math.pow(R, 3));

    System.out.printf("VOLUME = %.3f\n", volume);
  }
}