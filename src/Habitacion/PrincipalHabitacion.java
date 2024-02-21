package Habitacion;



public class PrincipalHabitacion {
    public static void main(String[] args) {
        Habitacion1[] habitacion1 = new Habitacion1 [5];

        habitacion1[0] = new Habitacion1(205, 300.000, false, "");
        habitacion1[1] = new Habitacion1(205, 300.000, false, "");
        habitacion1[2] = new Habitacion1(302, 350.000, true, "David");
        habitacion1[3] = new  Habitacion1(305, 350.000, true, "Mariana");
        habitacion1[4] = new Habitacion1(105, 200.000, false, "");


        System.out.println("Antes de las modificaciones:");
        for (Habitacion1 habitacion11 : habitacion1){
        System.out.println("Numero de habitacion " + habitacion11.getNumeroHabitaciones());
        System.out.println("Precio por noche" + habitacion11.getPrecioPorNoche());
        String mensaje =  habitacion11.isDisponibilidad() ? "Disponible" : "No disponible";

        System.out.println("Huespedes alojados" + habitacion11.getHuespedesAlojados());
        System.out.println();
    }


    }


