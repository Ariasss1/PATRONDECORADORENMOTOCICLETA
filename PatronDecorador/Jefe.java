public class Jefe {
    public static void main(String[] args) {

        // Se crea la moto base NKD 125 (sin ningún accesorio)
        Moto miMoto = new Nkd125();

        // Ahora se agregan los accesorios uno por uno
        // Cada accesorio "envuelve" el objeto anterior.
        // Ejemplo: primero agregamos Luces LED a la moto.
        miMoto = new LucesLED(miMoto);

        // Luego le agregamos el GPS (decoramos la moto que ya tiene luces LED)
        miMoto = new Gps(miMoto);

        // Luego le agregamos el GPS (decoramos la moto que ya tiene luces LED)
        miMoto = new Maletero(miMoto);

        // Mostramos los resultados finales en consola
        System.out.println("--------------------------------------------------");

        // Muestra la descripción total con todos los accesorios agregados
        System.out.println(miMoto.getDescripcion());
        System.out.println("--------------------------------------------------");
        System.out.println("Accesorios instalados:");
        System.out.println(" - Luces LED: $250.000");
        System.out.println(" - GPS: $350.000");
        System.out.println(" - Maletero: $280.000");
        System.out.println("--------------------------------------------------");

        // Muestra el valor total sumando moto base + accesorios
        System.out.println("Valor total: $" + miMoto.getCosto());
        System.out.println("--------------------------------------------------");
        // Frase final
        System.out.println("🏍️ La NKD más vendida en Colombia 🏍️");
    }
}