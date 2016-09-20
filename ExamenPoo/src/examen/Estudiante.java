package examen;

public class Estudiante extends Persona{
	
	protected float promedio=0;
	protected int ciclo=0;
	
	public Estudiante(String cedula, String nombre, Genero genero, String fechaNacimiento, float promedio, int ciclo) {
		super(cedula, nombre, genero, fechaNacimiento);
		this.promedio = promedio;
		this.ciclo = ciclo;
	}
	
	public float getPromedio() {
		return promedio;
	}

	public void setPromedio(float promedio) {
		this.promedio = promedio;
	}

	public int getCiclo() {
		return ciclo;
	}

	public void setCiclo(int ciclo) {
		this.ciclo = ciclo;
	}


	public void aprobarCiclo(){
		if(this.promedio >70 ){
			System.out.println("\n Aprobado");
		}
		if(this.ciclo < 10){
			this.ciclo=ciclo+1;
			System.out.println("\n El ciclo al que pasa es el "+this.ciclo);
		}
	}

	@Override
	public String toString() {
		return "Estudiante [promedio=" + promedio + ", ciclo=" + ciclo + ", cedula=" + cedula + ", nombre=" + nombre
				+ ", genero=" + genero + ", fechaNacimiento=" + fechaNacimiento + ", estadoActivacion="
				+ estadoActivacion + "]";
	}
	
	@Override
	public int compareTo(Persona o){
		Estudiante e1=(Estudiante) o;
			if(this.getPromedio()<e1.getPromedio()){
				return -1;
			}else if(this.getPromedio()>e1.getPromedio()){
				return 1;
				}
			else
			{
				return 0;
			}
	}
	
}
