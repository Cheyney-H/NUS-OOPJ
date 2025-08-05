public class TestPayroll{
    public static void main(String[] args){
        Employee[] employees = new Employee[]{
            new SalariedEmployee("Alice", 1200),
            new HourlyEmployee("Bob", 70, 10),
            new ContractEmployee("Charlie", 2000)
        };

        double[] adjustments ={100, -50, 0};
        Bonus bonus = new Bonus(adjustments);
        double totalPayroll = 0;

        for (int i = 0; i < employees.length; i++){
            Employee employee = employees[i];
            double adjustment = bonus.getAdjustment(i);
            //double adjustment = adjustments[i];
            double finalPay = employee.adjustedPay(adjustment);

            System.out.println(employee.toString());
            System.out.printf("Base Pay: $%.1f\n", employee.earnings());

            if (adjustment > 0){
                System.out.printf("Adjustment: +$%.1f%n", adjustment);
            }else if(adjustment == 0){
                System.out.println("Adjustment: $0.0");
            }else{
                System.out.printf("Adjustment: -$%.1f%n", -adjustment);
            }

            System.out.printf("Final Pay: $%.1f\n", finalPay);
            System.out.println();

            totalPayroll += finalPay;
        }
        System.out.printf("Total Payroll: $%.1f%n", totalPayroll);
    }
}