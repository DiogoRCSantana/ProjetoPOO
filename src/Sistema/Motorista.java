package Sistema;

public class Motorista extends Pessoa{
    public boolean validado;
    public float avaliacao;
    public Veiculo Veiculo;

    public Motorista(String nome, String cpf, String senha, boolean validado){
        super(nome, cpf, senha);
        this.validado = validado;
    }
   
    public boolean isValidado(){
    	return validado;
    }
    
    public void cadVeiculo(){
    	
    }
    
    public void aceitaViagem() {
    	//n pode aceitar duas ao mesmo tempo
    }
}
