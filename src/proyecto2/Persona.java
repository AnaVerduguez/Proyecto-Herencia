package proyecto2;

public class Persona {
	
	//Creo los atributos privados segun el diagrama UML de clases
	private String nombre;
	private String apellido;
	private String numeroFiscal;
	private String direccion;
	
	//Creo el constructor de mi clase persona
	public Persona(String nombre, String apellido, String numeroFiscal, String direccion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeroFiscal = numeroFiscal;
		this.direccion = direccion;
	}
	
	//Creo los metodos getter 
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}
	
	public String getNumeroFiscal() {
		return numeroFiscal;
	}
	
	public String getDireccion() {
		return direccion;
	}

	//Creo el metodo toString
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", numeroFiscal=" + numeroFiscal
				+ ", direccion=" + direccion + "]";
	}
	
}
