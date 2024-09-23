
// clase adolecente femenino hijo de masculino 
public class adolecenteM extends mujer implements menor{


	public adolecenteM(String nombre, int edad, String familia, String miembro) {
		super(nombre, edad, familia, miembro);
		// TODO Esbozo de constructor generado automáticamente
	}

	@Override
	public void actividad() {
	    System.out.print(this.getNombre()+ " estudia para la universidad");
		
	}



}
