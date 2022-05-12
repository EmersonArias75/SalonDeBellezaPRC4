package MODELO;

import CONEXION.ConexionSQL;
import com.mysql.cj.xdevapi.Statement;
import com.sun.jdi.connect.spi.Connection;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListarTratamientos {

    ConexionSQL con = new ConexionSQL();
    Connection cn = con.connectar();

    public void MostrarTable(JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Tratamiento");
        modelo.addColumn("Disponibilidad");
        modelo.addColumn("Precio");
        modelo.addColumn("Total");
        String querysql = "SELECT*FROM tratamiento";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(querysql);
            while (rs.next()) {
                Object[] lista = {rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4), rs.getDouble(5)};
                modelo.addRow(lista);
            }
              tabla.setModel(modelo);
        } catch Exception e) {
            System.out.println("Error al mostrar informacion"+e);
        }

    }

}
