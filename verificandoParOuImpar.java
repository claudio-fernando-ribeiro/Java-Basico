import java.util.Scanner;

public class VerificandoParOuImpar {
    public static void main(String[] args) {
        int numero = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número");
        numero = Integer.parseInt(leitor.nextLine());
        //O símbolo de % calcula o RESTO da divisão de dois números;
        if (numero %2 == 0) {
            System.out.println("Par");
        } else {System.out.println("Impar");
        }
    }
}
