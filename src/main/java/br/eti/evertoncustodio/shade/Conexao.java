package br.eti.evertoncustodio.shade;

import java.sql.Connection;
import java.sql.DriverManager;

class Conexao {

	public Connection getConnection() {
		String url = "jdbc:jtds:sqlserver://localhost/TSQL2012" ;
		
		try {
			Connection con = DriverManager.getConnection(url, "sa", "root");
			return con;
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
}
