package hotelesBBDD;

import java.util.Scanner;

public class GestionReservas {
	
public void run(Scanner scan){
		
		int opcionMenu;
		
		do {
			VisorMenu.visualizarMenuReservas();
			opcionMenu = Integer.parseInt(scan.nextLine());
			
			switch (opcionMenu){
			case VisorMenu.HACER_RESERVA: {
				System.out.println("Hacer reserva");
				break;
			}
			
			case VisorMenu.ELIMINAR_RESERVA: {
				System.out.println("Eliminar reserva");
				break;
			}
			
			case VisorMenu.VER_RESERVAS: {
				System.out.println("Ver reservas");
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
