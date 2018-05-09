package mx.com.cetech.clase4.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import mx.com.cetech.clase4.bean.AlumnoBdBean;
import mx.com.cetech.clase4.util.BaseDatos;


public class UsuarioDAO {
	
	AlumnoBdBean alumnoBean = new AlumnoBdBean();
	
	public String validaUsuario(String usr, String pass) throws SQLException {
		BaseDatos bd = new BaseDatos();
		String query            ="select * from estudiantes where idestudiante = ? and contrasenia = ?";
		String resultMsj        = "No se encontro ningun resultado con esa condicion";
		PreparedStatement ps    = null;
		ResultSet rs            = null;
		Connection dbConnection = null;
		
		
		

		dbConnection = bd.getDBConnection();
		try {
			ps = dbConnection.prepareStatement(query);
			//preparar el query
			ps.setString(1, usr);
			System.out.println("este es el usuario en DAO, porqu� arrojaba null�? no lo s�: " + usr);
			ps.setString(2, pass);
			System.out.println("este es la contrase�a  en DAO, porqu� arrojaba null�? no lo s�: : " + pass);
			System.out.println("Aqu� empieza la consulta ....");					

			//ejecutar sentencia
						
			System.out.println("Prueba de recibir Variable en el DAO 1: " + alumnoBean.getIdUsuario());
			
			rs = ps.executeQuery();
			
			//validar si llego algo de la consulta
			if(rs.next()){
				System.out.println(resultMsj="Bienvenido");
				System.out.println("UsuarioDAO if de try (conexi�n de BD)"+ usr );
				int usuario = Integer.parseInt(usr);
				System.out.println("haciendo una prueba de que funcione el paseint integer " + usuario);
				usuario = alumnoBean.getIdUsuario();
				System.out.println("Contrase�a if de try (conexi�n de BD)"+ pass );
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//resultMsj="Error al ejecutar la sentencia";
			e.printStackTrace();
			System.out.println("Trono la conexi�n de la BD, suerte para la proxima... ");
		}//puede tronar pq la setencia puede estar mal
		
		//algo que se debe hacer siempre con una conexion a BD
		finally{
			//cerrar la conexion, sentencia
			if(ps!=null){
				ps.close();
			}
			if(dbConnection !=null){
				dbConnection.close();
			}
		}
		return resultMsj;
		
		
	}
	
	
}
