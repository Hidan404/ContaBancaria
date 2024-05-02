import java.util.Random;
import java.util.Scanner;


/**
 * Um programa simples para simular um terminal para criar contas bancárias.
 */

public class ContaTerminal {
     /**
     * O método principal que inicia a execução do programa.
     *
     * @param args Os argumentos da linha de comando passados para o programa.
     * @throws Exception Se uma exceção ocorrer durante a execução do programa.
     */
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        int numero = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 0;

        boolean condicao = false;

        System.out.println("***Bem vindo***");

        // Loop para interagir com o usuário até que uma condição seja atendida
        while (!condicao) {
            
            System.out.println("deseja abrir uma conta? S/N");
            String confirmar = entrada.nextLine();

            if(confirmar.equalsIgnoreCase("s")){
                System.out.println("Seu numero da conta: ");
                numero = random.nextInt(10000);

                System.out.println("Digite o numero da agencia: ");
                agencia = entrada.nextLine();

                System.out.println("Digite seu nome completo: ");
                nomeCliente = entrada.nextLine();

                System.out.println("Digite seu saldo inicial: ");
                saldo = entrada.nextDouble();

            }
            else{
                System.out.println("Saindo do Programa");
                condicao = true;
            }

            // Definindo a condição como true para sair do loop
            condicao = true;
        }

        // Exibindo informações da conta
        System.out.println("Ola " + nomeCliente + 
        " obrigado por criar uma conta em nosso banco, sua agencia e "
         + agencia + " conta " + numero + " e seu saldo " + saldo +
          " ja esta disponivel para saque.");

        


        entrada.close();
    }
}
