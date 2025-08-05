abstract class Employee {
    private String name;
    private double bod;

    public Employee(String name, double bod){
        this.name = name;
        this.bod = bod;
    }

    public String getName(){
        return name;
    }

    public abstract double earnings();

    public double getBod() {
        return bod;
    }

    public void setBod(double bod) {
        this.bod = bod;
    }
    public double adjustedPay(){
        return earnings() + bod;
    }

    @Override
    public String toString(){
        return  getClass().getSimpleName() + ": " + getName();
    }
}