import java.util.Random;

/**
 * Created by kevin on 06/01/2016.
 */
public class hillClimber extends Recherche {
    private Evalutation evalF;
    private Random rnd;
    private int maxNbEval;
    private int nbEval,nbStep;
    private int[] voisin;
    private double maxNb,maxFit;

    public hillClimber(Evalutation eval,int maxEval,double max)
    {
        super(eval);
        this.rnd = new Random();
        this.maxNbEval = maxEval;
        this.maxFit = max;
    }

    public Solution run(){
        Solution sol = new Solution(evalF.size());
        aleatoireInt(sol);
        evalF.eval(sol);
        this.nbEval = 1;
        int i = 0;
        double currentFit;
        this.nbStep = 0;
        while( nbEval < maxNbEval && sol.getFit() < maxFit){
            currentFit =  sol.getFit();
            i = rnd.nextInt(evalF.size());
            sol.x[i]  = ! sol.x[i];
            evalF.eval(sol);
            for(int y=0;y < sol.x.length; y++){
                sol.x[y] = ! sol.x[y];
            }
            if(sol.getFit() <= currentFit){
                sol.x[i] = !sol.x[i];
                sol.setFit(currentFit);
            }else{
                this.nbStep += 1;
            }
        }
        return sol;
    }

    public void aleatoireInt(Solution s){
        for(int i=0; i<s.x.length;i++){
            double rand = rnd.nextDouble();
            if(rand <=0.5)
                s.x[i] = false;
            else
                s.x[i] = true;
        }
    }
}
