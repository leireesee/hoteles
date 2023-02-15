package hotelesBBDD;

public class VisorMenu {
	
	protected static final int GESTIONAR_CLIENTES = 1;
	protected static final int GESTIONAR_RESERVAS = 2;
	protected static final int GESTIONAR_HOTELES = 3;
	protected static final int GESTIONAR_HABITACIONES = 4;
	protected static final int SALIR = 0;
	
	protected static final int ALTA_CLIENTE = 1;
	protected static final int MODIFICAR_CLIENTE = 2;
	protected static final int ELIMINAR_CLIENTE = 3;
	protected static final int VER_CLIENTES = 4;
	
	protected static final int HACER_RESERVA = 1;
	protected static final int ELIMINAR_RESERVA= 2;
	protected static final int VER_RESERVAS = 3;
	protected static final int VER_RESERVAS_FECHAS_CONCRETAS = 4;
	protected static final int VER_RESERVAS_CLIENTES_ESPECIFICOS = 5;
	
	protected static final int ANADIR_HOTEL = 1;
	protected static final int ELIMINAR_HOTEL = 2;
	protected static final int MODIFICAR_HOTEL = 3;
	protected static final int VER_HOTELES = 4;
	
	protected static final int ANADIR_HABITACION = 1;
	protected static final int ELIMINAR_HABITACION = 2;
	protected static final int MODIFICAR_HABITACIONES = 3;
	protected static final int VER_HABITACIONES = 4;
	

	public static void visualizarMenuPrincipal() {
		System.out.println("SELECCIONA UNA OPCIÓN");
		System.out.println(GESTIONAR_CLIENTES + ". Gestionar clientes");
		System.out.println(GESTIONAR_RESERVAS + ". Gestionar reservas");
		System.out.println(GESTIONAR_HOTELES + ". Gestionar hoteles");
		System.out.println(GESTIONAR_HABITACIONES + ". Gestionar habitaciones");
		System.out.println(SALIR + ". Salir");
		
	}
	
	
	public static void visualizarMenuCliente() {
		System.out.println("SELECCIONA UNA OPCIÓN");
		System.out.println(ALTA_CLIENTE + ". Dar de alta un cliente");
		System.out.println(MODIFICAR_CLIENTE + ". Modificar un cliente");
		System.out.println(ELIMINAR_CLIENTE + ". Eliminar cliente");
		System.out.println(VER_CLIENTES + ". Ver clientes");
		System.out.println(SALIR + ". Salir");
		
	}
	
	
	public static void visualizarMenuReservas() {
		System.out.println("SELECCIONA UNA OPCIÓN");
		System.out.println(HACER_RESERVA + ". Hacer una reserva");
		System.out.println(ELIMINAR_RESERVA + ". Eliminar una reserva");
		System.out.println(VER_RESERVAS + ". Ver reservas");
		System.out.println(VER_RESERVAS_FECHAS_CONCRETAS + ". Ver reservas en fechas concretas");
		System.out.println(VER_RESERVAS_CLIENTES_ESPECIFICOS + ". Ver reservas de cliente");
		System.out.println(SALIR + ". Salir");
		
	}
	
	
	public static void visualizarMenuHoteles() {
		System.out.println("SELECCIONA UNA OPCIÓN");
		System.out.println(ANADIR_HOTEL + ". Agregar hotel");
		System.out.println(ELIMINAR_HOTEL + ". Eliminar hotel");
		System.out.println(MODIFICAR_HOTEL + ". Modificar hotel");
		System.out.println(VER_HOTELES + ". Ver hoteles");
		System.out.println(SALIR + ". Salir");
		
	}
	
	
	public static void visualizarMenuHabitaciones() {
		System.out.println("SELECCIONA UNA OPCIÓN");
		System.out.println(ANADIR_HABITACION + ". Agregar habitacion");
		System.out.println(ELIMINAR_HABITACION + ". Eliminar habitacion");
		System.out.println(MODIFICAR_HABITACIONES + ". Modificar habitacion");
		System.out.println(VER_HABITACIONES + ". Ver habitaciones");
		System.out.println(SALIR + ". Salir");
		
	}
}
