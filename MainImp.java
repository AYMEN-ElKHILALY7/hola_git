public class MainIMP {
    public static void main(String[] args) {
        Impresora impresora = new Impresora(30, true);

        System.out.println("Nivel inicial de tóner: " +impresora.agregarToner(30));
        System.out.println("Agregando 30% de tóner: " + impresora.agregarToner(30));
        System.out.println("Intentando agregar 80% de tóner: " + impresora.agregarToner(80));

        System.out.println("Páginas impresas (doble cara): " + impresora.imprimirPaginas(5));
        System.out.println("Total de páginas impresas: " + impresora.getPaginasImpresas());

        System.out.println("Páginas impresas (doble cara): " + impresora.imprimirPaginas(6));
        System.out.println("Total de páginas impresas: " + impresora.getPaginasImpresas());
    }
}
