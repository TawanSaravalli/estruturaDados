package extruturadados;

public class FilaEncadeada {
	private Node inicio;
	private Node fim;
	private int cont = 0;
	private int max;

	public FilaEncadeada(int max) {
		super();
		this.inicio = new Node();
		this.max = max;
	}

	public void enfila(Object valor) {
		if (cont >= max) {
			throw new Error("Fila Cheia");
		}else if(cont == 0) {
			Node novo = new Node(valor);
			inicio= novo;
			fim =  inicio;
			cont++;
		}else{
			Node novo = new Node(valor);
			fim.setProximo(novo);
			fim = novo;
			cont++;
		}
	}

	public Object desenfila() {
		if (cont > 0) {
			Object valor = inicio.getValor();
			inicio = inicio.getProximo();
			cont--;
			return valor;
		}else {
			throw new Error("não existem itens a serem extraidos");
		}
	}

}
