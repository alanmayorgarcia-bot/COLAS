public class Ejercicio_ED_2_Discoduroderoer {

    public static void main(String[] args) {

        System.out.println("=== SIMULACIÓN DE GESTIÓN DE TURNOS / TAREAS ===");
        
        // Uso de la ColaDinamica para simular la gestión de turnos
        ColaDinamica<String> colaTurnos = new ColaDinamica<>();

        System.out.println("El tamaño es: " + colaTurnos.size());
        System.out.println("¿Esta vacia? (inicio) " + colaTurnos.isEmpty());

        // 1. Agregar turnos a la cola (enqueue)
        colaTurnos.enqueue("Turno #1 - Cliente: Ana Martínez (Trámite: Depósito)");
        colaTurnos.enqueue("Turno #2 - Cliente: Roberto Gómez (Trámite: Apertura de cuenta)");
        colaTurnos.enqueue("Turno #3 - Cliente: Laura Sánchez (Trámite: Aclaraciones)");

        System.out.println("\nEl tamaño es: " + colaTurnos.size());
        System.out.println("¿Esta vacia? (despues de agregar) " + colaTurnos.isEmpty());

        // 2. Consultar el primer turno en fila
        System.out.println("\nEl primero es: " + colaTurnos.primero());

        // 3. Imprimir el estado actual de la cola
        System.out.println("\n--- Turnos pendientes en la cola ---");
        System.out.print(colaTurnos.toString());

        // 4. Atender turnos (dequeue)
        System.out.println("--- Atendiendo turnos ---");
        System.out.println("Quitamos el primero -> " + colaTurnos.dequeue());
        System.out.println("Quitamos el primero -> " + colaTurnos.dequeue());

        // 5. Estado de la cola tras atender turnos
        System.out.println("\nEl tamaño es: " + colaTurnos.size());
        System.out.println("El primero actual es: " + colaTurnos.primero());
        System.out.println("¿Esta vacia? (despues de quitar) " + colaTurnos.isEmpty());

        System.out.println("\n--- Turnos restantes ---");
        System.out.print(colaTurnos.toString());
    }
}