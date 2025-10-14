package logica;

import java.util.Date;
import java.util.List;


public class Odontologo extends Persona{
    
    private int id_odontologo;
    private String especialidad;
    private List<Turno> listaTurnos; // 1 a n
    private Horario unHorario;    // 1 a 1
    private Usuario unUsuario; // 1 a 1

    public Odontologo() {
    }

    public Odontologo(int id_odontologo, String especialidad, List<Turno> listaTurnos, Horario unHorario, Usuario unUsuario, String dni, String nombre, String apellido, String telefono, String direccion, Date fecha_nac) {
        super(dni, nombre, apellido, telefono, direccion, fecha_nac);
        this.id_odontologo = id_odontologo;
        this.especialidad = especialidad;
        this.listaTurnos = listaTurnos;
        this.unHorario = unHorario;
        this.unUsuario = unUsuario;
    }

    public int getId_odontologo() {
        return id_odontologo;
    }

    public void setId_odontologo(int id_odontologo) {
        this.id_odontologo = id_odontologo;
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
