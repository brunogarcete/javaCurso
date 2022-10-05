package ejemplos;
public class Factorial {
    private int n;

    public Factorial() {
    }

    public Factorial(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int factorial(int n){
        if(!(n < 0) && n == 0){
            return 1;
        }else {
            return factorial(n-1) * n;
        }
    }
    
    @Override
    public String toString() {
        return "Factorial{" + "n=" + n + '}';
    }
}
