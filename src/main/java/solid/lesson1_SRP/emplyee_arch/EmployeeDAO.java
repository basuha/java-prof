package solid.lesson1_SRP.emplyee_arch;

public class EmployeeDAO {
    public void saveEmployee(Employee employee) {
        System.out.println(employee + "save");
    }

    public void deleteEmployee(Employee employee) {
        System.out.println(employee + " deleted.");
    }
}
