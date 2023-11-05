package model;

import java.time.LocalDate;

public class PlanillaTrabajo {
    private String codigo;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private char estado;
    private Tecnico suTecnico;

    private PlanillaTrabajo next;

    public PlanillaTrabajo(String codigo, LocalDate fechaInicio, LocalDate fechaFin, char estado, Tecnico suTecnico) {
        this.codigo = codigo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
        this.suTecnico = suTecnico;
        next = null;
    }

    public String getCodigo() {
        return codigo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public char getEstado() {
        return estado;
    }

    public Tecnico getSuTecnico() {
        return suTecnico;
    }

    public void setNext(PlanillaTrabajo next) {
        this.next = next;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public void setSuTecnico(Tecnico suTecnico) {
        this.suTecnico = suTecnico;
    }

    public PlanillaTrabajo getNext() {
        return next;
    }

    public String toString() {
        return "*****Planilla de Trabajo***** \n" +
                "Código: " +  codigo + "\n" +
                "Fecha inicio: " + fechaInicio + "\n" +
                "Fecha fin: " + fechaFin + "\n" +
                "Estado: " + estado + "\n" +
                "Técnico: " + suTecnico;
    }
}
