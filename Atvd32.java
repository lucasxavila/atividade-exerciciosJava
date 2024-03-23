import java.util.Scanner;

public class Atvd32 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int contadorProduto = 1;
    double totalCompra = 0;

    System.out.println("Lojas Tabajara");
    while (true) {
      System.out.print("Produto " + contadorProduto + ": R$ ");
      double precoProduto = scanner.nextDouble();
      if (precoProduto == 0) {
        break;
      }
      totalCompra += precoProduto;
      contadorProduto++;
    }
    System.out.println("Total: R$ " + String.format("%.2f", totalCompra));

    System.out.print("Dinheiro: R$ ");
    double dinheiroRecebido = scanner.nextDouble();

    double troco = dinheiroRecebido - totalCompra;
    System.out.println("Troco: R$ " + String.format("%.2f", troco));
  }
}