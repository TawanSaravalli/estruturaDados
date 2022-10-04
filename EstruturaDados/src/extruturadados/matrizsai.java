package extruturadados;

public class matrizsai {
	private int vertical, horizontal, range;
	private ArraySai matrizsai;
	public matrizsai(int vertical, int horizontal) {
		super();
		this.vertical = vertical;
		this.horizontal = horizontal;
		this.range = this.vertical * this.horizontal;
		this.matrizsai = new ArraySai(0, range);
	}
	public void atribuir(int horizontal, int vertical, int valor) {
		this.matrizsai.atribuir(((horizontal-1) * this.vertical) + (vertical -1) , valor);
	}
	public int retornar(int horizontal, int vertical) {
		return this.matrizsai.retornar(((horizontal-1) * this.vertical) + (vertical -1));
	}
}
