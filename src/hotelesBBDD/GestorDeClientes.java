package hotelesBBDD;

import java.util.Scanner;

public class GestorDeClientes {
	
	public void run(Scanner scan){
		
		int opcionMenu;
		
		do {
			VisorMenu.visualizarMenuCliente();
			opcionMenu = Integer.parseInt(scan.nextLine());
			
			switch (opcionMenu){
			case VisorMenu.ALTA_CLIENTE: {
				System.out.println("Alta cliente");
				break;
			}
			
			case VisorMenu.MODIFICAR_CLIENTE: {
				System.out.println("Modificar cliente");
				break;
			}
			
			case VisorMenu.ELIMINAR_CLIENTE: {
				System.out.println("Eliminar cliente");
				break;
			}
			
			case VisorMenu.VER_CLIENTES: {
				System.out.println("Ver clientes");
				break;
			}
			
			case VisorMenu.SALIR: {
				System.out.println("Alta cliente");
				break;
			}
			
			default:
				System.out.println("ERROR");
			}
			
		} while (opcionMenu != VisorMenu.SALIR);
	}
	
}
