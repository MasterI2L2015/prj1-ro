/**
 * Created by kevin on 06/01/2016.
 */
public class Solution {

    public int solution;
    public Boolean[] x;
    public double dble;
    public double fitness;

    public Solution(int solution){
        this.dble = 0;
        this.solution = solution;
    }

    public String toString(){
        String msg = "";
        msg += this.dble + " ";
        for(int i=0;i<this.solution;i++){
            if(this.x[i] == true){
                msg += 1;
            }
            else{
                msg += 0;
            }
        }
        return msg;
    }
    public void setFit(double fitness){
        this.fitness = fitness;
    }
    public double getFit(){
        return this.fitness;
    }
}
