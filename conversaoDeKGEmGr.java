import java.util.Scanner;

public class ConversaoDeKGEmGr {
    public static void main(String[] args) {
    
        float sacoRacaoGr = 0;
        float sacoRacaoKg = 0;
        float porcao = 0;
        float porcao5 = 0;
        float qtdeRestante = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a quantidade de ração em kg");
        sacoRacaoKg = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a quantidade da porção de ração em gr por dia");
        porcao = Float.parseFloat(leitor.nextLine());

        porcao5 = porcao*5;
        sacoRacaoGr = sacoRacaoKg * 1000;
        qtdeRestante = sacoRacaoGr - porcao5;

        System.out.println("A quantidade de ração consumida em 5 dias é de " + porcao5);
        System.out.println("A quantidade de ração em gramas é de " + (sacoRacaoGr - porcao5));
        System.out.println("A quantidade de ração restante em kilos é " + (qtdeRestante / 1000));
        

    }
    
}
