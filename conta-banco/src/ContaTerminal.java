import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Cliente cliente = new Cliente();
        Conta conta = new Conta();

        System.out.println("Bem vindo ao banco DIO, digite seu nome: ");
        cliente.nome = sc.nextLine();
        System.out.println("\nAgora digite seu sobrenome: ");
        cliente.sobrenome = sc.nextLine();

        System.out.println("\nPor gentileza, digite o número da conta: ");
        conta.numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.println("\nAgora o numero da Agência: ");
        conta.numeroAgencia = sc.nextLine();

        System.out.println("\nDigite o saldo em conta: ");
        conta.saldo = sc.nextDouble();

        sc.close();

        String mensagem = criarMensagemFeedback(cliente, conta);
        System.out.println(mensagem);

    }

    public static String criarMensagemFeedback(Cliente cliente, Conta conta) {
        String mensagem = "\nOlá " + cliente.nome + " " + cliente.sobrenome
                + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.numeroConta + ", conta "
                + conta.numeroAgencia + " e seu saldo " + conta.saldo + " já está disponível para saque";
        return mensagem;
    }
}
