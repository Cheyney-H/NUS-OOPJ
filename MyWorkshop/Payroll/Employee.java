abstract class Employee {
    private String name;

    public Employee(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract double earnings();

    public double adjustedPay(double adjustment){
        return earnings() + adjustment;
    }

    @Override
    public String toString(){
        return  getClass().getSimpleName() + ": " + getName();
    }
}