import java.util.Scanner;

public class MediaMaisResultado {
    public static void main(String[] args) {
    
    float notaExame = 0;    
    float nota1 = 0, nota2 = 0, nota3 = 0, media = 0;
    Scanner leitor = new Scanner(System.in);

    System.out.println("Digite a nota 1");
    nota1 = Float.parseFloat(leitor.nextLine());
    System.out.println("Digite a nota 2");
    nota2 = Float.parseFloat(leitor.nextLine());
    System.out.println("Digite a nota 3");
    nota3 = Float.parseFloat(leitor.nextLine());
    media = (nota1 + nota2 + nota3) / 3;

    if (media <3) {
        System.out.println("Aluno reprovado");
    } else if (media >= 3 && media <7) {
        System.out.println("Aluno em exame");
        notaExame = 10 - media;
        System.out.println("O aluno precisa tirar " + notaExame +" para passar no exame");
    } else if (media >=7) {
        System.out.println("Aluno aprovado");
    }
    }
}
