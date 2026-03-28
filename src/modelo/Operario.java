package modelo;

public class Operario {
    private int id;
    private String nombre;
    private String turno;

    public Operario(int id, String nombre, String turno) {
        this.id = id;
        this.nombre = nombre;
        this.turno = turno;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getTurno() { return turno; }
}
