abstract class AccesoriosDecorator extends Moto {

    // Aquí guardamos la referencia al objeto Moto que vamos a "decorar"
    protected Moto motoDecorada;

    // Constructor que recibe la moto base (o una moto ya decorada)
    public AccesoriosDecorator(Moto moto) {
        this.motoDecorada = moto;
    }

    // Los métodos se deben redefinir en los decoradores concretos
    public abstract String getDescripcion();
    public abstract double getCosto();
}
