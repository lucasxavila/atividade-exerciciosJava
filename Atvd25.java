import java.util.Scanner;

public class Atvd25 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Quantas pessoas na turma? ");
    int n = scanner.nextInt();
    if (n <= 0) {
      System.out.println("Número inválido de pessoas.");
      return;
    }
    int somaIdades = 0;
    for (int i = 1; i <= n; i++) {
      System.out.print("Digite a idade da pessoa " + i + ": ");
      int idade = scanner.nextInt();
      somaIdades += idade;
    }
    double mediaIdades = (double) somaIdades / n;
    System.out.println("Média de idade da turma: " + mediaIdades);
    if (mediaIdades >= 0 && mediaIdades <= 25) {
      System.out.println("A turma é jovem.");
    } else if (mediaIdades >= 26 && mediaIdades <= 60) {
      System.out.println("A turma é adulta.");
    } else {
      System.out.println("A turma é idosa.");
    }
  }
}