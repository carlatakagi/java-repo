import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int N, X, in, out;
    //  valores X estão dentro do intervalo [10,20]

    Scanner reader = new Scanner(System.in);
    N = reader.nextInt();

    in = 0;
    out = 0;

    for (int counter = 0; counter < N; counter++) {
      X = reader.nextInt();
      if(X >= 10 && X <= 20) {
        in += 1;
      } else {
        out +=1;
      }
    }
    System.out.println(in + " in");
    System.out.println(out + " out");
}