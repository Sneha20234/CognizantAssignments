package employeeManagement;

public class EmployeeManagementDemo {

	public static void main(String[] args) {
		EmployeeManagement employeeManagement = new EmployeeManagement(10);

        // Adding employees
        employeeManagement.addEmployee(new Employee("001", "Alice", "Manager", 75000));
        employeeManagement.addEmployee(new Employee("002", "Bob", "Developer", 60000));
        employeeManagement.addEmployee(new Employee("003", "Charlie", "Designer", 55000));

        // Searching for an employee
        Employee foundEmployee = employeeManagement.searchEmployee("002");
        if (foundEmployee != null) {
            System.out.println("Employee found: " + foundEmployee);
        } else {
            System.out.println("Employee not found.");
        }

        // Traversing and displaying all employees
        System.out.println("All employees:");
        employeeManagement.traverseEmployees();

        // Deleting an employee
        employeeManagement.deleteEmployee("002");

        // Traversing and displaying all employees after deletion
        System.out.println("All employees after deletion:");
        employeeManagement.traverseEmployees();
    
	}

}
