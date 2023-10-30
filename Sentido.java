/*
* @Author: Juan Carlos Gallego García
*/
package brandubh.util;

public enum Sentido{
	Vertical_N(-1,0),
	Vertical_S(-1,0),
	Horizontal_E(-1,0),
	Horizontal_W(-1,0);
	private int desplazamientoEnFilas;
	private int desplazamientoEnColumnas;


	private Sentido (int desplazamientoEnFilas, int desplazamientoEnColumnas) {
		this.desplazamientoEnFilas = desplazamientoEnFilas;
		this.desplazamientoEnColumnas = desplazamientoEnColumnas;
	}
	
	public int consultaDesplazamientoEnFilas() {
		return this.desplazamientoEnFilas;
	}
	
	public int consultaDesplazamientoEnColumnas() {
		return this.desplazamientoEnColumnas;
	}
}