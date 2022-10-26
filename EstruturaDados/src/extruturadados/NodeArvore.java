package extruturadados;

public class NodeArvore {
	private Object valor;
	private NodeArvore direita, esquerda;
	
	
	public NodeArvore() {
		super();
	}
	public NodeArvore(Object valor,NodeArvore esquerda, NodeArvore direita) {
		super();
		this.valor = valor;
		this.direita = direita; 
		this.esquerda = esquerda;
	}
	
	
	
	public NodeArvore(Object valor) {
		super();
		this.valor = valor;
		this.direita = null;
		this.esquerda = null;
	}

	public Object getValor() {
		return valor;
	}
	public void setValor(Object valor) {
		this.valor = valor;
	}
	public NodeArvore getdireita() {
		return direita;
	}
	
	public void setdireita(NodeArvore direita) {
		this.direita = direita;
	}
	
	public NodeArvore getesquerda() {
		return esquerda;
	}
	
	public void setesquerda(NodeArvore esquerda){
		this.esquerda = esquerda;
	}
}
