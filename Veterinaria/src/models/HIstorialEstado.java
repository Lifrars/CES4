package models;

import java.util.Date;

class HistorialEstado {
    private long id;
    private Mascota mascota;
    private Estado estadoAnterior;
    private Estado nuevoEstado;
    private Date fechaHora;
    private Empleado empleado;

    public HistorialEstado(long id, Mascota mascota, Estado estadoAnterior, Estado nuevoEstado, Date fechaHora, Empleado empleado) {
        this.id = id;
        this.mascota = mascota;
        this.estadoAnterior = estadoAnterior;
        this.nuevoEstado = nuevoEstado;
        this.fechaHora = fechaHora;
        this.empleado = empleado;
    }

    public HistorialEstado() {
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Estado getEstadoAnterior() {
        return estadoAnterior;
    }

    public void setEstadoAnterior(Estado estadoAnterior) {
        this.estadoAnterior = estadoAnterior;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Estado getNuevoEstado() {
        return nuevoEstado;
    }

    public void setNuevoEstado(Estado nuevoEstado) {
        this.nuevoEstado = nuevoEstado;
    }
}

