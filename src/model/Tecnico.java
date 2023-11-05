package model;

public class Tecnico {

    String numeroCedula;
    String nombreCompleto;

    public Tecnico(String numeroCedula, String nombreCompleto) {
        this.numeroCedula = numeroCedula;
        this.nombreCompleto = nombreCompleto;
    }

    public String getNumeroCedula() {
        return numeroCedula;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNumeroCedula(String numeroCedula) {
        this.numeroCedula = numeroCedula;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String toString() {
        return "Técnico: " + nombreCompleto + "\n"
                + "Número de cedula: " + numeroCedula;
    }

}
