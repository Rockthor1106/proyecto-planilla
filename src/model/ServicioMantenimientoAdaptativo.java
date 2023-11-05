package model;

import java.time.LocalDateTime;

public class ServicioMantenimientoAdaptativo extends ServicioMantenimiento {

    private int cantidadPiezasAgregadas;

    //Este atributo deberías ponerlo tipo String porque se trata de una descripción, es decir, texto
    private String descripcionPiezasAgregadas;

    //Podrías ponerlo como double porque es dinero y creo que sería el valor unitario de las piezas no el total
    private int valorUnitarioPiezasAgregadas;

    public ServicioMantenimientoAdaptativo(int numero, LocalDateTime fechaHoraInicio, LocalDateTime fechaHoraTerminacion, String descripcionDiagnosticoInicial, boolean cerrado, int tarifaBaseHora, int cantidadPiezasAgregadas, String descripcionPiezasAgregadas, int valorUnitarioPiezasAgregadas) {
        super(numero, fechaHoraInicio, fechaHoraTerminacion, descripcionDiagnosticoInicial, cerrado, tarifaBaseHora);
        this.cantidadPiezasAgregadas = cantidadPiezasAgregadas;
        this.descripcionPiezasAgregadas = descripcionPiezasAgregadas;
        this.valorUnitarioPiezasAgregadas = valorUnitarioPiezasAgregadas;
    }

    public int getCantidadPiezasAgregadas() {
        return cantidadPiezasAgregadas;
    }

    public String getDescripcionPiezasAgregadas() {
        return descripcionPiezasAgregadas;
    }

    public int getValorUnitarioPiezasAgregadas() {
        return valorUnitarioPiezasAgregadas;
    }

    public void setCantidadPiezasAgregadas(int cantidadPiezasAgregadas) {
        this.cantidadPiezasAgregadas = cantidadPiezasAgregadas;
    }

    public void setDescripcionPiezasAgregadas(String descripcionPiezasAgregadas) {
        this.descripcionPiezasAgregadas = descripcionPiezasAgregadas;
    }

    public void setValorUnitarioPiezasAgregadas(int valorUnitarioPiezasAgregadas) {
        this.valorUnitarioPiezasAgregadas = valorUnitarioPiezasAgregadas;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Cantidad piezas agregadas: " + cantidadPiezasAgregadas + "\n" +
                "Descripcioin piezas agregadas:" + descripcionPiezasAgregadas + "\n" +
                "Valor total piezas agredas: " + valorUnitarioPiezasAgregadas;
    }


    //En este caso cantidad corresponde a la cantidad de piezas agregadas
    @Override
    public int calcularValorTotal(int cantidad) {
        return cantidad * valorUnitarioPiezasAgregadas;
    }

}
