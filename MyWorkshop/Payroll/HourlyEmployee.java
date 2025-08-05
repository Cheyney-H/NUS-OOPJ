class HourlyEmployee extends Employee {
    private int hours;
    private double hourlyRate;

    public HourlyEmployee(String name, int hours, double hourlyRate){
        super(name);
        this.hours = hours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double earnings(){
        return hours * hourlyRate;
    }
}