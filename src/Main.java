public class Main {
    public static void main(String[] args) {
        Desarrollador d1 = new Desarrollador("D01", "Ana", "Backend", 20);
        Desarrollador d2 = new Desarrollador("D02", "Luis", "Frontend", 15);
        Desarrollador d3 = new Desarrollador("D03", "Carla", "Base de Datos", 10);

        Proyecto proyecto = new Proyecto("Sistema de ventas");
        System.out.println("--- 1. PROYECTO INICIAL ---");
        System.out.println(proyecto.mostrarEquipo());

        proyecto.agregarDesarrollador(d1);
        proyecto.agregarDesarrollador(d2);
        proyecto.agregarDesarrollador(d3);

        System.out.println("--- 2. EQUIPO TRAS AGREGAR 3 INTEGRANTES ---");
        System.out.println(proyecto.mostrarEquipo());
        System.out.println("Total de horas asignadas: " + proyecto.calcularTotalHoras() + " hrs\n");

        System.out.println("--- 3. BUSCAR EXISTENTE ---");
        Desarrollador buscado = proyecto.buscarDesarrollador("D02");
        if (buscado != null) {
            System.out.println("Encontrado: " + buscado.mostrarInformacion() + "\n");
        } else {
            System.out.println("Desarrollador no encontrado.\n");
        }

        System.out.println("--- 4. BUSCAR INEXISTENTE ---");
        Desarrollador noExiste = proyecto.buscarDesarrollador("D99");
        if (noExiste != null) {
            System.out.println("Encontrado: " + noExiste.mostrarInformacion() + "\n");
        } else {
            System.out.println("Resultado: null (El desarrollador D99 no está en el proyecto)\n");
        }

        System.out.println("--- 5. ELIMINAR DESARROLLADOR ---");
        boolean eliminado = proyecto.eliminarDesarrollador("D01");
        System.out.println("¿Se eliminó a D01 del proyecto?: " + eliminado);

        System.out.println("Objeto d1 sigue vivo fuera del proyecto -> " + d1.mostrarInformacion() + "\n");

        System.out.println("--- 6. EQUIPO Y HORAS FINALES ---");
        System.out.println(proyecto.mostrarEquipo());
        System.out.println("Nuevo total de horas asignadas: " + proyecto.calcularTotalHoras() + " hrs");
    }
}