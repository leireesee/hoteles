package hotelesBBDD;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GestorBBDD extends Conector{
	
	public boolean insertarCliente(Cliente cliente) {
		String insertarCliente = "INSERT INTO clientes VALUES (?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement pst = super.conexion.prepareStatement(insertarCliente);
			pst.setString(1, cliente.getDni());
			pst.setString(2, cliente.getNombre());
			pst.setString(3, cliente.getApellidos());
			pst.setString(4, cliente.getDireccion());
			pst.setString(5, cliente.getLocalidad());
			
			return pst.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
		
	}
	
	public boolean eliminarCliente(String dni) {
		String eliminarCliente = "DELETE FROM clientes WHERE dni = ?";
		
		try {
			PreparedStatement pst = super.conexion.prepareStatement(eliminarCliente);
			pst.setString(1, dni);
			
			return pst.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
		
	}

	public boolean modificarCliente(Cliente cliente) {
		
		String modificarCliente = "UPDATE clientes SET dni = ?, nombre = ?, apellidos = ?, direccion = ?, localidad = ? WHERE dni = ?";
		
		try {
			PreparedStatement pst = super.conexion.prepareStatement(modificarCliente);
			pst.setString(1, cliente.getDni());
			pst.setString(2, cliente.getNombre());
			pst.setString(3, cliente.getApellidos());
			pst.setString(4, cliente.getDireccion());
			pst.setString(5, cliente.getLocalidad());
			pst.setString(6, cliente.getDni());
			
			return pst.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
		
	}
	
	public Cliente getCliente(int id) {
		Cliente cliente = null;
		
		String st = "SELECT FROM clientes WHERE id=?";
		
		try {
			PreparedStatement pst = super.conexion.prepareStatement(st);
			pst.setInt(1, id);
			
			ResultSet rs = pst.executeQuery();
			rs.next();
			
			cliente = new Cliente();
			cliente.setDni(rs.getString("dni"));
			cliente.setNombre(rs.getString("nombre"));
			cliente.setApellidos(rs.getString("apellidos"));
			cliente.setDireccion(rs.getString("direccion"));
			cliente.setLocalidad(rs.getString("localidad"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cliente;
	}
	
	public ArrayList<Cliente> verClientes(){
		
		ArrayList<Cliente> clientes = null;
		
		String verClientes = "SELECT * FROM clientes";
		
		try {
			PreparedStatement pst = super.conexion.prepareStatement(verClientes);
			ResultSet rst = pst.executeQuery();
			
			clientes = new ArrayList<>();
			
			while (rst.next()) {
				
				Cliente cliente = new Cliente();
				
				cliente.setDni(rst.getString("dni"));
				cliente.setNombre(rst.getString("nombre"));
				cliente.setApellidos(rst.getString("apellidos"));
				cliente.setDireccion(rst.getString("direccion"));
				cliente.setLocalidad(rst.getString("localidad"));				
				
				clientes.add(cliente);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return clientes;
	}
	
	
	public boolean insertarHotel(Hotel hotel) {
		String insertarHotel = "INSERT INTO hoteles VALUES (?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement pst = super.conexion.prepareStatement(insertarHotel);
			pst.setString(1, hotel.getCif());
			pst.setString(2, hotel.getNombre());
			pst.setString(3, hotel.getGerente());
			pst.setInt(4, hotel.getEstrellas());
			pst.setString(5, hotel.getCompania());
			
			return pst.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
		
	}
	
	
	public boolean eliminarHotel(int id) {
		String eliminarHotel = "DELETE FROM hoteles WHERE id = ?";
		
		try {
			PreparedStatement pst = super.conexion.prepareStatement(eliminarHotel);
			pst.setInt(1, id);
			
			return pst.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
		
	}
	
	
	public boolean modificarHotel(Hotel hotel) {
		
		String modificarHotel = "UPDATE hoteles SET cif = ?, nombre = ?, gerente = ?, estrellas = ?, compania = ? WHERE id = ?";
		
		try {
			PreparedStatement pst = super.conexion.prepareStatement(modificarHotel);
			pst.setString(1, hotel.getCif());
			pst.setString(2, hotel.getNombre());
			pst.setString(3, hotel.getGerente());
			pst.setInt(4, hotel.getEstrellas());
			pst.setString(5, hotel.getCompania());
			pst.setInt(6, hotel.getId());
			
			return pst.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
		
	}
	
	
	public ArrayList<Hotel> verHoteles(){
		
		ArrayList<Hotel> hoteles = null;
		
		String verHoteles = "SELECT * FROM hoteles";
		
		try {
			PreparedStatement pst = super.conexion.prepareStatement(verHoteles);
			ResultSet rst = pst.executeQuery();
			
			hoteles = new ArrayList<>();
			
			while (rst.next()) {
				
				Hotel hotel = new Hotel();
				
				hotel.setId(rst.getInt("id"));
				hotel.setNombre(rst.getString("nombre"));
				hotel.setGerente(rst.getString("gerente"));
				hotel.setEstrellas(rst.getInt("estrellas"));
				hotel.setCompania(rst.getString("compania"));				
				
				hoteles.add(hotel);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return hoteles;
	}
	
	/*HABITACIONES*/
	public boolean insertarHabitacion(Habitacion habitacion) {
		
		String st = "INSERT INTO habitaciones VALUES (?,?,?,?,?)";
		
		try {
			PreparedStatement pst = super.conexion.prepareStatement(st);
			
			pst.setInt(1, habitacion.getId());
			pst.setInt(2, habitacion.getId_hotel());
			pst.setString(3, habitacion.getNumero());
			pst.setString(4, habitacion.getDescripcion());
			pst.setDouble(5, habitacion.getPrecio());
			
			return pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	public boolean eliminarHabitacion(int id) {
		
		String st = "DELETE FROM habitaciones WHERE id = ?";
		
		try {
			PreparedStatement pst = super.conexion.prepareStatement(st);
			
			pst.setInt(1, id);
			
			return pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	public boolean modificarHabitacion(Habitacion habitacion) {
		
		String st = "UPDATE habitaciones SET id_hotel=?, numero=?, descripcion=?, precio=? WHERE id=?";
		
		try {
			PreparedStatement pst = super.conexion.prepareStatement(st);
			
			
			pst.setInt(1, habitacion.getId_hotel());
			pst.setString(2, habitacion.getNumero());
			pst.setString(3, habitacion.getDescripcion());
			pst.setDouble(4, habitacion.getPrecio());
			pst.setInt(5, habitacion.getId());
			
			return pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	public ArrayList<Habitacion> verHabitaciones() {
		ArrayList<Habitacion> habitaciones = null;
		
		String st = "SELECT * FROM habitaciones";
		
		try {
			PreparedStatement pst = super.conexion.prepareStatement(st);
			ResultSet rs = pst.executeQuery();
			
			habitaciones = new ArrayList<>();
			
			while(rs.next()) {
				Habitacion habitacion = new Habitacion();
				
				habitacion.setId(rs.getInt("id"));
				habitacion.setId_hotel(rs.getInt("id_hotel"));
				habitacion.setNumero(rs.getString("numero"));
				habitacion.setDescripcion(rs.getString("descripcion"));
				habitacion.setPrecio(rs.getDouble("precio"));
				
				habitaciones.add(habitacion);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return habitaciones;
	}
	
	/*RESERVAS*/
	
	public boolean insertarReserva(Reserva reserva) {
		
		String st = "INSERT INTO reservas (id_habitacion, dni, desde, hasta) VALUES (?,?,?,?)";
		
		try {
			PreparedStatement pst = super.conexion.prepareStatement(st);
			
			pst.setInt(1, reserva.getId_habitacion());
			pst.setString(2, reserva.getDni());
			pst.setDate(3, new Date(reserva.getDesde().getTime()));
			pst.setDate(4, new Date(reserva.getDesde().getTime()));
			
			return pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	public boolean eliminarReserva(int id) {
		
		String st = "DELETE FROM reservas WHERE id=?";
		
		try {
			PreparedStatement pst = super.conexion.prepareStatement(st);
			
			pst.setInt(1, id);
			
			return pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	public boolean modificarReserva(Reserva reserva) {
		
		String st = "UPDATE reservas SET id_habitacion=?, dni=?, desde=?, hasta=? WHERE id=?";
		
		try {
			PreparedStatement pst = super.conexion.prepareStatement(st);
			
			pst.setInt(1, reserva.getId_habitacion());
			pst.setString(2, reserva.getDni());
			pst.setDate(3, new Date(reserva.getDesde().getTime()));
			pst.setDate(4, new Date(reserva.getHasta().getTime()));
			pst.setInt(5, reserva.getId());
			
			return pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	public ArrayList<Reserva> verReservas() {
		ArrayList<Reserva> reservas = null;
		
		String st = "SELECT * FROM reservas";
		
		try {
			PreparedStatement pst = super.conexion.prepareStatement(st);
			ResultSet rs = pst.executeQuery();
			
			reservas = new ArrayList<>();
			
			while(rs.next()) {
				Reserva reserva = new Reserva();
				
				reserva.setId(rs.getInt("id"));
				reserva.setId_habitacion(rs.getInt("id_habitacion"));
				reserva.setDni(rs.getString("dni"));
				reserva.setDesde(rs.getDate("desde"));
				reserva.setHasta(rs.getDate("hasta"));
				
				reservas.add(reserva);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return reservas;
	}
	
}
