import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Crear instancia de Company
        Company company = new Company();

        // Crear empleados y agregarlos al Map mutable
        Employee emp1 = new Employee(1, "Diego", "Developer");
        Employee emp2 = new Employee(2, "Maria", "Designer");

        company.addEmployee(emp1);
        company.addEmployee(emp2);

        // Obtener el Map inmutable y mostrar su contenido
        Map<Integer, Employee> inmutableEmployees = company.getInmutableEmployees();
        System.out.println(inmutableEmployees);

        // Intentar modificar el Map inmutable
        try {
            inmutableEmployees.put(3, new Employee(3, "Rodrigo", "Manager"));
        } catch (UnsupportedOperationException e) {
            System.out.println("No se puede modificar el Map inmutable: " + e);
        }
    }
}
