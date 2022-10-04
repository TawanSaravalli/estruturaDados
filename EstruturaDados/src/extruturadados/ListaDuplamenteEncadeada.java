package extruturadados;

import javax.print.attribute.standard.NumberOfDocuments;

public class ListaDuplamenteEncadeada {
	private NodeDuplamente inicio;
	private NodeDuplamente indice;
	private int cont = 0;

	public ListaDuplamenteEncadeada() {
		super();
		this.inicio = new NodeDuplamente();
	}

	public void vaiParaInicio() {
		indice = inicio;
	}

	public void vaiParaFim() {
		indice = inicio.getAnterior();
	}

	public void avancaINdice(int n) {
		for (int i = 0; i < n; i++) {
			indice = indice.getProximo();
		}
	}

	public void retrocedeIndice(int n) {
		for (int i = n; i < 0; i--) {
			indice = indice.getAnterior();
		}
	}
	
	public void insereAnterior(Object valor) {
		NodeDuplamente novoNodo = new NodeDuplamente(valor);
		
	}
//	public void enfila(Object valor) {
//		if (cont >= max) {
//			throw new Error("Fila Cheia");
//		}else if(cont == 0) {
//			NodeDuplamente novo = new NodeDuplamente(valor);
//			inicio= novo;
//			fim =  inicio;
//			cont++;
//		}else{
//			NodeDuplamente novo = new NodeDuplamente(valor);
//			fim.setProximo(novo);
//			fim = novo;
//			cont++;
//		}
//	}

	public Object desenfila() {
		if (cont > 0) {
			Object valor = inicio.getValor();
			inicio = inicio.getProximo();
			cont--;
			return valor;
		} else {
			throw new Error("não existem itens a serem extraidos");
		}
	}

}
