import java.util.Scanner;

public class CalculoLeituraXDias {
    public static void main(String[] args) {
        int qtdePaginas = 0;
        int qtdeDias = 0;
        int pagDia = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a quantidade de páginas do livro");
        qtdePaginas = Integer.parseInt(leitor.nextLine());

        System.out.println("Informe a quantidade de dias disponíveis para leitura");
        qtdeDias = Integer.parseInt(leitor.nextLine());

        pagDia = qtdePaginas / qtdeDias;
        if (pagDia >=100) {
            System.out.println("Impossível realizar a leitura nesse tempo");
        } else {
            System.out.println("Você deve ler " + pagDia + " páginas por dia para terminar o livro");
        }
    }
}
