// clase prinsipal humano
public class humano {
private  String nombre;
private  String familia;
private  int edad;
private  String genero;
private  String miembro;


	public humano(String nombre,int edad,String familia,String miembro) {
this.nombre = nombre;
this.edad = edad;
this.familia = familia;
this.miembro = miembro;
	}

    public String getNombre() {
        return nombre;
    }

    public String getFamilia() {
        return familia;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    public String getMiembro() {
        return miembro;
    }
    
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setMiembro(String miembro) {
        this.miembro = miembro;
    }
        
        
        
	
	

}



