package logica;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

@Entity
public class Secretario extends Persona{
    
    private String sector;
    @OneToOne
    private Usuario unUsuario; // 1 a 1

    public Secretario() {
    }

    public Secretario(String sector, Usuario unUsuario, String dni, String nombre, String apellido, String telefono, String direccion, Date fecha_nac) {
        super(dni, nombre, apellido, telefono, direccion, fecha_nac);
        this.sector = sector;
        this.unUsuario = unUsuario;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Usuario getUnUsuario() {
        return unUsuario;
    }

    public void setUnUsuario(Usuario unUsuario) {
        this.unUsuario = unUsuario;
    }
    
    
    
}
