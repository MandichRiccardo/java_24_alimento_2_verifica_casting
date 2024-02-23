package II_parte;

public class Segretario extends Impiegato{
    @Override
    public String chiSono(String n) {
        return "Segretario.chiSOno(String)";
    }

    @Override
    public String cosaFaccio() {
        return "lavoro in azienda" + super.chiSono("Mario");
    }
}
