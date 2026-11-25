import java.util.ArrayList;

public class Proyecto {
    private String nombre;
    private ArrayList<Desarrollador> desarrolladores;

    public Proyecto(String nombre) {
        this.nombre = nombre;
        this.desarrolladores = new ArrayList<>();
    }

    public void agregarDesarrollador(Desarrollador desarrollador) {
        if (desarrollador != null) {
            desarrolladores.add(desarrollador);
        }
    }

    public Desarrollador buscarDesarrollador(String identificacion) {
        for (Desarrollador d : desarrolladores) {
            if (d.getIdentificacion().equals(identificacion)) {
                return d;
            }
        }
        return null;
    }

    public boolean eliminarDesarrollador(String identificacion) {
        Desarrollador encontrado = buscarDesarrollador(identificacion);
        if (encontrado != null) {
            desarrolladores.remove(encontrado);
            return true;
        }
        return false;
    }

    public double calcularTotalHoras() {
        double total = 0;
        for (Desarrollador d : desarrolladores) {
            total += d.getHorasAsignadas();
        }
        return total;
    }

    public String mostrarEquipo() {
        String resultado = "=== Equipo del Proyecto: " + nombre + " ===\n";
        if (desarrolladores.isEmpty()) {
            resultado += "No hay desarrolladores asignados actualmente.\n";
        } else {
            for (Desarrollador d : desarrolladores) {
                resultado += "- " + d.mostrarInformacion() + "\n";
            }
        }
        return resultado;
    }
}