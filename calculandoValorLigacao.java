import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculandoValorLigacao {
    public static void main(String[] args) {
        int chave = 0;
        double minutos = 0;
        double local = (float) 0.020;
        double intermunicipal = (float) 0.080;
        double interestadual = (float) 0.10;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tipo de ligação: 1 ");
        System.out.println("Digite o tipo de ligação: 2 ");
        System.out.println("Digite o tipo de ligação: 3 ");
        chave = Integer.parseInt(sc.nextLine());

        System.out.println("Digite o numero de minutos ao telefone");
        minutos = Double.parseDouble(sc.nextLine());
        switch (chave) {
            case 1:
            System.out.println("O valor da chamada é R$" + (minutos*local));    
                break;
                case 2:
                System.out.println("O valor da chamada é R$" + (minutos*intermunicipal));
                    break;
                    case 3:
                    System.out.println("O valor da chamada é R$" + (minutos*interestadual));
                        break;
            default:
                break;
        }
    }
}
