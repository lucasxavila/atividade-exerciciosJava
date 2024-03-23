import java.util.Scanner;

public class Atvd36 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int Inicio, Fim, NumRef; 

    System.out.println("Qual número você deseja fazer a tabuada");
    NumRef = teclado.nextInt();
    System.out.println("Número de inicio da tabuada");
    Inicio = teclado.nextInt();
    System.out.println("Qual número você deseja finalizar tabuada");
    Fim = teclado.nextInt();

    if (Fim < Inicio) {
      System.out.println("Erro: O número de inicio deve ser menor que o de Fim");
    } else {
      System.out.println("Vou Montar a Tabuada do " + NumRef + " começando do " + Inicio + " e terminando em " + Fim);
      for (int index = Inicio; index <= Fim; index++) {
      System.out.println(NumRef + " * " + index + " = " + (NumRef*index)  );
      }
    }
  }
}