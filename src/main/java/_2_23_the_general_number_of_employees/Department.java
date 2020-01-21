package _2_23_the_general_number_of_employees;

import java.util.List;

public class Department {
    private String name;
    private String code;
    private List<Employee> employee;

    public Department(String name, String code, List<Employee> employee) {
        this.name = name;
        this.code = code;
        this.employee = employee;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", employee=" + employee +
                '}';
    }
}
