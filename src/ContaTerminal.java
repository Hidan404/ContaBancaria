import java.util.Random;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        int numero = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 0;

        boolean condicao = false;

        System.out.println("***Bem vindo***");

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


            condicao = true;
        }

        System.out.println("Ola " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agencia e " + agencia + " conta " + numero + " e seu saldo " + saldo + " ja esta disponivel para saque.");

        


        entrada.close();
    }
}
