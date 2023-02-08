package hotelesBBDD;

import java.util.Scanner;

public class GestorHotel {

	public void run(Scanner scan) {

		int opcionMenu;

		do {
			VisorMenu.visualizarMenuHoteles();
			opcionMenu = Integer.parseInt(scan.nextLine());

			switch (opcionMenu) {
			case VisorMenu.ANADIR_HOTEL: {
				System.out.println("Añadir hotel");
				break;
			}

			case VisorMenu.ELIMINAR_HOTEL: {
				System.out.println("Eliminar hotel");
				break;
			}

			case VisorMenu.MODIFICAR_HOTEL: {
				System.out.println("Modificar hotel");
				break;
			}

			case VisorMenu.VER_HOTELES: {
				System.out.println("Ver hoteles");
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
