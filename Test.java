public class Test{
    public static void main(String[] args) {
        Alimento a1 = new Alimento();
        Alimento a2 = new PrimoPiatto();
        Cibo c1 = new Cibo();
        Cibo c2 = new PrimoPiatto();
        PrimoPiatto pp1 = new Cibo();
        PrimoPiatto pp2 = c2;
        Bevanda b1 = new Bevanda();
        Bevanda b2 = new PrimoPiatto();
        Alimento a3 = b1;
        Cibo c3 = a2;
        Cibo c3 = (Cibo) a1;
        PrimoPiatto pp3 = (PrimoPiatto) a2;
        Bevanda b3 = (Alimento) c3;
        Alimento a4 = (Alimento) b1;
        Cibo c3 = (Cibo) a4;
        Dessert d1 = (Dessert) pp3;
        Dessert s2 = b1;
    }
}