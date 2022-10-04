package extruturadados;

public class PilhaEncadeada {
	private Node topo ;
	private int cont = 0;
	private int max;

	public PilhaEncadeada(int max) {
		super();
		this.topo = null;
		this.max = max;
	}

	public void push(Object valor) {
		if (cont >= max) {
			throw new Error("Fila Cheia");
		}else {
			Node novo = new Node(valor, topo);
			topo = novo;
			cont++;
		}
	}

	public Object pop() {
		if (cont > 0) {
			Object valor = topo.getValor();
			topo = topo.getProximo();
			cont--;
			return valor;
		}else {
			throw new Error("não existem itens a serem extraidos");
		}
	}

}
