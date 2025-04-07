package Sistema;

public class Cliente extends Pessoa{
	public FormaDePagamento FormaDePagamento;
	public float avaliacao;
	
	public Cliente(String nome, String cpf, String senha) {
		super(nome, cpf, senha);
	}
	
	
}
