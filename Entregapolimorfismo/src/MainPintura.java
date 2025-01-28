public class MainPintura {
    public static void main(String[] args) {
        Pintura pintura = new Pintura(250);

        Forma rectangulo = new Rectangulo(20, 35);
        Forma esfera = new Esfera(15);
        Forma cilindro = new Cilindro(10, 30);

        System.out.printf("La cantidad de pintura necesaria para pintar el %s es: %.2f litros\n",
                rectangulo, pintura.calcularCantidad(rectangulo));
        System.out.printf("La cantidad de pintura necesaria para pintar la %s es: %.2f litros\n",
                esfera, pintura.calcularCantidad(esfera));
        System.out.printf("La cantidad de pintura necesaria para pintar el %s es: %.2f litros\n",
                cilindro, pintura.calcularCantidad(cilindro));
    }
}
