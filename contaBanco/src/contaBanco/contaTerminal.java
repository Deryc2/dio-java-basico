package contaBanco;

import java.util.Scanner;

public class contaTerminal {
	public static void main(String[] args) {
		//variáveis para guardar os dados do cliente
		int numero;
		String agencia, nome;
		double saldo;
		
		Scanner entraDados = new Scanner(System.in);
		System.out.print("Por favor, digite o número da Agência! ");
		agencia = entraDados.nextLine();
		
		System.out.print("Por favor, digite o número da Conta: ");
		numero = entraDados.nextInt();
		entraDados.nextLine();
			
		System.out.print("Por favor, digite seu Nome: ");
		nome = entraDados.nextLine();
		
		System.out.print("Digite seu saldo: ");
		saldo = entraDados.nextDouble();
		
		System.out.printf("Olá %s! Obrigado por criar uma conta em nosso banco, sua agência é %s conta %d  e seu saldo R$ %.2f já está disponível para saque.",nome,agencia,numero,saldo);
		entraDados.close();
	}
}
