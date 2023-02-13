package hotelesBBDD;

import java.util.Scanner;

public class GestorPrincipal {
	
	public void run(){
			
			Scanner scan = new Scanner(System.in);
			int opcionMenu;
			
			do {
				VisorMenu.visualizarMenuPrincipal();
				opcionMenu = Integer.parseInt(scan.nextLine());
				
				switch (opcionMenu){
				case VisorMenu.GESTIONAR_CLIENTES: {
					new GestorDeClientes().run(scan);
					break;
				}
				
				case VisorMenu.GESTIONAR_RESERVAS: {
					new GestionReservas().run(scan);
					break;
				}
				
				case VisorMenu.GESTIONAR_HOTELES: {
					new GestorHotel().run(scan);
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
