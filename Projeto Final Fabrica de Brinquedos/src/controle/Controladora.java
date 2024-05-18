package controle;

import visualizacao.EntradaSaida;
import modelo. *;

public class Controladora {

	Fabrica fabrica = new Fabrica();
	Brinquedo brinquedo = new Brinquedo();
	
	public void exibeMenu() {
		int opcao;
		
		do {
			opcao = EntradaSaida.solicitaopcao();
			switch(opcao) {
				case 0:
					fabrica.fabricarBrinquedo();
				break;
				case 1:
					fabrica.listarBrinquedos();
				break;
				case 2:
					fabrica.venderBrinquedos();
				break;
				case 3:
					fabrica.listarCupons();
				break;
				case 4:
					fabrica.mostrarTotalVenda();
				break;
			}
		}while(opcao!=5);
	}
}
