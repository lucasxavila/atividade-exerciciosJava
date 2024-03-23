import java.util.Scanner;

public class Atvd40 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int codigoCidade;
    int veiculosPasseio;
    int acidentesTransito;

    int indiceMaximo = Integer.MIN_VALUE;
    int indiceMinimo = Integer.MAX_VALUE;
    int codigoCidadeMaximo = 0;
    int codigoCidadeMinimo = 0;

    int totalVeiculos = 0;
    int totalAcidentes = 0;
    int cidadesMenos2000 = 0;
    int totalVeiculosMenos2000 = 0;

    for (int i = 1; i <= 5; i++) {
      System.out.println("Cidade " + i + ":");
      System.out.print("Código da cidade: ");
      codigoCidade = scanner.nextInt();
      System.out.print("Número de veículos de passeio em 1999: ");
      veiculosPasseio = scanner.nextInt();
      System.out.print("Número de acidentes de trânsito com vítimas em 1999: ");
      acidentesTransito = scanner.nextInt();
      
      if (acidentesTransito > indiceMaximo) {
        indiceMaximo = acidentesTransito;
        codigoCidadeMaximo = codigoCidade;
      }
      if (acidentesTransito < indiceMinimo) {
        indiceMinimo = acidentesTransito;
        codigoCidadeMinimo = codigoCidade;
      }
      totalVeiculos += veiculosPasseio;
      totalAcidentes += acidentesTransito;
      
      if (veiculosPasseio < 2000) {
        cidadesMenos2000++;
        totalVeiculosMenos2000 += veiculosPasseio;
      }
      System.out.println();
    }
    double mediaVeiculos = (double) totalVeiculos / 5;
    double mediaAcidentesMenos2000 = (cidadesMenos2000 == 0) ? 0 : (double) totalAcidentes / cidadesMenos2000;

    System.out.println("Maior índice de acidentes: " + indiceMaximo + " na cidade " + codigoCidadeMaximo);
    System.out.println("Menor índice de acidentes: " + indiceMinimo + " na cidade " + codigoCidadeMinimo);
    System.out.println("Média de veículos nas cinco cidades: " + mediaVeiculos);
    System.out.println("Média de acidentes de trânsito nas cidades com menos de 2000 veículos: " + mediaAcidentesMenos2000);
  }
}