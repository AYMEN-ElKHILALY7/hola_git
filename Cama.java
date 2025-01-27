public class Cama {
    private String estilo;
    private int alomhadas;
    private int altura;
    private int sabanas;
    private int colcha;

    public Cama(String estilo, int alomhadas, int altura, int sabanas, int colcha) {
        this.estilo = estilo;
        this.alomhadas = alomhadas;
        this.altura = altura;
        this.sabanas = sabanas;
        this.colcha = colcha;
    }
     public void hacer(){
        System.out.println("La cama se ha hecho");
    }

    public String getEstilo() {
        return estilo;
    }

    public int getAlomhadas() {
        return alomhadas;
    }

    public int getAltura() {
        return altura;
    }

    public int getSabanas() {
        return sabanas;
    }

    public int getColcha() {
        return colcha;
    }
}
