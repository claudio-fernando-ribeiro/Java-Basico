import java.util.Scanner;

import javax.xml.validation.Validator;

public class CalculoValorMultaXVelocidade {
    public static void main(String[] args) {
        int velocidade = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a velocidade");
        velocidade = Integer.parseInt(sc.nextLine());

      if (velocidade > 60 && velocidade <=100) {
          System.out.println("Multa média. Valor 60 ufir");
        } else if (velocidade >100 && velocidade <=160) {
        System.out.println("Multa grave. Valor 120 ufir");
            } else if (velocidade >160) {
            System.out.println("Multa grávissima. Valor 180 ufir");
        }
    }
}
