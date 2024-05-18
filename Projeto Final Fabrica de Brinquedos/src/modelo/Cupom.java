package modelo;

public class Cupom {

	private String Data;
	private String tipoBrinquedo;
	private String corBrinquedo;
	private float valorVenda;
	//private int quantidadeVendida;
	
	public String getData() {
		return Data;
	}
	public void setData(String data) {
		Data = data;
	}
	public String getTipoBrinquedo() {
		return tipoBrinquedo;
	}
	public void setTipoBrinquedo(String tipoBrinquedo) {
		this.tipoBrinquedo = tipoBrinquedo;
	}
	public String getCorBrinquedo() {
		return corBrinquedo;
	}
	public void setCorBrinquedo(String corBrinquedo) {
		this.corBrinquedo = corBrinquedo;
	}
	public float getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}
	/*public int getQuantidadeVendida() {
		return quantidadeVendida;
	}
	public void setQuantidadeVendida(int quantidadeVendida) {
		this.quantidadeVendida = quantidadeVendida;
	}
	*/
}
