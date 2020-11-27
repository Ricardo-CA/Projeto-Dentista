package entidades;

public class Pagamento {
	
	private int id;
	private String dataDoPagamento;
	private String tipoTransacao;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDataDoPagamento() {
		return dataDoPagamento;
	}
	public void setDataDoPagamento(String dataDoPagamento) {
		this.dataDoPagamento = dataDoPagamento;
	}
	public String getTipoTransacao() {
		return tipoTransacao;
	}
	public void setTipoTransacao(String tipoTransacao) {
		this.tipoTransacao = tipoTransacao;
	}
	

}
