import java.util.Scanner;

public class Atvd43 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int codigo;
    int quantidade;
    double totalGeral = 0;

    System.out.println("Bem-vindo à Lanchonete!");

    while (true) {
      System.out.println("Digite o código do item (ou 0 para encerrar o pedido):");
      codigo = scanner.nextInt();

      if (codigo == 0) {
        break;
      }
      double preco = 0;

      switch (codigo) {
        case 100:
          preco = 1.20;
          break;
        case 101:
          preco = 1.30;
          break;
        case 102:
          preco = 1.50;
          break;
        case 103:
          preco = 1.20;
          break;
        case 104:
          preco = 1.30;
          break;
        case 105:
          preco = 1.00;
          break;
        default:
          System.out.println("Código inválido. Por favor, digite um código válido.");
          continue; // Reinicia o loop sem calcular o valor
      }
      System.out.println("Digite a quantidade desejada:");
      quantidade = scanner.nextInt();

      double totalItem = preco * quantidade;
      totalGeral += totalItem;

      System.out.printf("Total a pagar pelo item: R$ %.2f\n", totalItem);
    }
    System.out.printf("Total geral do pedido: R$ %.2f\n", totalGeral);
  }
}