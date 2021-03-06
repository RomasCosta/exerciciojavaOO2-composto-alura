

public class Conta {
	private double saldo;//especifica??o de produto, n?o pode ser alterado!
	int agencia;
	int numero;
	Cliente titular;
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);//ou destino.saldo += valor;
			return true;
		}
			return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}

}
