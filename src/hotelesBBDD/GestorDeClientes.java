package hotelesBBDD;

import java.util.Scanner;

public class GestorDeClientes {
	
	public void run(Scanner scan){
		
		int opcionMenu;
		GestorBBDD gestorBBDD = new GestorBBDD();	
		Cliente cliente = null;
		
		do {
			VisorMenu.visualizarMenuCliente();
			opcionMenu = Integer.parseInt(scan.nextLine());
			
			switch (opcionMenu){
			case VisorMenu.ALTA_CLIENTE: {
				gestorBBDD.conectar();
				cliente = Formularios.pedirDatosCliente(scan);
				if (gestorBBDD.insertarCliente(cliente)) 
					System.out.println("Cliente introducido con exito");
				else 
					System.out.println("ERROR!!! Cliente no introducido");
				gestorBBDD.cerrar();
				break;
			}
			
			case VisorMenu.MODIFICAR_CLIENTE: {
				gestorBBDD.conectar();
				String dni = Formularios.pedirDniCliente(scan);
				if (gestorBBDD.eliminarCliente(dni)) 
					System.out.println("Cliente eliminado con exito");
				else 
					System.out.println("ERROR!!! Cliente no eliminado");
				gestorBBDD.cerrar();
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
