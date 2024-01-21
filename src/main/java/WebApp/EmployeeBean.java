package WebApp;

import Model.Department;
import Model.Employee;
import Service.EmployeeService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.util.List;

@ManagedBean
@ViewScoped
public class EmployeeBean {

    @ManagedProperty("#{employeeService}")
    private EmployeeService employeeService;

    private String gender;
    private String name;
    private int departmentId;

    private List<Employee> employees;
    private List<Department> departments;

    @PostConstruct
    public void init() {
        employees = employeeService.getAllEmployees();
        departments = employeeService.getAllDepartments();
    }

    public void addEmployee() {
        Department department = employeeService.getDepartmentById(departmentId);
        Employee employee = new Employee(name, gender, department);
        employeeService.addEmployee(employee);
        employees = employeeService.getAllEmployees();
        resetForm();
    }

    private void resetForm() {
        gender = null;
        name = null;
        departmentId = 0;
    }

    public EmployeeService getEmployeeService() {
        return employeeService;
    }

    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }
}
