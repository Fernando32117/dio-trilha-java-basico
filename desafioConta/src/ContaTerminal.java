import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criar um objeto Scanner para ler a entrada do usuário        
        Scanner scanner = new Scanner(System.in);  
        
        // Solicitar e ler os dados do usuário
        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta: ");  
        int numero = scanner.nextInt();  
        
        scanner.nextLine(); // Limpar o buffer do scanner  

        System.out.println("Por favor, digite o Nome do Cliente: ");  
        String nomeCliente = scanner.nextLine();  

        System.out.println("Por favor, digite o Saldo: ");  
        double saldo = scanner.nextDouble();  

        // Exibir a mensagem final com as informações coletadas  
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +  
                "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";  
        
        System.out.println(mensagem);

    }
}
