

package MODELO;


public class Tratamiento {
    
    private String Tratamiento;
    private int Disponibilidad;
    private Double Precio;
    private Double total;

    public Tratamiento(String Tratamiento, int Disponibilidad, Double Precio) {
        this.Tratamiento = Tratamiento;
        this.Disponibilidad = Disponibilidad;
        this.Precio = Precio;
    }

    public String getTratamiento() {
        return Tratamiento;
    }

    public void setTratamiento(String Tratamiento) {
        this.Tratamiento = Tratamiento;
    }

    public int getDisponibilidad() {
        return Disponibilidad;
    }

    public void setDisponibilidad(int Disponibilidad) {
        this.Disponibilidad = Disponibilidad;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double Precio) {
        this.Precio = Precio;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
    
    public Double Total(){
        Double Total=Disponibilidad*Precio;
        return Total;
    }
    
}
