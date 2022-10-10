package exercicio;

import java.util.Scanner;

public class ContaCorrenteMain {
	
	public static void main(String[]args){
	
	Scanner leitura = new Scanner(System.in);
	
	ContaCorrente pessoa = new ContaCorrente();
	
	System.out.println("Digite seu nome: ");
	pessoa.nome_titular = leitura.nextLine();
	System.out.println("Digite seu CPF: ");
	pessoa.cpf = leitura.nextLong();
	System.out.println("Digite numero da conta: ");
	pessoa.numero_da_conta = leitura.nextLong();
	System.out.println("Informe saldo: ");
	pessoa.saldo = leitura.nextFloat();
	
	
	
	System.out.println("Você deseja realizar qual ação?");
	System.out.println("1-Sacar");
	System.out.println("2-Depositar");
	System.out.println("3-Visualizar dados");
	int i = leitura.nextInt();
	
	if(i==1) {
		Float quant = leitura.nextFloat();
		pessoa.sacar(quant);
		System.out.println(pessoa.saldo);
		
	}
	
	if(i==2) {
		Float quant = leitura.nextFloat();
		pessoa.depositar(quant);
		System.out.println(pessoa.saldo);
		
	}
	
	if(i==3) {
		pessoa.mostrarDados();
	}

}
}
