package Service;

import Model.Department;
import Model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    List<Department> getAllDepartments();

    Department getDepartmentById(int id);

    void addEmployee(Employee employee);
}
