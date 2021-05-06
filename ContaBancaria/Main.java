package POO.ContaBancaria;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("----------SISTEMA BANCÁRIO----------");
        System.out.println("-----CONTA CORRENTE-----");
        ContaBancaria contaCorrente = new ContaBancaria();
        System.out.print("Nome do cliente: ");
        contaCorrente.setNomeCliente(scan.nextLine());

        System.out.print("Número da conta: ");
        contaCorrente.setNumConta(scan.nextLine());

        System.out.print("Saldo: R$");
        contaCorrente.setSaldo(scan.nextDouble());

        System.out.print(contaCorrente);

        System.out.println("\n-----CONTA POUPANÇA-----");
        ContaPoupanca poupanca = new ContaPoupanca();
        Calendar hoje = Calendar.getInstance();
        poupanca.setDiaDeRendimento(hoje.get(Calendar.DAY_OF_MONTH));
        poupanca.setSaldo(contaCorrente.getSaldo());

        System.out.print("Taxa de rendimento: ");
        poupanca.setTaxaRendimento(scan.nextDouble());

        System.out.println(poupanca);

        poupanca.calcularNovoSaldo();

        System.out.println("\n-----CONTA ESPECIAL-----");
        ContaEspecial clienteEspecial = new ContaEspecial();
        System.out.print("É Conta Especial(S/N)?");
        char resp = scan.next().charAt(0);
        

        System.out.println("\n----------CLIENTE----------");
        int operacao;
        double valorSaque = 0;
        double valorDeposito = 0;
        do{
            System.out.println("<-----MENU > Opções----->");
            System.out.println("1- Saque");
            System.out.println("2- Depósito");
            System.out.println("3- Consultar saldo");
            System.out.println("4- Consulta Conta Poupança");
            System.out.println("5- Consulta Conta Especial");
            System.out.println("0 - Sair ------------->");
            System.out.println();
            System.out.println("Escolha uma opção: ");
            operacao = scan.nextInt();

            switch (operacao) {
                case 1:
                    System.out.println("Informe o valor do saque:");
                    valorSaque = scan.nextFloat();
                    contaCorrente.sacar(valorSaque);
                    break;

                case 2:
                    System.out.println("Informe o valor do depósito:");
                    valorDeposito = scan.nextFloat();
                    contaCorrente.sacar(valorDeposito);
                    break;

                case 3:
                    System.out.println("Seu saldo é R$" + contaCorrente.getSaldo());
                    break;

                case 4:
                    poupanca.calcularNovoSaldo();
                    break;

                case 5:
                    clienteEspecial.checaEspecial(resp);
                    System.out.println("Informe o valor do saque:");
                    valorSaque = scan.nextDouble();
                    clienteEspecial.sacar(valorSaque);

                case 0:
                    System.out.println("Obrigado por utilizar nossos serviços!");
                    break;

                default:
                    System.out.println("Operação finalizada!");
                    break;
            }
        } while (operacao < 0 && operacao > 5);
        
        scan.close(); 

    }
}
