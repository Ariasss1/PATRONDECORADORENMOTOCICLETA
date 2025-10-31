class Gps extends AccesoriosDecorator {
    public Gps(Moto moto) {
        super(moto);
    }

    @Override
    public String getDescripcion() {
        // Agrega la descripción del GPS sobre la moto anterior
        return motoDecorada.getDescripcion() + ", con sistema GPS integrado";
    }

    @Override
    public double getCosto() {
        // Suma el precio del GPS al total
        return motoDecorada.getCosto() + 350000;
    }

    public String getDetalles() {
        return "GPS digital con pantalla táctil.";
    }
}