public class Guerrero {

    private String nombre;
    private int edad;
    private int fuerza;
    private boolean herido;
    private boolean muerto;

    public Guerrero(String nombre, int edad, int fuerza) {
        this.nombre = nombre;
        this.edad = edad;
        this.fuerza = fuerza;
        this.herido = false;
        this.muerto = false;
    }

    public Guerrero() {
        this("guerreroX", 15, 1);
    }

    public Guerrero(Guerrero guerrero, String nombre) {
        //Si se copia el guerrero ingresado
        this(nombre, guerrero.edad, guerrero.fuerza);
        /*Si se copia al guerreroX seria:
        this(nombre, 15, 1);
        Aunque no tendria sentido ingresar un nuevo guerrero entonces
        */
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public boolean isHerido() {
        return herido;
    }

    public void setHerido(boolean herido) {
        this.herido = herido;
    }

    public boolean isMuerto() {
        return muerto;
    }

    public void setMuerto(boolean muerto) {
        this.muerto = muerto;
    }

    protected static boolean comprobarEdad(int e){
        if ((e >= 15) && (e <= 60)) {
            System.out.println("Edad en el rango");
            return true;
        }else {
            System.out.println("La edad no esta en el rango");
            return false;
        }
    }

    protected static boolean comprobarFuerza(int f){
        if ((f >= 1) && (f <= 10)) {
            System.out.println("Fuerza en el rango");
            return true;
        }else {
            System.out.println("La fuerza no esta en el rango");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Guerrero [nombre=" + nombre + ", edad=" + edad + ", fuerza=" + fuerza + "]";
    }

}