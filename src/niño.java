
// clase niño hijo de masculino
public class niño extends masculino implements menor{



	public niño(String nombre, int edad, String familia, String miembro) {
		super(nombre, edad, familia, miembro);
		// TODO Esbozo de constructor generado automáticamente
	}

	@Override
	public void actividad() {
		System.out.print(this.getNombre() + " esta jugando con su juguetes ");
		
	}
	
	


}
