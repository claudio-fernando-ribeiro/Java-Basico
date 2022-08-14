import java.util.Scanner;

public class OpcaodoUsuarioMaisRaizQuad {
    public static void main(String[] args) { 
        int opcao = 0;
        float numero1 = 0;
        float numero2 = 0;
        float resultado = 0;
        int numeroraiz = 0;
        float soma = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a opção desejada");
        System.out.println("1 para somar dois numeros");
        System.out.println("2 para calcular raiz quadrada");
        opcao = Integer.parseInt(leitor.nextLine());

        if (opcao == 1) {
            System.out.println("Digite o valor do primeiro número");
            numero1 = Float.parseFloat(nextLine());
            System.out.println("Digite o valor do segundo número");
            numero2 = Float.parseFloat(nextLine());
            soma = numero1 + numero2; 
            System.out.println("A soma é " + (soma));
            
        } else if (opcao == 2) {
            System.out.println("Digite o valor do numero que quer a raiz quadrada");
            numeroraiz = Integer.parseInt(nextLine());
            resultado = (float)Math.sqrt(numeroraiz);
            System.out.println("A raiz quadrada de " + resultado );
        }
    }

    private static String nextLine() {
        return null;
    }
} //Pq o meu programa não deu certo???
/* Programa do professor
 int opcao = 0;
        float num1=0, num2=0, soma=0;
        int umnumero = 0;
        float resultado = 0;
        Scanner leitor = new Scanner(System.in);
        System.out.println("+---------------------------+");
        System.out.println("|Digite 1 para soma         |");
        System.out.println("|Digite 2 para raiz quadrada|");
        System.out.println("+---------------------------+");
        opcao = Integer.parseInt(leitor.nextLine());
            
        if(opcao == 1){
            System.out.println("Digite o primeiro numero");
            num1 = Float.parseFloat(leitor.nextLine());
            System.out.println("Digite o segundo numero");
            num2 = Float.parseFloat(leitor.nextLine());
            soma = num1 + num2;
            System.out.println("A soma e " + soma);
        }else{
            System.out.println("Digite um numero");
            umnumero = Integer.parseInt(leitor.nextLine());
            resultado = (float)Math.sqrt(umnumero);
            System.out.println("O resultado e " + resultado);
        }

    }
}*/