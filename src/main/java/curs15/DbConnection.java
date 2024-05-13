package curs15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	
	//vom face crearea unei conexiuni la o baza de date!!!!
	
	//o metoda pentru deschiderea unei conexiuni si apoi o metoda pt inchiderea ei
	
	
//prima metoda care intoarce o conexiune; ea este refolosibila pe orice baza de date SQL
	//pe host putem pune si portul direct host:port apoi user si parola
	
	public static Connection openDBConnection (String host, String user, String pass) {
		
		//avem un biect de tip Connection
		Connection conn=null;
		
		try {
			
		conn = DriverManager.getConnection(host, user, pass);
		System.out.println("Conexiune cu succes!");
			
		}catch(SQLException e) {
			System.out.println("Nu am putut face conexiunea");
			e.printStackTrace();
			
		}
		
		return conn;
	}
	
	//urmatoarea metoda inchide conexiunea
	
	//facem o tot clasa statica, nu intoarce nimic
	//important e sa avem un singur obiect si o singura conexiune pentru a nu avea consum de resurse si mai usor de gestionat
	
	public static void closeDbConnection (Connection conn) {
		
		try {
			
			System.out.println("Incerc sa inchid conexiunea.");
			conn.close();
			System.out.println("Conexiunea a fost inchisa!");
			
		} catch (SQLException e) {
			System.out.println("Nu am putut inchide conexiounea");
			e.printStackTrace();
		}
		
	}
	

}
