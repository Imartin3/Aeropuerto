package aeropuerto;

public class Azafato extends Trabajador {
	 protected enum idiomas {Ingles, Frances, Aleman, Espanyol, Portugués}

	 protected idiomas idioma;

	 public Azafato(String nombre, String apellido, String dni, String mail, float sueldo, idiomas idioma) {
		  super(nombre, apellido, dni, mail, sueldo);
		  this.idioma = idioma;
	 }

	 public idiomas getIdioma() {
		  return idioma;
	 }

	 public void setIdioma(idiomas idioma) {
		  this.idioma = idioma;
	 }

	 public void mostrarAzafato() {
		  System.out.println("-------Azafato--------");
		  System.out.println("Nombre: " + this.getNombre());
		  System.out.println("Apellido: " + this.getApellido());
		  System.out.println("DNI: " + this.getDni());
		  System.out.println("Mail: " + this.getMail());
		  System.out.println("Sueldo: " + this.getSueldo());
		  System.out.println("Idioma: " + this.getIdioma());
		  System.out.println("--------------------");
	 }
}





