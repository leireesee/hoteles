package hotelesBBDD;

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
}
