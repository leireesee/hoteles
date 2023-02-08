package hotelesBBDD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
}
