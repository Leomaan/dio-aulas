package Exercícios.ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Conta conta = new Conta();
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero da conta:");
        conta.setConta(input.nextInt());
        System.out.println("Digite o valor da agencia: ");
        conta.setAgencia(input.nextInt());
        input = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        conta.setNome(input.nextLine());
        System.out.println("Digite o saldo: ");
        conta.setSaldo(input.nextDouble());
        System.out.println("Olá, "+conta.getNome()+", obrigado por criar uma conta em nosso banco, com numero de conta "+conta.getConta()+", agencia "+conta.getAgencia()+" e saldo "+conta.getSaldo()+" disponível para saque.");
        conta.sacar(250);
        System.out.println(conta.getSaldo());
        conta.depositar(100);
        System.out.println(conta.getSaldo());
    }
}