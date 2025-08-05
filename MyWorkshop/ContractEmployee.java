class ContractEmployee extends Employee {
    private double projectFee;

    public ContractEmployee(String name, double projectFee, double bod){
        super(name, bod);
        this.projectFee = projectFee;
    }

    @Override
    public double earnings(){
        return projectFee;
    }
}