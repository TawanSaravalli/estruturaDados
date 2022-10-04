package extruturadados;


public class Node {
	private Object valor;
	private Node proximo;
	
	
	public Node() {
		super();
	}
	public Node(Object valor, Node proximo) {
		super();
		this.valor = valor;
		this.proximo = proximo;
	}
	
	
	
	public Node(Object valor) {
		super();
		this.valor = valor;
		this.proximo = null;
	}



	public Object getValor() {
		return valor;
	}
	public void setValor(Object valor) {
		this.valor = valor;
	}
	public Node getProximo() {
		return proximo;
	}
	public void setProximo(Node proximo) {
		this.proximo = proximo;
	}

}
