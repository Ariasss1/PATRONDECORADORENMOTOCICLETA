class Nkd125 extends Moto {

    // Atributo que almacena la descripción base
    private String descripcion;

    // Constructor donde se define la descripción inicial de la moto
    public Nkd125() {
        descripcion = "Moto NKD 125 modelo 2027";
    }

    // Devuelve la descripción de la moto (solo el modelo)
    @Override
    public String getDescripcion() {
        return descripcion;
    }

    // Devuelve el costo base sin accesorios
    @Override
    public double getCosto() {
        return 5400000; // Precio base de la NKD 125
    }

    // Método opcional que devuelve información técnica de la moto
    public String getEspecificaciones() {
        return "Motor 4 tiempos, 125cc, freno de disco delantero, arranque eléctrico.";
    }
}
