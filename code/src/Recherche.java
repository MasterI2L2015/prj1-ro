/**
 * Created by kevin on 06/01/2016.
 */
abstract class Recherche {
    protected Evalutation evalF;
    public Recherche(Evalutation evalf){
        this.evalF = evalf;
    }
    public abstract Solution run();
}
