/*
* @Author:Juan Carlos Gallego García
*/
package brandubh.util;


public enum TipoPieza{
	Defensor('D',Color.Blanco),
	Atacante('A',Color.Negro),
	Rey('R',Color.Blanco);
	private char Letra;
	private Color color;
	
	private TipoPieza(char Letra, Color color) {
		this.Letra = Letra;
		this.color = color;
	}

	public Color consultarColor () {
		if (this.Letra == 'D') 
			return Color.Blanco;
		else if(this.Letra == 'A')
			return Color.Negro;
		else if(this.Letra == 'R')
			return Color.Blanco;
		else
			return null;
	}
	
	public char toChar() {
		return this.Letra;
	}
	
	
}