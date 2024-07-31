package employeeManagement;

public class EmployeeManagement {

	 private Employee[] employees;
	    private int size;

	    public EmployeeManagement(int capacity) {
	        employees = new Employee[capacity];
	        size = 0;
	    }

	    // Method to add an employee
	    public void addEmployee(Employee employee) {
	        if (size == employees.length) {
	            System.out.println("Array is full. Cannot add more employees.");
	            return;
	        }
	        employees[size++] = employee;
	    }

	    // Method to search for an employee by ID
	    public Employee searchEmployee(String employeeId) {
	        for (int i = 0; i < size; i++) {
	            if (employees[i].getEmployeeId().equals(employeeId)) {
	                return employees[i];
	            }
	        }
	        return null;
	    }

	    // Method to traverse and display all employees
	    public void traverseEmployees() {
	        for (int i = 0; i < size; i++) {
	            System.out.println(employees[i]);
	        }
	    }

	    // Method to delete an employee by ID
	    public void deleteEmployee(String employeeId) {
	        int index = -1;
	        for (int i = 0; i < size; i++) {
	            if (employees[i].getEmployeeId().equals(employeeId)) {
	                index = i;
	                break;
	            }
	        }
	        if (index == -1) {
	            System.out.println("Employee not found.");
	            return;
	        }
	        for (int i = index; i < size - 1; i++) {
	            employees[i] = employees[i + 1];
	        }
	        employees[size - 1] = null;
	        size--;
	    }

}
