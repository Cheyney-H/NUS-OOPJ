public class TestPayroll{
    public static void main(String[] args){
        Employee[] employees = new Employee[]{
            new SalariedEmployee("Alice", 1200,100),
            new HourlyEmployee("Bob", 70, 10,-50),
            new ContractEmployee("Charlie", 2000,0)
        };


        double totalPayroll = 0;

        for (Employee employee : employees){
            double finalPay = employee.adjustedPay();

            System.out.println(employee.toString());
            System.out.printf("Base Pay: $%.2f\n", employee.earnings());

            if (employee.getBod() > 0){
                System.out.printf("Adjustment: +$%.2f%n", employee.getBod());
            }else{
                System.out.printf("Adjustment: $%.2f%n", employee.getBod());
            }

            System.out.printf("Final Pay: $%.2f\n", finalPay);
            System.out.println();

            totalPayroll += finalPay;
        }
        System.out.printf("Total Payroll: $%.2f%n", totalPayroll);
    }
}