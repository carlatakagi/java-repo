import java.util.Scanner;

class Exercicio5 {
  public static void main(String[] args) {
    int a, b, c, d, e, media, notaMin, notaMax;
    
    Scanner reader = new Scanner(System.in);
    a = reader.nextInt();
    b = reader.nextInt();
    c = reader.nextInt();
    d = reader.nextInt();
    e = reader.nextInt();
    reader.close();
    media = (a + b + c + d + e)/5;

    System.out.println("A média da turma é: " + media);

    // Quantos estudantes obtiveram nota de prova acima da média da turma;
    // cada nota > media
    int[] arrayNotas = {a, b, c, d, e};
    for(int counter = 1; counter < arrayNotas.length; counter++) {
      if(arrayNotas[counter - 1] > media){
        counter++;
        System.out.println(counter + " obtiveram nota de prova acima da média");
      }
    }

    // Quantos estudantes obtiveram nota de prova abaixo da média da turma;
    for(int counter = 1; counter < arrayNotas.length; counter++) {
      if(arrayNotas[counter - 1] < media){
        counter++;
        System.out.println(counter + " obtiveram nota de prova abaixo da média");
      }
    }
    
    //  Qual foi a maior nota da turma;
    notaMin = 0;
    if(a > notaMin) {
      notaMin = a;
    }
    if(b > notaMin) {
      notaMin = b;
    }
    if(c > notaMin) {
      notaMin = c;
    }
    if(d > notaMin) {
      notaMin = d;
    }
    if(e > notaMin) {
      notaMin = e;
    } 
    System.out.println("A maior nota de prova é: " + notaMin);
    
    // Qual foi a menor nota da turma;
    notaMax = 10;

    if(a < notaMax) {
      notaMax = a;
    }
    if(b < notaMax) {
      notaMax = b;
    }
    if(c < notaMax) {
      notaMax = c;
    }
    if(d < notaMax) {
      notaMax = d;
    }
    if(e < notaMax) {
      notaMax = e;
    } 
    System.out.println("A menor nota de prova é: " + notaMax);
  }
}