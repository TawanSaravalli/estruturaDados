package extruturadados;

public class ArraySai {
	int init, sup, range;
	int[] arraysai;
	public ArraySai(int init, int sup) {
		super();
		if(sup > init) {
			this.init = init;
			this.sup = sup;
		}else {
			this.init = sup;
			this.sup = init;
		}
		
		this.range = (this.sup - this.init) + 1;
		arraysai = new int[this.range];
	}
	
	public boolean verificaRange(int pos) {
		if((pos-init) < 0 || (pos - init) > range ) {
			System.out.println("Posição fora do range!");
			return false;
		}
		return true;		
	}
	
	public void atribuir (int pos, int valor) {
		verificaRange(pos);
		arraysai[pos-init] = valor;
	}
	
	public int retornar(int pos) {
		verificaRange(pos);
		return arraysai[pos-init];
	}
	
}
