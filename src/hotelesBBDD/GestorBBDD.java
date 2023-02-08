package hotelesBBDD;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GestorBBDD extends Conector{
	
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
}
