package _2_23_the_general_number_of_employees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//        You have two classes: Employee (name: String, salary: Long) and Department (name: String, code: String, employees: List<Employee>). Both classes have getters
//        for all fields with the corresponding names (getName(), getSalary(), getEmployees() and so on).
//        Write a method using Stream API that calculates the general number of employees with salary >= threshold for all departments whose code starts
//        with string "111-" (without ""). Perhaps, flatMap method can help you to implement it.

public class Step1 {
    public static void main(String[] args) {

        List<Employee> e = new ArrayList<>(Arrays.asList(
                new Employee("Sophia", 10000L),
                new Employee("Eric", 12000L),
                new Employee("Nel", 20000L)));

        Department dep1 = new Department("dep-1", "111-1", e);
        Department dep2 = new Department("dep-2", "222-1", e);

        List<Department> departments = new ArrayList<>(Arrays.asList(dep1, dep2));
        System.out.println("No department code filtering: " + calcNumberOfEmployeesNoUpfrontFiltering(departments, 20000L));
        System.out.println("With department filtering: " + calcNumberOfEmployeesUpfrontCodeFiltering(departments, 20000L));
        System.out.println("With department filtering: " + calcNumberOfEmployeesUpfrontCodeFiltering2(departments, 20000L));
    }

    public static long calcNumberOfEmployeesNoUpfrontFiltering(List<Department> departments, long threshold) {
        return departments.stream()
                .flatMap(d -> d.getEmployee()
                        .stream()
                        .map(Employee::getSalary)
                        .filter(e -> e >= threshold))
                .count();
    }

    public static long calcNumberOfEmployeesUpfrontCodeFiltering(List<Department> departments, long threshold) {
        return departments.stream()
                .filter(d -> d.getCode().startsWith("111-")).flatMap(d -> d.getEmployee()
                        .stream()
                        .map(Employee::getSalary)
                        .filter(e -> e >= threshold))
                .count();
    }

    public static long calcNumberOfEmployeesUpfrontCodeFiltering2(List<Department> departments, long threshold) {
        return departments.stream()
                .filter(d -> d.getCode().startsWith("111-")).flatMap(d -> d.getEmployee()
                        .stream()
                        .filter(e -> e.getSalary() >= threshold))
                .count();
    }
}
