
public class TestaBanco {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		cliente1.nome = "romario";
		cliente1.cpf = "111.111.111-11";
		cliente1.profissao = "Estudante";
		
		Conta contaCliente1 = new Conta();
		contaCliente1.deposita(100);
		
		contaCliente1.titular = cliente1;
		System.out.println(contaCliente1.titular.nome);

	}

}
