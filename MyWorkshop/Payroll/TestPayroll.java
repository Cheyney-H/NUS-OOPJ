public class TestPayroll{
    public static void main(String[] args){
        Employee[] employees = new Employee[]{
            new SalariedEmployee("Alice", 1200, 100),
            new HourlyEmployee("Bob", 70, 10, -50),
            new ContractEmployee("Charlie", 2000, 0)
        };

        double totalPayroll = 0;

        for (Employee employee : employees){
            double finalPay = employee.adjustedPay();

            System.out.println(employee.toString());
            System.out.printf("Base Pay: $%.1f\n", employee.earnings());

            if (employee.getBod() > 0){
                System.out.printf("Adjustment: +$%.1f%n", employee.getBod());
            }else if(employee.getBod() == 0){
                System.out.println("Adjustment: $0.0");
            }else{
                System.out.printf("Adjustment: -$%.1f%n", -employee.getBod());
            }

            System.out.printf("Final Pay: $%.1f\n", finalPay);
            System.out.println();

            totalPayroll += finalPay;
        }
        System.out.printf("Total Payroll: $%.1f%n", totalPayroll);
    }

}
