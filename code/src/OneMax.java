public class OneMax extends Evalutation {
    OneMax(int _n) {
        super(_n);
    }

    // evaluation function
    public void apply(Solution solution) {
        int value = 0;

        for(int i = 0; i < solution.size(); i++)
            if (solution.x[i])
                value++;

        solution.setFit(value);
}
