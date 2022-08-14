import java.util.Scanner;

public class calculoMediaAluno {
    public static void main(String[] args) {
        //declaração de variáveis
        float nota1=0, nota2=0, nota3=0, nota4=0, media=0;
        float percPresenca = 0;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Vamos calcular a média!");
        System.out.println("Digite a primeira nota");
        //conversão entre variável tipo objeto em variável tipo primitivo
        nota1 = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a segunda nota");
        nota2 = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a terceira nota");
        nota3 = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a quarta nota");
        nota4 = Float.parseFloat(leitor.nextLine());
media = ((nota1+nota2+nota3+nota4) / 4);
System.out.println("A média do aluno é:" + media);
System.out.println("Digite o percentual de presença do aluno");
percPresenca = Float.parseFloat(leitor.nextLine());      
if (percPresenca >=70 && media >=7.00) {
    System.out.println("Aluno aprovado");
} else {
        System.out.println("Aluno reprovado");
    }
    leitor.close();
}
}
/* outra forma de fazer seria...
boolean situacao = media >=7 && percpresenca >=70
System.out.println("Aluno: " + (situacao?"aprovado":"Reprovado"));
//comandos de e = &&, de ou = ||, de não = !.*/