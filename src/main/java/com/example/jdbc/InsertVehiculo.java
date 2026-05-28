package com.example.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class InsertVehiculo {

	private static final Logger log = LogManager.getLogger(InsertVehiculo.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement ps;
		
		String sql = """
				INSERT INTO vehiculos(placa,marca,modelo,anio,precio,color,disponible)
				VALUES(?,?,?,?,?,?,?)
				""";
		try {
			con = Conexion.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1,"GTR2014");
			ps.setString(2, "cherry");
			ps.setString(3, "tigo 2 pro");
			ps.setInt(4, 2024);
			ps.setDouble(5, 16000);
			ps.setString(6, "plateado");
			ps.setBoolean(7, true);
			
			int filas = ps.executeUpdate();
			log.info("Fila insertada " +  filas);
			
		}catch(Exception e) {
			log.error("Error en la conexion" + e.getMessage());
			
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
