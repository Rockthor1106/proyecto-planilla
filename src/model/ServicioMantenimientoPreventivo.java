package model;

import java.time.LocalDateTime;

public class ServicioMantenimientoPreventivo extends  ServicioMantenimiento{
    private String descripcionProcedimiento;


    public ServicioMantenimientoPreventivo(int numero, LocalDateTime fechaHoraInicio, LocalDateTime fechaHoraTerminacion, String descripcionDiagnosticoInicial, boolean cerrado, int tarifaBaseHora, String descripcionProcedimiento) {
        super(numero, fechaHoraInicio, fechaHoraTerminacion, descripcionDiagnosticoInicial, cerrado, tarifaBaseHora);
        this.descripcionProcedimiento = descripcionProcedimiento;
    }

    public String getDescripcionProcedimiento() {
        return descripcionProcedimiento;
    }

    public void setDescripcionProcedimiento(String desdcripcionProcedimiento) {
        this.descripcionProcedimiento = descripcionProcedimiento;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDescripción del procedimiento: "  + descripcionProcedimiento;
    }

    //Esta clase podría usar el método calcular valor directamente,
    // pues entiendo que calcula el valor tomando en cuenta la cantidad de horas por la tarifa base hora

}
