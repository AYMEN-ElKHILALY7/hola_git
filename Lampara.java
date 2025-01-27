public class Lampara {
    private String estilo;
    private boolean bateria;
    private int calificacion;

    public Lampara(String estilo, boolean bateria, int calificacion) {
        this.estilo = estilo;
        this.bateria = bateria;
        this.calificacion = calificacion;
    }

    public void encender() {
        System.out.println("La lámpara se ha encendido.");
    }

    public String getEstilo() {
        return estilo;
    }
    public boolean getBateria() {
        return bateria;
    }
    public int getCalificacion() {
        return calificacion;
    }
}
