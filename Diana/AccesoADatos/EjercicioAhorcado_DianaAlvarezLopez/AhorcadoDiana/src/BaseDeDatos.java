import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDeDatos {
	
	private String palabra = "";
	private int partidasGanadas=0, partidasPerdidas=0;
	
	public void ahorcado(String fuente) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  //Cargar el driver
			
			String bd = "jdbc:mysql://localhost:3306/palabritas";  
			String usuario = "root", contraseña = "1234";
			Connection conexion = DriverManager.getConnection(bd, usuario, contraseña); //conexion a la bd
			
			Statement sentencia = conexion.createStatement(); //Preparamos la consulta
			
			String sql = "SELECT * FROM palabras";
			
			ResultSet resultado = sentencia.executeQuery(sql); //obtenemos las palabras
			
			//Recorremos el resultado para visuallizar cada fila
			//Se hace un bucle mientras haya registros
			while(resultado.next()) {
				
				for(int i=0; i<=1;i++){
					palabra = resultado.getString(0);
		        }
				
				Juego juego = new Juego();
				juego.juego(fuente, palabra, partidasGanadas, partidasPerdidas);
			}
			
			resultado.close();
			sentencia.close();
			conexion.close();
;			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			//e.printStackTrace();
			System.out.println("Error de zona horaria. No he conseguido solucionar esto.");
		}
	}
}
