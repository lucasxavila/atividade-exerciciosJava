import java.util.Scanner;

public class Atvd39 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int[] Altura = new int[10];
    int[] Alunos = new int[10];
    int index = 0;
    int MBaixo = Integer.MAX_VALUE;
    int MAlto = Integer.MIN_VALUE; 
    int IA = 0, IB = 0;

    while (index < 10) {
      System.out.println("Digite o Numero do Aluno Nº" + (index + 1));
      Alunos[index] = teclado.nextInt();

      System.out.println("Digite sua Altura em centímetros");
      Altura[index] = teclado.nextInt();

      if (Altura[index] >= MAlto) {
        MAlto = Altura[index];
        IA = index;
      }
      if (Altura[index] <= MBaixo) {
        MBaixo = Altura[index];
        IB = index;
      }
      index++;
    }
    System.out.println("O aluno mais alto é o Nº " + Alunos[IA] + " com " + Altura[IA] + " centímetros.");
    System.out.println("O aluno mais baixo é o Nº " + Alunos[IB] + " com " + Altura[IB] + " centímetros.");
  }
}