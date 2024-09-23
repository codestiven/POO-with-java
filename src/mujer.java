// clase mujer hijo de femenino
public class mujer extends femenino implements mayor{

	public mujer(String nombre, int edad, String familia, String miembro) {
		super(nombre, edad, familia, miembro);
		// TODO Esbozo de constructor generado automáticamente
	}

	@Override
	public void trabaja() {
		System.out.print(this.getNombre() + "esta trabajando ");
		
	}

	@Override
	public void cuidar() {
		System.out.print(this.getNombre() + "cuida a sus hijos");
		
	}

	@Override
	public void casa_sulla() {
		System.out.print(this.getNombre() + "tiene una casa propia");
		
	}


}
