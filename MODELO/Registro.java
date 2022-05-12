/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package MODELO;

/**
 *
 * @author Oqueli
 */
import ConexionSQL;
import java.sql.conection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Registro {
    ConexionSQL con=new ConexionSQL();
    Conection cn=con.conectar();

public void registarbd(Producto p){
    try {
       PreparedStatement ps=cn.prepareStatement
      ("INSERT INTO producto(nombre,cantidad,precio,total)(?,?,?,?)");
       ps.setString(1, p.getNombre());
       ps.setInt(2, p.getCantidad());
       ps.setDouble(3, p.getPrecio());
       ps.setDouble(4, p.Total());
       ps.executeUpdate();

    } catch (Exception e) {
    JOptionPane.showMessageDialog(null, "Error al registrar datos"+e);
    }
}


}
