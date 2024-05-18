package modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

import visualizacao.EntradaSaida;


public class Fabrica {

	private ArrayList<Brinquedo> listaBrinquedos = new ArrayList<Brinquedo>();
	private ArrayList<Cupom> listaCupons = new ArrayList<Cupom>();
	
	public ArrayList<Brinquedo> getListaBrinquedos() {
		return listaBrinquedos;
	}
	public void setListaBrinquedos(ArrayList<Brinquedo> listaBrinquedos) {
		this.listaBrinquedos = listaBrinquedos;
	}
	public ArrayList<Cupom> getListaCupons() {
		return listaCupons;
	}
	public void setListaCupons(ArrayList<Cupom> listaCupons) {
		this.listaCupons = listaCupons;
	}
	
	public void fabricarBrinquedo() {
		Brinquedo novoBrinquedo = new Brinquedo();
		novoBrinquedo.setTipo(EntradaSaida.solicitaTipo());
		novoBrinquedo.setCor(EntradaSaida.solicitaCor());
		do {
		novoBrinquedo.setValor(EntradaSaida.solicitaValor());
		if(novoBrinquedo.getValor()<=0) {
			JOptionPane.showMessageDialog(null, "Informe um valor inválido");
		}
		}while(novoBrinquedo.getValor()<=0);
		listaBrinquedos.add(novoBrinquedo);
	}
	public void listarBrinquedos() {
		String lista="";
		String tipoBrinquedo;
		for(int i=0; i<listaBrinquedos.size(); i++) {
			Brinquedo b = listaBrinquedos.get(i);
			if (b.getTipo()==0) {
				tipoBrinquedo="Carrinho";
			} else if (b.getTipo()==1) {
				tipoBrinquedo="Boneca";
			}else {
				tipoBrinquedo="Urso de Pelucia";
			}
			lista += ("Tipo de Brinquedo: "+tipoBrinquedo+"\nCor do Brinquedo: "+b.getCor()+ "\nValor: R$"+b.getValor()+"\n\n");
		}
		EntradaSaida.listarBrinquedos(lista);
	}
	public void venderBrinquedos() {
		int tipo = EntradaSaida.solicitaTipoBrinquedoVenda();
		String cor = EntradaSaida.solicitaCorBrinquedoVenda();
		for (int i=0; i<listaBrinquedos.size(); i++) {
			Brinquedo b = listaBrinquedos.get(i);
			if(tipo==b.getTipo() && cor.equals(b.getCor())){
				listaBrinquedos.remove(b);
				gerarCupom(b.getTipo(), b.getCor(), b.getValor());
			}
		}
	}
	public void gerarCupom(int tipo, String cor, float valor) {
		String tipoBrinquedo;
		Cupom novoCupom = new Cupom();
		novoCupom.setData(EntradaSaida.solicitaDataVenda());
		if (tipo==0) {
			tipoBrinquedo="Carrinho";
		} else if (tipo==1) {
			tipoBrinquedo="Boneca";
		}else {
			tipoBrinquedo="Urso de Pelucia";
		}
		novoCupom.setTipoBrinquedo(tipoBrinquedo);
		novoCupom.setCorBrinquedo(cor);
		novoCupom.setValorVenda(valor);
		listaCupons.add(novoCupom);
		JOptionPane.showMessageDialog(null, "Venda bem Sucedida!");
	}
	public void listarCupons() {
		String lista="";
		for (Cupom cupom: listaCupons) {
			lista += "Data da Venda: "+cupom.getData()+"\nTipo do Brinquedo: "+cupom.getTipoBrinquedo()+"\nCor do Brinquedo: "+cupom.getCorBrinquedo()
			+"\nValor do Brinquedo: "+cupom.getValorVenda()+"\n\n";
		}
		EntradaSaida.listarCupons(lista);
	}
	public void mostrarTotalVenda() {
		float totalVendas=0;
		for (Cupom cupom: listaCupons) {
			totalVendas+=cupom.getValorVenda();
		}
		EntradaSaida.listarTotalVendas(totalVendas);
	}
}
