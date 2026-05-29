package com.example.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UpdateVehiculo {
	
	private static final Logger log = LogManager.getLogger(UpdateVehiculo.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = Conexion.getConnection();
			String sql = """
					UPDATE vehiculos SET  anio= ?, precio= ?, color= ?,
					disponible= ? WHERE placa = ?
					""";
			ps = con.prepareStatement(sql);
			ps.setInt(1, 2025);
			ps.setDouble(2, 21000);
			ps.setString(3,"rojo");
			ps.setBoolean(4, true);
			ps.setString(5, "GTR2014");
			
			int fila = ps.executeUpdate();
			
			log.info("Filas actualizadas: " + fila);
		}catch(Exception e){
			log.error("Error al actualizar " + e.getMessage());
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
