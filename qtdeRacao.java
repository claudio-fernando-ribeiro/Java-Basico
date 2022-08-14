import java.util.Scanner;

public class qtdeRacao {
    /**
     *
     */
    private static final String QUANTOS_DIAS_O_MÊS_POSSUI = "Quantos dias o mês possui?";
    /**
     *
     */
    private static final String KG_DE_RAÇÃO_POR_MÊS = "Kg de ração por mês";

    public static void main(String[] args) {
        Float qtdeDiaMes = 0f;
        Float qtdePorcao = 0f;
        Float refDiaria = 0f;
        Float qtdeMes = 0f;

        Scanner leitor = new Scanner(System.in);

        System.out.println(QUANTOS_DIAS_O_MÊS_POSSUI);
        qtdeDiaMes = Float.parseFloat(leitor.nextLine());

        System.out.println("Qual a quantidade de ração por porção?");
        qtdePorcao = Float.parseFloat(leitor.nextLine());

        System.out.println("Qual a quantidade de refeições diárias?");
        refDiaria = Float.parseFloat(leitor.nextLine());

        qtdeMes = ((qtdePorcao * refDiaria) * qtdeDiaMes);

        System.out.println("Seu cão consome " + qtdeMes + KG_DE_RAÇÃO_POR_MÊS);

    }
    
}
