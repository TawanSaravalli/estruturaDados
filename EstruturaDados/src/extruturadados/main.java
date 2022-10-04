package extruturadados;

public class main {

	public static void main(String[] args) {
		
		
		//Teste PilhaaEncadedada
		PilhaEncadeada listaEncadeada = new PilhaEncadeada(10);
		listaEncadeada.push(10);
		listaEncadeada.push(20);
		listaEncadeada.push(30);
		System.out.println("Pop: " + listaEncadeada.pop());
		System.out.println("Pop: " + listaEncadeada.pop());
		System.out.println("Pop: " + listaEncadeada.pop());
		System.out.println("Pop: " + listaEncadeada.pop());
		
		
		//Teste FilaEncadeada
		FilaEncadeada filaEncadeada = new FilaEncadeada(10);
		filaEncadeada.enfila(10);
		filaEncadeada.enfila(20);
		filaEncadeada.enfila(30);
		
		System.out.println("Desenfila: " + filaEncadeada.desenfila());
		System.out.println("Desenfila: " + filaEncadeada.desenfila());
		System.out.println("Desenfila: " + filaEncadeada.desenfila());
		System.out.println("Desenfila: " + filaEncadeada.desenfila());
	}

}
