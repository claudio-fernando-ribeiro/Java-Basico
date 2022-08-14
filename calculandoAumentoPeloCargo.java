import java.util.Scanner;

public class CalculandoAumentoPeloCargo {
    public static void main(String[] args) {
        
    int codigo = 0;
    float saláriobase = 0;
    float reajuste = 0;
    Scanner leitor = new Scanner(System.in);

    System.out.println("Digite o código do cargo");
    codigo = Integer.parseInt(leitor.nextLine());
    System.out.println("Digite o salário base");
    saláriobase = Integer.parseInt(leitor.nextLine());

    if ( codigo == 1) {
        reajuste = (saláriobase*50) /100;
        System.out.println("Cargo atual: Escrituário");
        System.out.println("O valor do aumento é R$" + reajuste);
        System.out.println("O novo salário é R$" + (saláriobase+reajuste));
    } else if (codigo == 2) {
        reajuste = (saláriobase*35) /100;
        System.out.println("Cargo atual: Secretário");
        System.out.println("O valor do aumento é R$" + reajuste);
        System.out.println("O novo salário é R$" + (saláriobase+reajuste));
        } else if (codigo == 3) {
            reajuste = (saláriobase*20) /100;
            System.out.println("Cargo atual: Caixa");
            System.out.println("O valor do aumento é R$" + reajuste);
            System.out.println("O novo salário é R$" + (saláriobase+reajuste));
            } else if (codigo == 4) {
                reajuste = (saláriobase*10) /100;
                System.out.println("Cargo atual: Gerente");
                System.out.println("O valor do aumento é R$" + reajuste);
                System.out.println("O novo salário é R$" + (saláriobase+reajuste));
                } else if (codigo == 5) {
                    System.out.println("Cargo atual: Diretor");
                    System.out.println("Sem aumento. O valor do salário é R$" + saláriobase);
                    } else {
                        System.out.println("A algo errado, tente novamente.");
                    }
        }
}