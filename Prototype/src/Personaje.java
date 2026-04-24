public class Personaje implements Prototype {
    private String nombre;
    private String clase;
    private int nivel;
    private int puntosVida;
    private int puntosEnergia;

    public Personaje(String nombre, String clase, int nivel, int puntosVida, int puntosEnergia) {
        this.nombre = nombre; 
        this.clase = clase;
        this.nivel = nivel;
        this.puntosVida = puntosVida; 
        this.puntosEnergia = puntosEnergia;
    }

    public Personaje(Personaje objetivo) {
        if (objetivo != null) {
            this.nombre = objetivo.nombre;
            this.clase = objetivo.clase;
            this.nivel = objetivo.nivel;
            this.puntosVida = objetivo.puntosVida;
            this.puntosEnergia = objetivo.puntosEnergia; 
        }
    }

    @Override
    public Prototype clone() {
        return new Personaje(this);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Personaje\n" +
                "Nombre:" + nombre  +
                ", Clase:" + clase  +
                ", Nivel:" + nivel +
                ", Vida:" + puntosVida +
                ", Energia:" + puntosEnergia;
    }
}