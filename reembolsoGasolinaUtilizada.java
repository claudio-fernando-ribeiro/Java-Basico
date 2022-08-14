import java.util.Scanner;

public class reembolsoGasolinaUtilizada {
    public static void main(String[] args) {

        Float precoGasolina = 2.20f;
        Integer consumo = 13;
        Float distancia = 0f;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a distância percorrida nessa semana.");
        distancia = Float.parseFloat(leitor.nextLine());

               System.out.println("O valor do reembolso é: " + ((distancia / consumo) * precoGasolina));
        leitor.close();
    }
    
}
