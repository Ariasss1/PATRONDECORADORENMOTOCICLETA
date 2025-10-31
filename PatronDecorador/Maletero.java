class Maletero extends AccesoriosDecorator {
    public Maletero(Moto moto) {
        super(moto);
    }

    @Override
    public String getDescripcion() {
        // Agrega el texto correspondiente al maletero
        return motoDecorada.getDescripcion() + ", con maletero trasero incluido";
    }

    @Override
    public double getCosto() {
        // Suma el precio del maletero al costo total
        return motoDecorada.getCosto() + 280000;
    }

    public String getDetalles() {
        return "Maletero de 35 litros, color negro, con cerradura de seguridad.";
    }
}