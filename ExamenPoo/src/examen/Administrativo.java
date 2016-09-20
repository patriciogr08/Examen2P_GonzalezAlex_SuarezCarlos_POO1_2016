package examen;

public class Administrativo extends Persona implements Pagable{
	protected String cargo;
	protected float sueldo=0;
	protected float salarioAcumulado=0;
	
	public Administrativo(String cedula, String nombre, Genero genero, String fechaNacimiento, String cargo,
			float sueldo) {
		super(cedula, nombre, genero, fechaNacimiento);
		this.cargo = cargo;
		this.sueldo = sueldo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

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

	@Override
	public String toString() {
		return "Administrativo [cargo=" + cargo + ", sueldo=" + sueldo + ", salarioAcumulado=" + salarioAcumulado
				+ ", cedula=" + cedula + ", nombre=" + nombre + ", genero=" + genero + ", fechaNacimiento="
				+ fechaNacimiento + ", estadoActivacion=" + estadoActivacion + "]";
	}

	@Override
	public void pagar() {
		// TODO Auto-generated method stub
		this.salarioAcumulado=this.salarioAcumulado+this.sueldo;
		System.out.println("El salario Acumulado es: "+ this.salarioAcumulado);
	}
	
	@Override
	public int compareTo(Persona o){
		Administrativo ad1=(Administrativo) o;
			if(this.getSueldo()< ad1.getSueldo()){
				return -1;
			}else if(this.getSueldo()> ad1.getSueldo()){
				return 1;
				}
			else
			{
				return 0;
			}
	}
	
	
}
