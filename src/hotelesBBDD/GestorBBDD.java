package hotelesBBDD;

import java.sql.PreparedStatement;
import java.sql.SQLException;

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
	
}
