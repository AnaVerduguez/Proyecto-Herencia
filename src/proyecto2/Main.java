package proyecto2;

public class Main {
	public static void main(String[] args) {
    	
    //Creo un objeto para clase cliente y otro para la clase empleado
	Gerente gerente1 = new Gerente ("Ana", "Verduguez", "261", "Mario Bravo 178", 90000, 1, 90000);
	
	Empleado empleado1 = new Empleado("Carolina", "Alvear", "16700", "Bulnes 1242", 70000, 1);
	
	//Imprimo por pantalla los datos del objeto heredados con toString()
	System.out.println(gerente1.toString());
	System.out.println(empleado1.toString());
	
	//Imprimo el resultado con el aumento de remunaeracion
	System.out.println("La remuneracion final del gerente con el aumento es de: " + gerente1.aumentarRemuneracion(15));
	
	}
}