package aeropuerto;

public class Pasajero extends Persona {

	 protected int pasaporte;

	 public Pasajero(String nombre, String apellido, String dni, String mail, int pasaporte) {
		  super(nombre, apellido, dni, mail);
		  this.pasaporte = pasaporte;
	 }

	 public int getPasaporte() {
		  return pasaporte;
	 }

	 public void setPasaporte(int pasaporte) {
		  this.pasaporte = pasaporte;
	 }

	 public String toString() {
		  return "Nombre: " + this.getNombre() + " Apellido: " + this.getApellido() + " DNI: " + this.getDni() + " Mail: " + this.getMail() + " Pasaporte: " + this.getPasaporte();
	 }
}
