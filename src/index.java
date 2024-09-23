
// codigo principal o main
public class index {

	public static void main(String[] args) {
		
		// familia  Martínez
		adulto padre1 = new adulto("jorge", 50, "Martínez","padre");
		mujer madre1 = new mujer("marta", 45, "Martínez","madre");
		niña hija1 = new niña("jorge", 9, "Martínez","hijo");
		adolecente hijo1 = new adolecente("marta",18 , "Martínez","hija");
		adulto tio1 = new adulto("carlos", 50, "Martínez","tio");
		mujer tia1 = new mujer("paulina", 45, "Martínez","tia");
		adulto abuelo1 = new adulto("marcos", 81, "Martínez","abuelo");
		mujer abuela1 = new mujer("mansueta", 85 , "Martínez","abuela");

		//familia Sánchez
		adulto padre2 = new adulto("darlin", 46, "Sánchez","padre");
		mujer madre2 = new mujer("adreanna", 30, "Sánchez","madre");
		adolecenteM hija2 = new adolecenteM("adargisa", 19, "Sánchez","hija");
		adolecente hijo2 = new adolecente("limon",18 , "Sánchez","hijo");
		adulto tio2 = new adulto("mani", 50, "Sánchez","tio");
		mujer tia2 = new mujer("tati", 35, "Sánchez","tia");
		adulto abuelo2 = new adulto("juan", 89, "Sánchez","abuelo");
		mujer abuela2 = new mujer("candara", 78 , "Sánchez","abuela");
		


		System.out.print(padre1);
                
                madre1.cuidar();

			

	}

}
