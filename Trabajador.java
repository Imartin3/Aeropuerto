package aeropuerto;

public class Trabajador extends Persona{
	 protected float sueldo;

	 public Trabajador (String nombre, String apellido, String dni, String mail, float sueldo) {
		 super(nombre, apellido, dni, mail);
		 this.sueldo = sueldo;
	 }

	 public float getSueldo() {
		 return sueldo;
	 }

	 public void setSueldo(float sueldo) {
		 this.sueldo = sueldo;
	 }



}
