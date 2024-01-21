package Service.imp;

import Model.Department;
import Model.Employee;
import Service.EmployeeService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Employee> getAllEmployees() {
        Query query = null;
        try {
             query = entityManager.createQuery("SELECT e FROM Employee e");
        }catch (Exception e){
            e.printStackTrace();
        }
        return query.getResultList();
    }

    @Override
    public List<Department> getAllDepartments() {
        Query query = entityManager.createQuery("SELECT d FROM Department d");
        return query.getResultList();
    }

    @Override
    public Department getDepartmentById(int id) {
        return entityManager.find(Department.class, id);
    }

    @Override
    public void addEmployee(Employee employee) {
        entityManager.persist(employee);
    }
}
