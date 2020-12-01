
public class Alumno {

	String numAlum;
	String nombreAlum;
	String apellAlum;
	String dirAlum;
	String telfAlum;
	int profe;
	
	
	public Alumno(String numAlum, String nombreAlum, String apellAlum, String dirAlum, String telfAlum, int profe,
			boolean existe) {
		this.numAlum = numAlum;
		this.nombreAlum = nombreAlum;
		this.apellAlum = apellAlum;
		this.dirAlum = dirAlum;
		this.telfAlum = telfAlum;
		this.profe = profe;
		this.existe = existe;
	}
	public String getNumAlum() {
		return numAlum;
	}
	public void setNumAlum(String numAlum) {
		this.numAlum = numAlum;
	}
	public String getNombreAlum() {
		return nombreAlum;
	}
	public void setNombreAlum(String nombreAlum) {
		this.nombreAlum = nombreAlum;
	}
	public String getApellAlum() {
		return apellAlum;
	}
	public void setApellAlum(String apellAlum) {
		this.apellAlum = apellAlum;
	}
	public String getDirAlum() {
		return dirAlum;
	}
	public void setDirAlum(String dirAlum) {
		this.dirAlum = dirAlum;
	}
	public String getTelfAlum() {
		return telfAlum;
	}
	public void setTelfAlum(String telfAlum) {
		this.telfAlum = telfAlum;
	}
	public int getProfe() {
		return profe;
	}
	public void setProfe(int profe) {
		this.profe = profe;
	}
	public boolean isExiste() {
		return existe;
	}
	public void setExiste(boolean existe) {
		this.existe = existe;
	}
	boolean existe;
	
	
}
