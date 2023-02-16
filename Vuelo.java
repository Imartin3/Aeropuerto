package aeropuerto;
import java.util.Arrays;

public class Vuelo {

	 protected String origen;
	 protected String destino;
	 protected Piloto piloto;
	 protected Pasajero[] pasajeros;

	 public Vuelo(String origen, String destino, Piloto piloto) {
		 this.origen = origen;
		 this.destino = destino;
		 this.piloto = piloto;
		 this.pasajeros = new Pasajero[10];
	 }

	 public String getOrigen() {
		 return origen;
	 }

	 public void setOrigen(String origen) {
		 this.origen = origen;
	 }

	 public String getDestino() {
		 return destino;
	 }

	 public void setDestino(String destino) {
		 this.destino = destino;
	 }

	 public Piloto getPiloto() {
		 return piloto;
	 }

	 public void setPiloto(Piloto piloto) {
		 this.piloto = piloto;
	 }

	 public void addPasajero(Pasajero pasajero) {
		 for (int i = 0; i < this.pasajeros.length; i++) {
			 if (this.pasajeros[i] == null) {
				 this.pasajeros[i] = pasajero;
				 break;
			 }
		 }
	 }

	 public void listaPasajeros(){
		  for (int i = 0; i < this.pasajeros.length; i++) {
			  System.out.println(this.pasajeros[i].toString());
		  }
	 }

	 public void infoVuelo() {
		  System.out.println("--------Vuelo--------");
		  System.out.println("Origen: " + this.getOrigen());
		  System.out.println("Destino: " + this.getDestino());
		  System.out.println("--------------------");
	 }
}
