package examen;

public class Profesor extends Persona implements Pagable{
	
	public Profesor(String cedula, String nombre, Genero genero, String fechaNacimiento, float sueldo,
			 String materia,int cantidadMateriasDadas) {
		super(cedula, nombre, genero, fechaNacimiento);
		this.sueldo = sueldo;
		this.materia = materia;
		this.cantidadMateriasDadas=cantidadMateriasDadas;
	}
	protected float sueldo=0;
	protected float salarioAcumulado=0;
	protected String materia;
	protected int cantidadMateriasDadas=0;

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	public float getSalarioAcumulado() {
		return salarioAcumulado;
	}

	public void setSalarioAcumulado(float salarioAcumulado) {
		this.salarioAcumulado = salarioAcumulado;
	}

	public String getMateria() {
		return materia;
	}
	
	public void setMateria(String materia) {
		this.materia = materia;
	}

	public void ensenar(){
		System.out.println("\n Bla bla bla blaaaaaaaaaaaaa xD ");
	}	
	
	
	@Override
	public String toString() {
		return "Profesor [sueldo=" + sueldo + ", salarioAcumulado=" + salarioAcumulado + ", materia=" + materia
				+ ", cedula=" + cedula + ", nombre=" + nombre + ", genero=" + genero + ", fechaNacimiento="
				+ fechaNacimiento + ", estadoActivacion=" + estadoActivacion + "]";
	}

	@Override
	public void pagar() {
		this.salarioAcumulado=this.sueldo+(this.cantidadMateriasDadas*300);
		System.out.println("\n El total de su salario mensual es: " + this.salarioAcumulado);
		
	}
	
	@Override
	public int compareTo(Persona o){
		Profesor pr1=(Profesor) o;
			if(this.getSueldo()< pr1.getSueldo()){
				return -1;
			}else if(this.getSueldo()> pr1.getSueldo()){
				return 1;
				}
			else
			{
				return 0;
			}
	}
	
	
	
	
}
