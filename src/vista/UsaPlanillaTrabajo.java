package vista;

import model.PlanillaTrabajo;
import model.Tecnico;

import java.time.LocalDate;

public class UsaPlanillaTrabajo {

    PlanillaTrabajo head;
    PlanillaTrabajo tail;

    int size;

    public static void main(String[] args) {
        UsaPlanillaTrabajo usaPlanillaTrabajo = new UsaPlanillaTrabajo();


        Tecnico tecnico = new Tecnico("1234567890", "Juan Pérez");


        PlanillaTrabajo planillaTrabajo = new PlanillaTrabajo("PT-1234", LocalDate.of(2023, 7, 20), LocalDate.of(2023, 7, 25), 'A', tecnico);

        Tecnico tecnico2 = new Tecnico("1234567890", "Pedro Rodríguez");


        PlanillaTrabajo planillaTrabajo2 = new PlanillaTrabajo("PT-5678", LocalDate.of(2023, 8, 1), LocalDate.of(2023, 8, 5), 'C', tecnico2);


        usaPlanillaTrabajo.addFirst(planillaTrabajo);
        usaPlanillaTrabajo.addFirst(planillaTrabajo2);


        System.out.println(usaPlanillaTrabajo.get(0));
        System.out.println(usaPlanillaTrabajo.get(1));

    }

    public UsaPlanillaTrabajo() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void addFirst(PlanillaTrabajo planillaTrabajo) {
        PlanillaTrabajo nuevaPlanillaTrabajo = planillaTrabajo;
        nuevaPlanillaTrabajo.setNext(head);
        head = nuevaPlanillaTrabajo;
        if(tail == null) {
            tail = head;
        }
        size++;
    }

    public String get(int position) {
        if (position >= size) {
            return  null;
        }
        PlanillaTrabajo actual = head;
        for (int i=0; i<position; i++) {
            actual = actual.getNext();

        }
        return  actual.toString();
    }

}