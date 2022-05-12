

package CONTROLADOR;
import VISTA.frmRegistroDeTratamientos1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador_Frm_Registrar implements ActionListener{
    frmRegistroDeTratamientos1 frm_rt;

    public Controlador_Frm_Registrar(frmRegistroDeTratamientos1 frm_rt) {
        this.frm_rt = frm_rt;
        this.frm_rt.btnGuardar.addActionListener(this);
    }

    public Controlador_Frm_Registrar() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==frm_rt){

         String nombre=frm_rt.txtnombre.getText();
         int cantidad=Integer.parseNt(frm_rt.txtcantidad.getText());
         Double precio=double.parseDouble(frm_txtprecio.getText());

        Producto p=new producto(nombre, cantidad, precio);
        Registro R=new Registro();
        R.registrarbd(P);
        ListarTratamiento lp=new ListarTratamiento();
        lp.MostrarTable(frm rt.TablaTratamiento);
        limpiar();
    }
    
}

    private void limpiar() {
        frm_rt.txtTratamiento.setText("");
        frm_rt.txtDisponibilidad.setText("");
        frm_rt.txtPrecio.setText("");
    }
    
}