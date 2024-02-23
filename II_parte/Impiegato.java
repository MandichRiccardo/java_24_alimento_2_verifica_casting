package II_parte;

import com.sun.jdi.event.StepEvent;

public class Impiegato extends Persona{
    @Override
    public String chiSono() {
        return "Impiegato";
    }
    public String chiSono(String n){
        return "Impiegato.chiSono(String)" + cosaFaccio();
    }
}
