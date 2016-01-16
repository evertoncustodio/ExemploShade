package br.eti.evertoncustodio.shade;

import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal extends JFrame {

	public static void main(String[] args) {
		Principal tela = new Principal();
		tela.setVisible(true);
		tela.setLocationRelativeTo(null);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private JButton btnConectar;
	
	public Principal() {
		this.setSize(100, 100);
		iniciarComponentes();
	}

	private void iniciarComponentes() {
		btnConectar = new JButton("Conectar");
		this.add(btnConectar);
		btnConectar.addActionListener(e -> testarConexao());
	}
	
	private void testarConexao() {
		Conexao conexao = new Conexao();
		
		try(Connection con = conexao.getConnection()) {
			JOptionPane.showMessageDialog(null, "Conexão estabelecida!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
