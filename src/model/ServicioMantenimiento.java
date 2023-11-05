package model;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ServicioMantenimiento {

    protected int numero;

    //Debes usar local data time porque local date solo tiene la fecha
    protected LocalDateTime fechaHoraInicio;
    protected LocalDateTime fechaHoraTerminacion;
    protected String descripcionDiagnosticoInicial;
    protected boolean cerrado;
    protected int tarifaBaseHora;

    public ServicioMantenimiento(int numero, LocalDateTime fechaHoraInicio, LocalDateTime fechaHoraTerminacion, String descripcionDiagnosticoInicial, boolean cerrado, int tarifaBaseHora) {
        this.numero = numero;
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraTerminacion = fechaHoraTerminacion;
        this.descripcionDiagnosticoInicial = descripcionDiagnosticoInicial;
        this.cerrado = cerrado;
        this.tarifaBaseHora = tarifaBaseHora;
    }

    public int getNumero() {
        return numero;
    }

    public LocalDateTime getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public LocalDateTime getFechaHoraTerminacion() {
        return fechaHoraTerminacion;
    }

    public String getDescripcionDiagnosticoInicial() {
        return descripcionDiagnosticoInicial;
    }

    public boolean isCerrado() {
        return cerrado;
    }

    public int getTarifaBaseHora() {
        return tarifaBaseHora;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setFechaHoraInicio(LocalDateTime fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public void setFechaHoraTerminacion(LocalDateTime fechaHoraTerminacion) {
        this.fechaHoraTerminacion = fechaHoraTerminacion;
    }

    public void setDescripcionDiagnosticoInicial(String descripcionDiagnosticoInicial) {
        this.descripcionDiagnosticoInicial = descripcionDiagnosticoInicial;
    }

    public void setCerrado(boolean cerrado) {
        this.cerrado = cerrado;
    }

    public void setTarifaBaseHora(int tarifaBaseHora) {
        this.tarifaBaseHora = tarifaBaseHora;
    }

    public String toString() {
        return "*****ServicioMantenimiento*****\n" +
                "numero=" + numero +
                ", fechaHoraInicio=" + fechaHoraInicio +
                ", fechaHoraTerminacion=" + fechaHoraTerminacion +
                ", descripcionDiagnosticoInicial='" + descripcionDiagnosticoInicial + '\'' +
                ", cerrado=" + cerrado +
                ", tarifaBaseHora=" + tarifaBaseHora;
    }

    //podrías retornar un long si se quiere más precisión en la duracion de horas
    public int calcularDuracionHoras() {
        long duracionHoras = Duration.between(fechaHoraInicio, fechaHoraTerminacion).toHours();
        return (int) duracionHoras;
    }

    //Creo que seria manejar esto en double porque se trata de dinero
    //para que este métodos sea asbtract debe estar declarado en una clase abstracta es decir una interface :,)
    public int calcularValorTotal(int cantidad) {
        return cantidad * tarifaBaseHora;
    };

}
