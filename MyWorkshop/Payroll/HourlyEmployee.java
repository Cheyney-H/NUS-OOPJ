class HourlyEmployee extends Employee {
    private int hours;
    private double hourlyRate;

    public HourlyEmployee(String name, int hours, double hourlyRate, double bod){
        super(name, bod);
        this.hours = hours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double earnings(){
        return hours * hourlyRate;
    }

}
