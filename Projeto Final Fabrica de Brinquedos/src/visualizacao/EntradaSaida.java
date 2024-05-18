package visualizacao;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class EntradaSaida {

	public static int solicitaopcao() {
		
		String[] opcoes = {"Fabricar Brinquedo", "Listar Brinquedos", "Vender Brinquedo", "Visualizar cupons", "Mostrar Total Vendido", "Sair do Programa"};
		JComboBox<String> menu = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null,menu, "Selecione a opção desejada",
				JOptionPane.OK_CANCEL_OPTION);
		return menu.getSelectedIndex();
	}
	public static int solicitaTipo() {
		String[] opcoes = {"Carrinho", "Boneca", "Urso de Pelucia"};
		JComboBox<String> menu = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null,menu, "Selecione o brinquedo que deseja fabricar",
				JOptionPane.OK_CANCEL_OPTION);
		return menu.getSelectedIndex();
	}
	public static String solicitaCor() {
	return JOptionPane.showInputDialog("Informe a cor do produto");
	}
	public static float solicitaValor() {
		return Float.parseFloat(JOptionPane.showInputDialog("Informe o preço do brinquedo"));
	}
	public static void listarBrinquedos(String lista) {
		JOptionPane.showMessageDialog(null, lista);
	}
	public static int solicitaTipoBrinquedoVenda() {
		String[] opcoes = {"Carrinho", "Boneca", "Urso de Pelucia"};
		JComboBox<String> menu = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null,menu, "Selecione o brinquedo que deseja vender",
				JOptionPane.OK_CANCEL_OPTION);
		return menu.getSelectedIndex();
	}
	public static String solicitaCorBrinquedoVenda() {
		return JOptionPane.showInputDialog("Qual a cor do produto que deseja vender?");
	}
	public static String solicitaDataVenda() {
		return JOptionPane.showInputDialog("Informe a data da venda!");
	}
	public static void listarCupons(String lista) {
		JOptionPane.showMessageDialog(null, lista);
	}
	public static void listarTotalVendas(float totalVenda) {
		JOptionPane.showMessageDialog(null, "O valor total de vendas realizadas foi: R$"+totalVenda);
	}
}