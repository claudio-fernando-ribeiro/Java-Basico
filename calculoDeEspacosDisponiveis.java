import java.util.Scanner;

public class CalculoDeEspacosDisponiveis {
    public static void main(String[] args) {
        double qtdeLivros = 0;
        double qtdePrateleiras = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de livros");
        qtdeLivros = Integer.parseInt(sc.nextLine());

        qtdePrateleiras = qtdeLivros /32;
        qtdePrateleiras = Math.ceil(qtdePrateleiras);
        System.out.println("A quantidade de prateleiras é: " + qtdePrateleiras);
    }
}
