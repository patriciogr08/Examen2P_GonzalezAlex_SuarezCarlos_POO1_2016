package examen;

public	abstract class Persona implements Comparable<Persona>{
	protected String cedula;
	protected String nombre;
	protected Genero genero;
	protected String fechaNacimiento;
	protected boolean estadoActivacion;
	
	public Persona(String cedula, String nombre, Genero genero, String fechaNacimiento) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.genero = genero;
		this.fechaNacimiento = fechaNacimiento;
		this.estadoActivacion = false;
	}
	
	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public boolean isEstadoActivacion() {
		return estadoActivacion;
	}

	public void setEstadoActivacion(boolean estadoActivacion) {
		this.estadoActivacion = estadoActivacion;
	}


	public void Activar(){
		this.estadoActivacion=true;
		return;
	}
	
	public void Desactivar(){
		this.estadoActivacion=false;
		return ;
	}


	
	
	
}
