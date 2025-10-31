class LucesLED extends AccesoriosDecorator {

    // Constructor que recibe la moto que se va a decorar con luces LED
    public LucesLED(Moto moto) {
        super(moto);
    }

    // Sobreescribimos la descripción agregando "equipada con Luces LED"
    @Override
    public String getDescripcion() {
        // Llama a la descripción anterior y le añade el texto del accesorio
        return motoDecorada.getDescripcion() + ", equipada con Luces LED";
    }

    // Sobreescribimos el método que calcula el costo total
    @Override
    public double getCosto() {
        // Suma el costo del accesorio al costo total anterior
        return motoDecorada.getCosto() + 250000;
    }

    // Método extra con información adicional del accesorio
    public String getDetalles() {
        return "Luces LED blancas de alta intensidad.";
    }
}
