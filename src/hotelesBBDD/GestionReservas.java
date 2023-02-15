package hotelesBBDD;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
				gestorBBDD.conectar();
				int id = Formularios.pedirIdReserva(scan);
				if(gestorBBDD.eliminarReserva(id))
					System.out.println("Reserva eliminado con exito");
				else
					System.out.println("ERROR!!! Reserva no eliminado");
				gestorBBDD.cerrar();
				break;
			}
			
			case VisorMenu.VER_RESERVAS: {
				gestorBBDD.conectar();
				Visor.mostrarReservas(gestorBBDD.verReservas());
				gestorBBDD.cerrar();
				break;
			}
			
			case VisorMenu.VER_RESERVAS_FECHAS_CONCRETAS: {
				gestorBBDD.conectar();
				
				Date desde = null;
				Date hasta = null;
				
				System.out.print("Desde (dd/MM/yyyy): ");
				try {
					desde = new SimpleDateFormat("dd/MM/yyyy").parse(scan.nextLine());
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.print("Hasta (dd/MM/yyyy): ");
				try {
					hasta = new SimpleDateFormat("dd/MM/yyyy").parse(scan.nextLine());
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Visor.mostrarReservasEntreFechas(gestorBBDD.verReservas(), desde, hasta);
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
