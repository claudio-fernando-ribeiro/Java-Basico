import java.util.Scanner;

public class VarificandoMaiorIdadeOuNao {
    public static void main(String[] args) {

        int idade = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a idade da pessoa");
        idade = Integer.parseInt(leitor.nextLine());

        if (idade >=18) {
            System.out.println("Maior de idade");
        } else {System.out.println("Menor de idade");}

    }
}
