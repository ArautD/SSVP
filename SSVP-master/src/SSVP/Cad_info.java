/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SSVP;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.sql.*;
import java.sql.Connection; 
// conexão SQL para Java 
import java.sql.DriverManager; 
// driver de conexão SQL para Java 

/**
 *
 * @author ARAUTO
 */
public class Cad_info {
    
    public static Connection conect() {
        java.sql.Connection conexao2 = null;
        //chama o driver
        String driver = "SSVP.Main";
        // Armazenando info do banco
        String url = "jdbc:mysql: //localhost:3306/projetobd";
        String user = "root";
        String password = "";
        
        //Estabelecendo conexão com o bD
        try {
           Class.forName(driver);
           conexao2 = DriverManager.getConnection(url, user, password);
           return conexao2;
        } catch (Exception e) {
            //Este comando exibi o erro encontrado
            System.out.println(e);
            return null;
        }
    }
    //Método para salvar informações no arquivo .txt
    protected String num_pedido, vendedor, quant, preco_total, tam_pizza,
            recheio_pizza, data_pedido, delivery;

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public String getData_pedido() {
        return data_pedido;
    }

    public void setData_pedido(String data_pedido) {
        this.data_pedido = data_pedido;
    }
    
    public String getNum_pedido(){
        return num_pedido;
    }
    public void setNum_pedido(String num_pedido){
        this.num_pedido = num_pedido;
    }
    public String getVendedor(){
        return vendedor;
    }
    public void setVendedor(String vendedor){
        this.vendedor = vendedor;
    }
    public String getQuant(){
        return quant;
    }
    public void setQuant(String quant){
        this.quant = quant;
    }
    public String getPreco_total(){
        return preco_total;
    }
    public void setPreco_total(String preco_total){
        this.preco_total = preco_total;
    }
    public String getTam_pizza(){
        return tam_pizza;
    }
    public void setTam_pizza(String tam_pizza){
        this.tam_pizza = tam_pizza;
    }
    public String getRecheio_pizza(){
        return recheio_pizza;
    }
    public void setRecheio_pizza(String recheio_pizza){
        this.recheio_pizza = recheio_pizza;
    }
    
    
    public String Salvar(){
        try {
                FileWriter fw = new FileWriter("C:\\Users\\ARAUTO\\Documents\\NetBeansProjects\\Sistema_Pizzaria\\src\\SSVP\\Cad_info.txt", true);
                PrintWriter pw = new PrintWriter(fw);
                
                pw.println("=============================================================================");
                pw.println("Numero do Pedido: " + this.num_pedido + "       ||   Quantidade: " + this.quant);
                pw.println("Vendido por: " + this.vendedor  + "           ||   Horario: " + this.data_pedido);              
                pw.println("Tamanho da pizza: " + this.tam_pizza);
                pw.println("Recheio de pizza: " + this.recheio_pizza + "        ||" + this.delivery);
                pw.println("");
                pw.println("=============================================================================");
                pw.println("Total: " + this.preco_total);
                pw.println("=============================================================================");
                pw.flush();
                pw.close();
                fw.close();
               
        }catch (IOException ex){
            ex.printStackTrace();
        }
        return "Informações adicionadas! ";
    }
    
}
