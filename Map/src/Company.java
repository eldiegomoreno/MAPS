import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Company {
    private Map<Integer, Employee> employees = new HashMap<>();

    // Método para agregar un empleado al Map mutable
    public void addEmployee(Employee employee) {
        employees.put(employee.getId(), employee);
    }

    // Método para convertir y devolver el Map como inmutable
    public Map<Integer, Employee> getInmutableEmployees() {
        return Collections.unmodifiableMap(employees);
    }
}
