import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║       EMPLOYEE MANAGEMENT SYSTEM         ║");
        System.out.println("╚══════════════════════════════════════════╝");

        System.out.println("\n--------- ENTER EMPLOYEE DETAILS ---------\n");

        System.out.print("Employee ID       : ");
        employee.setId(sc.nextInt());
        sc.nextLine();

        System.out.print("Employee Name     : ");
        employee.setName(sc.nextLine());

        System.out.print("Department        : ");
        employee.setDepartment(sc.nextLine());

        System.out.print("Designation       : ");
        employee.setDesignation(sc.nextLine());

        System.out.print("Monthly Salary    : ₹");
        employee.setSalary(sc.nextDouble());

        System.out.println("\n✓ Employee added successfully!");

        System.out.println("\n╔══════════════════════════════════════════╗");
        System.out.println("║            EMPLOYEE DETAILS             ║");
        System.out.println("╠══════════════════════════════════════════╣");
        System.out.println("║ Employee ID    : " + employee.getId());
        System.out.println("║ Name           : " + employee.getName());
        System.out.println("║ Department     : " + employee.getDepartment());
        System.out.println("║ Designation    : " + employee.getDesignation());
        System.out.println("║ Monthly Salary : ₹" + employee.getSalary());
        System.out.println("╚══════════════════════════════════════════╝");

        sc.close();
    }
}
