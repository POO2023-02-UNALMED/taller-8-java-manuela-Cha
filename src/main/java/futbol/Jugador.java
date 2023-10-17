package futbol;
public class Jugador extends Futbolista{
    public short golesMarcados;
    public byte dorsal;

    public Jugador(){
        super();
        this.golesMarcados = 289;
        this.dorsal = 7;
    }

    public Jugador(String nombre,int edad,String tipo,short golesMarcados,byte dorsal){
        super(nombre, edad, tipo);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }
    public boolean jugarConLasManos() {
        return false;
    }
    public int compareTo(Object o) {
        Jugador f = (Jugador) o;
        int diferencia = Math.abs(f.getEdad() - this.getEdad());      
        return diferencia;
    }
    public String toString(){
        return "El futbolista "+this.getNombre()+" tiene "+this.getEdad()+", y juega de "+
        this.getPosicion()+" con el dorsal "+this.dorsal+". Ha marcado "+ this.golesMarcados;
    }
}
