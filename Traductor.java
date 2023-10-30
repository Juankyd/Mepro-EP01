package brandubh.util;

public class Traductor {

	public Coordenada consultarCoordenadaParaNotacionAlgebraica(String texto) {
		if (texto.length() != 2) {
			return null;
		}
		char filaChar= texto.charAt(0);
		char columnaChar = texto.charAt(1);
	}
	
	public String consultarTextoEnNotacionAlgebraica(Coordenada coordenada) {
		int fila = coordenada.fila();
		int columna = coordenada.columna();
		if (fila >= 0 && fila < 7 && columna >= 0 && columna < 7) {
			char filaChar = (char)('a'+ fila);
			char columnaChar = (char) ('1'+ columna);
			return String.valueOf(filaChar)+ String.valueOf(columnaChar);
		}
		return null;
	}
	
	public boolean esTextoCorrectoParaCoordenada(String texto) {
		return consultarCoordenadaParaNotacionAlgebraica(texto) != null;
	}
}