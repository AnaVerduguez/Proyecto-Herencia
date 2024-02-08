package proyecto2;

//Creo una clase heredarada. La superclase es Persona y la subclase es Cliente. Para eso utilizo la palabra reservada extends
public class Cliente extends Persona {

	//Creo los atributos privados segun el diagrama UML de clases
	private int clienteId;
	
	//Creo el constructor de mi clase cliente
	public Cliente(String nombre, String apellido, String numeroFiscal, String direccion, int clienteId) {
		super(nombre, apellido, numeroFiscal, direccion);
		this.clienteId = clienteId;
	}
	
	//Creo el metodo getter
	public int getClienteId() {
		return clienteId;
	}
	
	//Creo el metodo toString
	@Override
	public String toString() {
		return "Cliente [clienteId=" + clienteId + "]";
	}
	
}
