package proyecto2;

//Creo una clase heredarada. La superclase es Empleado y la subclase es Gerente.
public class Gerente extends Empleado {
	
	private double presupuesto;
	
	//Creo el constructor de la clase gerente
	public Gerente(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion, int empeadoId, double presupuesto) {
		super(nombre, apellido, numeroFiscal, direccion, remuneracion, empeadoId);
		this.presupuesto = presupuesto;
	}

	//Creo el metodo getter
	public double getPresupuesto() {
		return presupuesto;
	}
	
	//Creo el metodo setter
	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}
	
	//Creo el metodo toString
	@Override
	public String toString() {
		return "Datos del Gerente [presupuesto=" + presupuesto + "|Remuneracion=" + getRemuneracion() + "| EmpeadoId=" + getEmpleadoId() +  "| Nombre=" + getNombre()
				+ "| Apellido=" + getApellido() + "| NumeroFiscal=" + getNumeroFiscal() + "| Direccion=" + getDireccion() + "]";
	}
	
}
