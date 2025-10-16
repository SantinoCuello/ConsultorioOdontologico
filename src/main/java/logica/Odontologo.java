package logica;

import java.util.Date;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;


@Entity
public class Odontologo extends Persona{
    

    private String especialidad;
    @OneToMany (mappedBy="odonto")
    private List<Turno> listaTurnos; // 1 a n
    @OneToOne
    private Horario unHorario;    // 1 a 1
    @OneToOne
    private Usuario unUsuario; // 1 a 1

    public Odontologo() {
    }

    public Odontologo(String especialidad, List<Turno> listaTurnos, Horario unHorario, Usuario unUsuario, String dni, String nombre, String apellido, String telefono, String direccion, Date fecha_nac) {
        super(dni, nombre, apellido, telefono, direccion, fecha_nac);
        this.especialidad = especialidad;
        this.listaTurnos = listaTurnos;
        this.unHorario = unHorario;
        this.unUsuario = unUsuario;
    }


    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }

    public Horario getUnHorario() {
        return unHorario;
    }

    public void setUnHorario(Horario unHorario) {
        this.unHorario = unHorario;
    }

    public Usuario getUnUsuario() {
        return unUsuario;
    }

    public void setUnUsuario(Usuario unUsuario) {
        this.unUsuario = unUsuario;
    }
    
    
}
