import java.util.Scanner;

public class VarificandoColesterol {
    public static void main(String[] args) {
        int qtdeColesterol = 0;
        int colesretolRuim = 0;
        int qtdeAcima = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a quantidade total de miligramas de colesterol.");
        qtdeColesterol = Integer.parseInt(leitor.nextLine());

        if (qtdeColesterol <=130) {
            System.out.println("Quantidade de colesterol considerada saudável");
        } else if (qtdeColesterol >130) {
            colesretolRuim = qtdeColesterol - 130;
            qtdeAcima = (100*colesretolRuim) / 130;
            System.out.println("O colesterol está " + qtdeAcima +"% acima do recomendado");
        }
    }
}
