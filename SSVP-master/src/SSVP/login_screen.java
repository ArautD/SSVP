/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SSVP;

import java.sql.*;

/**
 *
 * @author ARAUTO
 */
public class login_screen {

    public static Connection conector() {
        java.sql.Connection conexao = null;
        //chama o driver
        String driver = "SSVP.Login";
        // Armazenando info do banco
        String url = "jdbc:mysql: //localhost:3306/projetobd";
        String user = "root";
        String password = "";
        //Estabelecendo conexão com o bD
        try {
           Class.forName(driver);
           conexao = DriverManager.getConnection(url, user, password);
           return conexao;
        } catch (Exception e) {
            //Este comando exibi o erro encontrado
            System.out.println(e);
            return null;
        }
    }
}
