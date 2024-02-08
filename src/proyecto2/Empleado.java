package proyecto2;

//Creo una clase heredarada. La superclase es Persona y la subclase es Empleado.
public class Empleado extends Persona{
	
	//Creo los atributos privados segun el diagrama UML de clases
	private double remuneracion;
	private int empleadoId;
	
	//Creo el constructor de mi clase Empleado
	public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion,int empleadoId) {
		super(nombre, apellido, numeroFiscal, direccion);
		this.remuneracion = remuneracion;
		this.empleadoId = empleadoId;
	}

	//Creo los metodos getter
	public double getRemuneracion() {
		return remuneracion;
	}
	
	public int getEmpleadoId() {
		return empleadoId;
	}
	
	//Creo el metodo setter para asignar la remuneracion
	public void setRemuneracion(double remuneracion) {
		this.remuneracion = remuneracion;
	}
	
	//Creo el metodo aumentarRemuneracion
	public double aumentarRemuneracion (double porcentaje) {
		this.setRemuneracion((this.remuneracion * porcentaje / 100) + this.remuneracion);
		return this.remuneracion;
	}

	//Creo el metodo toString
	@Override
	public String toString() {
		return "Datos del Empleado [Remuneracion=" + remuneracion + "| EmpeadoId=" + empleadoId +  "| Nombre=" + getNombre()
		+ "| Apellido=" + getApellido() + "| NumeroFiscal=" + getNumeroFiscal() + "| Direccion=" + getDireccion() + "]";
	}
}
