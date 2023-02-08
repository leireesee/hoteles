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
	
}
