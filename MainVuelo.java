package aeropuerto;

public class MainVuelo {

	 public static void main(String[] args) {

		  Piloto p1 = new Piloto("Manuel", "Perez", "12345678", "manuel@manuel.com; ", 1000, Piloto.rango.valueOf("Águila"), true);
		  Azafato a1 = new Azafato("Maria", "Gomez", "87654321", "maria@maria.com", 500, Azafato.idiomas.valueOf("Ingles"));
		  Pasajero pas1 = new Pasajero("Juan", "Gonzalez", "12345678", "juan@juan.com", 12345678);
		  Pasajero pas2 = new Pasajero("Pablo", "Ruíz", "34259023", "pablo@pablo.com", 12323678);
		  Pasajero pas3 = new Pasajero("Antonio", "Martín", "3423453", "antonio@antonio.com", 645123451);
		  Pasajero pas4 = new Pasajero("Jose", "García", "67533453", "jose@jose.com", 34252634);
		  Pasajero pas5 = new Pasajero("Eduardo", "Martínez", "7898342", "eduardo@eduardo.com", 245235643);
		  Pasajero pas6 = new Pasajero("Marcos", "Jimenez", "67523234", "marcos@marcos.com", 78960455);
		  Pasajero pas7 = new Pasajero("Guillermo", "Sanchéz", "68769234", "guille@guille.com", 52665634);
		  Pasajero pas8 = new Pasajero("Marta", "Durán", "11242563", "marta@marta.com", 678672445);
		  Pasajero pas9 = new Pasajero("Carmen", "Peralías", "4657754", "carmen@carmen.com", 899043446);
		  Pasajero pas10 = new Pasajero("Irene", "Camino", "21545667", "irene@irene.com", 1324562365);
		  Pasajero pas11 = new Pasajero("Lorena", "Rodeo", "43523522", "lorena@lorena.com", 673453234);
		  Vuelo v1 = new Vuelo("Kiev", "Sevilla", p1);
		  v1.addPasajero(pas1);
		  v1.addPasajero(pas2);
		  v1.addPasajero(pas3);
		  v1.addPasajero(pas4);
		  v1.addPasajero(pas5);
		  v1.addPasajero(pas6);
		  v1.addPasajero(pas7);
		  v1.addPasajero(pas8);
		  v1.addPasajero(pas9);
		  v1.addPasajero(pas10);
		  v1.addPasajero(pas11);

		  p1.mostrarPiloto();
		  a1.mostrarAzafato();
		  v1.listaPasajeros();

		  v1.infoVuelo();








	 }
}
