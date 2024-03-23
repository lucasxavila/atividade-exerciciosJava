import java.util.Scanner;

public class Atvd45 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String gabarito = "ABCDEEDCBA"; // Gabarito padrão
    int numQuestoes = gabarito.length();

    int totalAlunos = 0;
    int maiorAcerto = 0;
    int menorAcerto = numQuestoes;

    int totalAcertosTurma = 0;

    while (true) {
      System.out.println("Informe as respostas do aluno (A, B, C, D ou E), uma por linha:");

      int totalAcertosAluno = 0;

      for (int i = 0; i < numQuestoes; i++) {
        System.out.print("Resposta da questão " + (i + 1) + ": ");
        String resposta = scanner.next().toUpperCase(); // Convertendo para maiúsculas para facilitar a comparação

        if (resposta.equals(String.valueOf(gabarito.charAt(i)))) {
          totalAcertosAluno++;
        }
      }
      if (totalAcertosAluno > maiorAcerto) {
        maiorAcerto = totalAcertosAluno;
      }
      if (totalAcertosAluno < menorAcerto) {
        menorAcerto = totalAcertosAluno;
      }
      totalAcertosTurma += totalAcertosAluno;
      totalAlunos++;
      
      System.out.println("Total de acertos do aluno: " + totalAcertosAluno);
      System.out.println("Deseja inserir as respostas de outro aluno? (S/N)");
      String continuar = scanner.next();

      if (!continuar.equalsIgnoreCase("S")) {
        break;
      }
    }
    double mediaNotasTurma = (double) totalAcertosTurma / totalAlunos;

    System.out.println("Maior acerto: " + maiorAcerto);
    System.out.println("Menor acerto: " + menorAcerto);
    System.out.println("Total de alunos que utilizaram o sistema: " + totalAlunos);
    System.out.println("Média das notas da turma: " + mediaNotasTurma);
  }
}