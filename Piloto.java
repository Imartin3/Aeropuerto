package aeropuerto;

public class Piloto extends Trabajador{

	 protected enum rango {Alpha, Tango, Águila}
	 protected rango rangoPiloto;
	 protected boolean vuelosInternacionales;

	 public Piloto(String nombre, String apellido, String dni, String mail, float sueldo, rango rangoPiloto, boolean vuelosInternacionales) {
		 super(nombre, apellido, dni, mail, sueldo);
		 this.rangoPiloto = rangoPiloto;
		 this.vuelosInternacionales = vuelosInternacionales;
	 }

	 public rango getRangoPiloto() {
		 return rangoPiloto;
	 }

	 public void setRangoPiloto(rango rangoPiloto) {
		 this.rangoPiloto = rangoPiloto;
	 }

	 public boolean isVuelosInternacionales() {
		 return vuelosInternacionales;
	 }

	 public void setVuelosInternacionales(boolean vuelosInternacionales) {
		 this.vuelosInternacionales = vuelosInternacionales;
	 }

	 public void mostrarPiloto() {
		  System.out.println("--------Piloto-------");
		  System.out.println("Nombre: " + this.getNombre());
		  System.out.println("Apellido: " + this.getApellido());
		  System.out.println("DNI: " + this.getDni());
		  System.out.println("Mail: " + this.getMail());
		  System.out.println("Sueldo: " + this.getSueldo());
		  System.out.println("Rango: " + this.getRangoPiloto());
		  System.out.println("Vuelos Internacionales: " + this.isVuelosInternacionales());
		  System.out.println("--------------------");
	 }


}
