public class Impresora {
    private int nivelToner;
    private int paginasImpresas;
    private boolean dobleCara;


    public Impresora(int nivelToner, boolean dobleCara) {
        if (nivelToner >= 0 && nivelToner <= 100) {
            this.nivelToner = nivelToner;
        } else {
            this.nivelToner = -1;
        }
        this.paginasImpresas = 0;
        this.dobleCara = dobleCara;
    }

    public int agregarToner(int cantidad) {
        if (cantidad > 0 && cantidad <= 100) {
            if (this.nivelToner + cantidad > 100) {
                return -1;
            }
            this.nivelToner += cantidad;
            return this.nivelToner;
        } else {
            return -1;
        }
    }

    public int imprimirPaginas(int paginas) {
        int paginasAImprimir = paginas;
        if (this.dobleCara) {
            paginasAImprimir = (paginas / 2) + (paginas % 2);
        }
        this.paginasImpresas += paginasAImprimir;
        return paginasAImprimir;
    }

    public int getPaginasImpresas() {
        return paginasImpresas;
    }
}
