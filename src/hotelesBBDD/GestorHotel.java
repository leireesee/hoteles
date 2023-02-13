package hotelesBBDD;

import java.util.Scanner;

public class GestorHotel {

	public void run(Scanner scan) {

		int opcionMenu;
		GestorBBDD gestorBBDD = new GestorBBDD();
		Hotel hotel = null;

		do {
			VisorMenu.visualizarMenuHoteles();
			opcionMenu = Integer.parseInt(scan.nextLine());

			switch (opcionMenu) {
			case VisorMenu.ANADIR_HOTEL: {
				gestorBBDD.conectar();
				hotel = Formularios.pedirDatosHotel(scan);
				if(gestorBBDD.insertarHotel(hotel)) { 
					System.out.println("Hotel introducido con exito");
					new GestorHabitaciones();
				} else {
					System.out.println("ERROR!!! Hotel no introducido");
				}
				gestorBBDD.cerrar();
				break;
				
			}

			case VisorMenu.ELIMINAR_HOTEL: {
				gestorBBDD.conectar();
				int id = Formularios.pedirIdHotel(scan);
				if(gestorBBDD.eliminarHotel(id))
					System.out.println("Hotel eliminado con exito");
				else
					System.out.println("ERROR!!! Hotel no eliminado");
				gestorBBDD.cerrar();
				break;
			}

			case VisorMenu.MODIFICAR_HOTEL: {
				System.out.println("Modificar hotel");
				break;
			}

			case VisorMenu.VER_HOTELES: {
				gestorBBDD.conectar();
				Visor.mostrarHoteles(gestorBBDD.verHoteles());
				gestorBBDD.cerrar();
				break;
			}

			case VisorMenu.SALIR: {
				System.out.println("Salir");
				break;
			}

			default:
				System.out.println("ERROR");
			}

		} while (opcionMenu != VisorMenu.SALIR);
	}
}
