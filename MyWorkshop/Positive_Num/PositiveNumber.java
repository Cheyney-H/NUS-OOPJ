public class PositiveNumber {
    private int n;

    public PositiveNumber(int n){
        if (n > 0) {
            this.n = n;
        }else{
            this.n = 1;
        }
    }

    public int getN(){
        return n;
    }

    public boolean setN(int value){
        if (value > 0) {
            this.n = value;
            return true;
        }else{
            return false;
        }
    }
}

