/*
* @Author: Juan Carlos Gallego García
*/
package brandubh.util;

public enum Color{
	Blanco("B"),
	Negro("N");
	char Letra;
	
	private Color(String abreviatura){
		this.Letra = abreviatura.toCharArray()[0];
	}
	
	public Color consultarContrario() {
		if (Letra == 0)
			return Negro;
		else
			return Blanco;
	}
	
	public char toChar() {
		return this.Letra;
	}
}