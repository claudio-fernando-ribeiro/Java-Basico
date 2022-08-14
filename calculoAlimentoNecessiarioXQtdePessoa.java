import java.util.Scanner;

public class CalculoAlimentoNecessiarioXQtdePessoa {
 public static void main(String[] args) {
     
    //declaração de variáveis
        Integer qtdePessoas=0;
        final Float qtdeCarnePessoa = 0.250f; 
        //como o número 0.250 pode aparecer mais de uma vez num mesmo pragrama, devemos ter o cuidado para 
        // que não de erro, já que se tiver duas variáveis com o mesmo valor o pragrama da problema.
        // a solução é criar uma constante.
        Scanner leitor = new Scanner(System.in);
        //comando para importar Scanner (Ctrl+.)
        System.out.println("Digite o número de pessoas convidadas");
        //conversão entre variável tipo objeto em variável tipo primitivo
        qtdePessoas = Integer.parseInt(leitor.nextLine());
        System.out.println("Você vai precisar de " +qtdePessoas * qtdeCarnePessoa + " KG de carne.");
        leitor.close();
        //o recurso Scanner consome muitos dados, por isso é sempre importante fechá-lo após a utilização.
         }
    }