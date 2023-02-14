package hotelesBBDD;

import java.util.Scanner;

public class GestionReservas {
	
public void run(Scanner scan){
		
		int opcionMenu;
		GestorBBDD gestorBBDD = new GestorBBDD();
		Reserva reserva = new Reserva();
		
		do {
			VisorMenu.visualizarMenuReservas();
			opcionMenu = Integer.parseInt(scan.nextLine());
			
			switch (opcionMenu){
			case VisorMenu.HACER_RESERVA: {
				gestorBBDD.conectar();
				reserva = Formularios.pedirDatosReserva(scan);
				if(gestorBBDD.insertarReserva(reserva))
					System.out.println("Reserva introducido con exito");
				else
					System.out.println("ERROR!!! Reserva no introducido");
				
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
