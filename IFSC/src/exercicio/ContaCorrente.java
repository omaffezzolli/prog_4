package exercicio;

public class ContaCorrente {
	
	public String nome_titular;
	public Long cpf;
	public Long numero_da_conta;
	public Float saldo;

	public Float sacar(Float valor_sacar) {
		saldo -= valor_sacar;
		return saldo;
		
	}
	
	public Float depositar(Float valor) {
		saldo += valor;
		return saldo;
	}
	
	public void mostrarDados() {
		System.out.println(nome_titular);
		System.out.println(cpf);
		System.out.println(numero_da_conta);
		System.out.println(saldo);

		
	}
}

