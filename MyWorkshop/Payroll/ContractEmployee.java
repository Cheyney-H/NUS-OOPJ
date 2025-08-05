class ContractEmployee extends Employee {
    private double projectFee;

    public ContractEmployee(String name, double projectFee){
        super(name);
        this.projectFee = projectFee;
    }

    @Override
    public double earnings(){
        return projectFee;
    }
}