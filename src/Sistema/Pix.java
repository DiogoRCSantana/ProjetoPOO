package Sistema;

public class Pix implements FormaDePagamento{
	public boolean pago;
	
	void pagamento(double valor, boolean pago) {
		System.out.println("pagamento de R$" + valor + "realizado");
		pago = true;
	}
}
