package logica;

public class Horario {
    
    private int id_horario;
    private String horario_inicio;
    private String horario_final;

    public Horario() {
    }

    public Horario(int id_horario, String horario_inicio, String horario_final) {
        this.id_horario = id_horario;
        this.horario_inicio = horario_inicio;
        this.horario_final = horario_final;
    }

    public int getId_horario() {
        return id_horario;
    }

    public void setId_horario(int id_horario) {
        this.id_horario = id_horario;
    }

    public String getHorario_inicio() {
        return horario_inicio;
    }

    public void setHorario_inicio(String horario_inicio) {
        this.horario_inicio = horario_inicio;
    }

    public String getHorario_final() {
        return horario_final;
    }

    public void setHorario_final(String horario_final) {
        this.horario_final = horario_final;
    }
    
    
}
