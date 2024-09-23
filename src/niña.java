// clase niña hijo de femenino
public class niña extends femenino implements menor{



	public niña(String nombre, int edad, String familia, String miembro) {
		super(nombre, edad, familia, miembro);
		// TODO Esbozo de constructor generado automáticamente
	}

	@Override
	public void actividad() {
		System.out.print(this.getNombre() + " esta jugando con sus muñecas");
		
	}
	
	



}
