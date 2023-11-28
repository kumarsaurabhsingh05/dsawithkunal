package practicequestions.askedinAdjecti;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// return list of employee who belong to particular department
public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1,"Saurabh", "Dev");
        Employee employee2 = new Employee(1,"Nishant", "Agri");
        Employee employee3 = new Employee(1,"Ashutosh", "Radiology");
        Employee employee4 = new Employee(1,"Shweta", "Dev");
        Employee employee5 = new Employee(1,"Deepak", "Agri");
        Employee employee6 = new Employee(1,"Rohit", "Networking");

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);


        List<Employee> filteredEmp = getEmployeesFromDepartment(employees, "Dev");
        System.out.println(filteredEmp);

    }

//    static List<Employee> getEmployeesFromDepartment(List<Employee> employees, String department) {
//        List<Employee> sortedEmployee = new ArrayList<>();
//        for (Employee employee : employees) {
//            if (employee.getDepartment() == department) sortedEmployee.add(employee);
//        }
//        return sortedEmployee;
//    }

    static List<Employee> getEmployeesFromDepartment(List<Employee> employees, String department) {
        return employees.stream().filter(employee -> employee.getDepartment() == department).collect(Collectors.toList());
    }
}
