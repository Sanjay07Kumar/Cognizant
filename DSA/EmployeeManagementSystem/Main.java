package DSA.EmployeeManagementSystem;


public class Main {

    public static void main(String[] args) {

        EmployeeManagementSystem system =new EmployeeManagementSystem(10);

        system.addEmployee(new Employee(101,"Sanjay","Developer",50000));

        system.addEmployee(new Employee(102,"Rahul","Tester",40000));

        system.addEmployee(new Employee(103,"Priya","Manager",70000));

        System.out.println("\nAll Employees:");
        system.traverseEmployees();

        System.out.println("\nSearch Employee:");
        Employee employee = system.searchEmployee(102);

        if (employee != null) {
            System.out.println(employee);
        } else {
            System.out.println("Employee Not Found");
        }

        System.out.println("\nDeleting Employee 102");
        system.deleteEmployee(102);

        System.out.println("\nEmployees After Deletion:");
        system.traverseEmployees();
    }
}