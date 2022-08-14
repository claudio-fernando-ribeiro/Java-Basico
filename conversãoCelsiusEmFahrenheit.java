import java.util.Scanner;

public class ConversãoCelsiusEmFahrenheit {
    public static void main(String[] args) {
        
        float grausC =0;
        float grausF =0;
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsius");
        grausC = Float.parseFloat(leitor.nextLine());

        grausF = grausC*1.8f + 32;

        System.out.println("A temperatura em graus Fahrenheit é: " + grausF);
    
    }
}
