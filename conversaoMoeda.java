import java.util.Scanner;

public class ConversaoMoeda {
    public static void main(String[] args) {
        
        double dinheiroDisp = 0;
        double dinheiroDolar = 1.80;
        double dinheiroMarcoAlemao = 2.00;
        double dinheiroLibraEsterlina = 1.57;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor de dinheiro disponível em reais para sua viagem.");
        dinheiroDisp = Float.parseFloat(leitor.nextLine());

        System.out.println("O valor disponível em dólar é $" + (dinheiroDisp/dinheiroDolar));
        System.out.println("O valor disponível em Marco Alemão é $" + (dinheiroDisp/dinheiroMarcoAlemao));
        System.out.println("O valor disponível em Libras esterlinas é $" + (dinheiroDisp/dinheiroLibraEsterlina));


    }
}
