import java.util.Scanner;

public class Atvd34 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int Num, index = 0;
    System.out.println("Quantas temperaturas serão informadas?");
    Num = teclado.nextInt();
    Double[] Temp = new Double[Num];
    Double MenorTemp = Double.MAX_VALUE, MaiorTemp = 0.0, Soma = 0.0, Media = 0.0;

    while (index < Num) {
      System.out.println("Insira a " + (index + 1) + "º temperatura");
      Temp[index] = teclado.nextDouble();
      Soma += Temp[index];
      
        if (Temp[index] >= MaiorTemp) {
          MaiorTemp = Temp[index];
        }
        if (Temp[index] <= MenorTemp) {
          MenorTemp = Temp[index];
        }
        index++;
    }
    Media = Soma / Num;

    System.out.println("A maior temperatura digitada foi a de " + MaiorTemp + "º");
    System.out.println("A menor temperatura digitada foi a de " + MenorTemp + "º");
    System.out.println("A Média das temperaturas digitadas foi a de " + Media + "º");
  }
}