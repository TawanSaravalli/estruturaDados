package extruturadados;

public class NodeDuplamente {
	private Object valor;
	private NodeDuplamente proximo, anterior;
	
	
	public NodeDuplamente() {
		super();
	}
	public NodeDuplamente(Object valor,NodeDuplamente anterior, NodeDuplamente proximo) {
		super();
		this.valor = valor;
		this.proximo = proximo; 
		this.anterior = anterior;
	}
	
	
	
	public NodeDuplamente(Object valor) {
		super();
		this.valor = valor;
		this.proximo = null;
		this.anterior = null;
	}

	public Object getValor() {
		return valor;
	}
	public void setValor(Object valor) {
		this.valor = valor;
	}
	public NodeDuplamente getProximo() {
		return proximo;
	}
	
	public void setProximo(NodeDuplamente proximo) {
		this.proximo = proximo;
	}
	
	public NodeDuplamente getAnterior() {
		return anterior;
	}
	
	public void setAnterior(NodeDuplamente anterior){
		this.anterior = anterior;
	}
}
