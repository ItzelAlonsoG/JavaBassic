public class DatTypes {
    public static void main(String[] args) {

        int n =1234567890;

        long nL =123378012309123L;

        double nD = 1234.456;

        float nF =1234.456F;

        var salary =1000; //int
        //pensión 3% de lo que gane
        var pension = salary * 0.03;//double

        var totalSalary = salary - pension;

        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "itzel alonso";
        System.out.println("Employee: " + employeeName + " Salary: " + totalSalary);
    }
}
