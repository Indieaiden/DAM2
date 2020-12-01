
public class Aula {

	String numAula;
	String tamano;
	
	public Aula(String numAula, String tamano, String ventilacion, boolean existe) {
		this.numAula = numAula;
		this.tamano = tamano;
		this.ventilacion = ventilacion;
		this.existe = existe;
	}
	
	String ventilacion;
	boolean existe;
	
	public String getNumAula() {
		return numAula;
	}
	public void setNumAula(String numAula) {
		this.numAula = numAula;
	}
	public String getTamano() {
		return tamano;
	}
	public void setTamano(String tamano) {
		this.tamano = tamano;
	}
	public String getVentilacion() {
		return ventilacion;
	}
	public void setVentilacion(String ventilacion) {
		this.ventilacion = ventilacion;
	}
	
	
}
