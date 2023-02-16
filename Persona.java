package aeropuerto;

public class Persona {
	 protected String nombre;
	 protected String apellido;
	 protected String dni;
	 protected String mail;

	 public Persona(String nombre, String apellido, String dni, String mail) {
		 this.nombre = nombre;
		 this.apellido = apellido;
		 this.dni = dni;
		 this.mail = mail;
	 }

	 public String getNombre() {
		 return nombre;
	 }

	 public void setNombre(String nombre) {
		 this.nombre = nombre;
	 }

	 public String getApellido() {
		 return apellido;
	 }

	 public void setApellido(String apellido) {
		 this.apellido = apellido;
	 }

	 public String getDni() {
		 return dni;
	 }

	 public void setDni(String dni) {
		 this.dni = dni;
	 }

	 public String getMail() {
		 return mail;
	 }

	 public void setMail(String mail) {
		 this.mail = mail;
	 }
}
