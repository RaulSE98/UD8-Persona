
public class Persona {
	
	private String nombre;
	private int edad = 0;
	private String DNI;
	private static char sexo ='H' ;
	private double peso;
	private double altura;

	public Persona() {
		// TODO Auto-generated constructor stub
		
	}
	
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		
	}
	public Persona(String nombre, int edad, String dNI, char sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		DNI = dNI;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

}
