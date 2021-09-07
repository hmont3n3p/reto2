package unal.reto2.vehiculos.co;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class main {

	static Integer horaActual = 8;
	static List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	static Double totalEnvios;

	public static void main(String[] args) {
		presentarMenu();

	}

	static void creacionVehiculos() {

	}

	static void presentarMenu() {
		boolean salir1 = false;
		boolean salir2 = false;

		while (!salir1) {

			for (int i = 1; i <= 10; i++) {
				System.out.printf("Bicicleta %s ingrese el primer operario: \n", i);
				Scanner scanner = new Scanner(System.in);
				String input = scanner.nextLine();
				Bicicleta bicicleta = new Bicicleta(input);
				vehiculos.add(bicicleta);
			}
			for (int i = 1; i <= 5; i++) {
				System.out.printf("Moto %s ingrese el primer operario: \n", i);
				Scanner scanner = new Scanner(System.in);				
				String input = scanner.nextLine();
				Moto moto = new Moto(input);
				vehiculos.add(moto);

			}
			for (int i = 1; i <=3; i++) {
				System.out.printf("AE %s ingrese el primer operario: \n", i);
				Scanner scanner = new Scanner(System.in);
				String input = scanner.nextLine();
				AutomovilElectrico automovilElectrico = new AutomovilElectrico(input);
				vehiculos.add(automovilElectrico);

			}
			for (int i = 1; i <= 1; i++) {
				System.out.printf("Camion %s ingrese el primer operario: \n", i);
				Scanner scanner = new Scanner(System.in);
				String input = scanner.nextLine();
				Camion camion = new Camion(input);
				vehiculos.add(camion);

			}
		

			salir1 = true;
		}		
		String opcion;
		Scanner scanner = new Scanner(System.in);
		while (!salir2) {
			System.out.printf("Hora actual: %s%n", horaActual);
			System.out.print(" 1. Recepcion envio \n 2. Obtener estado de los vehiculos actualmente 2 \n 3. Realizar despachos de la hora \n");
            opcion = scanner.nextLine();      
            switch (opcion) {
                case "1":
                	recepcionEnvio();
        
                    break;
                case "2":
                	obtenerEstadoVehiculos();                 
                    break;
                case "3":
                	realizarDespachos();                  
                    break;
                default:
                    System.out.print("Opcion no valida! \n");
            }
		}

	}

	static void recepcionEnvio() {
		 System.out.print("Opcion no envio!");

	}

	static void realizarDespachos() {
		 System.out.print("Opcion no despacho!");
	}

	static void obtenerEstadoVehiculos() {
		System.out.print("Opcion no estado veh!");
		for (Vehiculo vehiculo : vehiculos) {
			System.out.println(vehiculo);
		}
	}

}
