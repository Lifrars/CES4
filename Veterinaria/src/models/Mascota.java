package models;

class Mascota {
    private long id;
    private String nombre;
    private String especie;
    private int edad;
    private String historialMedico;
    private long duenoId;

    public Mascota() {}

    public long getDuenoId() {
        return duenoId;
    }

    public void setDuenoId(long duenoId) {
        this.duenoId = duenoId;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getHistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(String historialMedico) {
        this.historialMedico = historialMedico;
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

    public Mascota(long id, String nombre, String especie, int edad, String historialMedico, long duenoId) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.historialMedico = historialMedico;
        this.duenoId = duenoId;
    }

}