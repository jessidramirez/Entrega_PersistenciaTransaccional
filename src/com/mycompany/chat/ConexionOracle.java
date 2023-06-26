package com.mycompany.chat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionOracle {

    private final String CONTROLADOR = "oracle.jdbc.OracleDriver";
    private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private final String USUARIO = "poli001";
    private final String CLAVE = "12345";

    public Connection cadena;

    public ConexionOracle() {
         this.cadena = null;
    }

    public Connection conectar() {
        try {
            Class.forName(CONTROLADOR);
            this.cadena = DriverManager.getConnection(URL, USUARIO, CLAVE);

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0);
        }
        return this.cadena;
    }

    public void desconectar() {
        try {
            this.cadena.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

}