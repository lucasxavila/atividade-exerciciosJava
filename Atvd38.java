import java.util.Scanner;

public class Atvd38 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o salário inicial do funcionário: R$ ");
    double salarioInicial = scanner.nextDouble();

    int anoAtual = 2024;
    double percentualAumento = 0.015; // 1.5%

    for (int ano = 1996; ano <= anoAtual; ano++) {
      salarioInicial *= (1 + percentualAumento);
      percentualAumento *= 2;
    }
    System.out.println("O salário atual do funcionário em " + anoAtual + " é R$ " + salarioInicial);
  }
}