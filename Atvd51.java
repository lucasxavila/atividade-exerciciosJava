import java.util.Scanner;

public class Atvd51 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int limite;
    double Res = 0, N = 1, M = 1;
    System.out.println("Digite um número para limitar o cálculo");
    limite = teclado.nextInt();
    for(int index = 1; index<=limite; index++){
      System.out.print(N+"/"+M+ " + ");
      Res += N/M;
      N = N + 1;
      M = M + 2;
    }
    System.out.println(" = " + Res);
  }
}