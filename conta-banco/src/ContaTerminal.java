import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in);


        //Exibir as mensagens para o nosso usuário

        System.out.println("Por favor, digite o número da Agência !");
        System.out.print("Usuário: ");
        
        //obter pela classe scanner os valores digitados pelo terminal
        
        int numero = sc.nextInt();
        String nomeCliente = "Mario Andrade";
        String agencia = "067-8";
        double saldo = 237.48;

        //Exibir a mensagem conta criada

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta "  + numero +  " e seu saldo é  " + saldo +  " e já está disponível para saque!");
        

        

       


        


        
    }
}
