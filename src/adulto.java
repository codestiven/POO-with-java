

// clase adulto hijo de masculino 

public class adulto extends masculino implements mayor{


	



	public adulto(String nombre, int edad, String familia, String miembro) {
		super(nombre, edad, familia, miembro);
		// TODO Esbozo de constructor generado automáticamente
	}

	@Override
	public void trabaja() {
		System.out.print(this.getNombre() + "esta siendo ama de casa");
		
	}

	@Override
	public void cuidar() {
		System.out.print(this.getNombre() + "cuida a sus hijos y a su casa");
		
	}

	@Override
	public void casa_sulla() {
		System.out.print(this.getNombre() + "tiene una casa propia");
		
	}



}
