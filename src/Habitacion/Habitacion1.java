package Habitacion;

public class Habitacion1 {

private int numeroHabitaciones;
private double precioPorNoche;
private boolean disponibilidad;
private String huespedesAlojados;

public Habitacion1(int numeroHabitaciones, double precioPorNoche, boolean disponibilidad, String huespedesAlojados) {
this.numeroHabitaciones = numeroHabitaciones;
this.precioPorNoche = precioPorNoche;
this.disponibilidad = disponibilidad;
this.huespedesAlojados = huespedesAlojados;

}

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public void setPrecioPorNoche(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getHuespedesAlojados() {
        return huespedesAlojados;
    }

    public void setHuespedesAlojados(String huespedesAlojados) {
        this.huespedesAlojados = huespedesAlojados;
    }
}