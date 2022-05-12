

package Main;

import CONTROLADOR.Controlador_Frm_Registrar;
import VISTA.frmRegistroDeTratamientos1;


public class Principal {

    public static frmRegistroDeTratamientos1 frm_rt;
    public static CONTROLADOR.Controlador_Frm_Registrar c_frm_rt;
    public static void main(String[] args) {
        
        frm_rt=new frmRegistroDeTratamientos1();
        frm_rt.setVisible(true);
        frm_rt.setLocationRelativeTo(null);
        
        c_frm_rt=new Controlador_Frm_Registrar(frm_rt);
    
    }
    
}
