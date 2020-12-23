
public class Profesor {

	String numProf;
	String nombreProf;
	String apellProf;
	String dirProf;
	String telfProf;
	int aula;
	boolean existe;
	
	public int getAula() {
		return aula;
	}
	public Profesor(String numProf, String nombreProf, String apellProf, String dirProf, String telfProf, int aula,
			boolean existe) {
		this.numProf = numProf;
		this.nombreProf = nombreProf;
		this.apellProf = apellProf;
		this.dirProf = dirProf;
		this.telfProf = telfProf;
		this.aula = aula;
		this.existe = existe;
	}
	public void setAula(int aula) {
		this.aula = aula;
	}
	
	public String getNumProf() {
		return numProf;
	}
	public void setNumProf(String numProf) {
		this.numProf = numProf;
	}
	public String getNombreProf() {
		return nombreProf;
	}
	public void setNombreProf(String nombreProf) {
		this.nombreProf = nombreProf;
	}
	public String getApellProf() {
		return apellProf;
	}
	public void setApellProf(String apellProf) {
		this.apellProf = apellProf;
	}
	public String getDirProf() {
		return dirProf;
	}
	public void setDirProf(String dirProf) {
		this.dirProf = dirProf;
	}
	public String getTelfProf() {
		return telfProf;
	}
	public void setTelfProf(String telfProf) {
		this.telfProf = telfProf;
	}
	public boolean isExiste() {
		return existe;
	}
	public void setExiste(boolean existe) {
		this.existe = existe;
	}
	
}
