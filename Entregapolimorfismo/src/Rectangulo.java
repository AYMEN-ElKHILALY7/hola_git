class Rectangulo extends Forma {
    private double largo;
    private double ancho;

    public Rectangulo(double largo, double ancho) {
        super("Rectángulo");
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    public double area() {
        return largo * ancho;
    }
}
