package models;

class Empleado {
    private long id;
    private String nombre;
    private String rol;
    private String horario;

    public Empleado() {}

    public Empleado(long id, String nombre, String rol, String horario) {
        this.id = id;
        this.nombre = nombre;
        this.rol = rol;
        this.horario = horario;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}