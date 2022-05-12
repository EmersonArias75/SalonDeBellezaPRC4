

package CONEXION;

import com.sun.jdi.connect.spi.Connection;


public class ConexionSQL {
    Connection cn;
    
    public Connection connectar(){
       try{
       Class.forName("com.sun.jdi.connect.spi.Driver");
       cn=(Connection) DriverManager.getConnection("jdi:mysql://localhost/salondebellezaPRC4","root","");
       System.out.println("Conexion Exitosa");
       
       } catch (Exception e){
           System.out.println("Conexion Fallida"+e);
       }
       return cn;
    }
}
