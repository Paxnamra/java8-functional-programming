package _2_23_the_general_number_of_employees;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
@Data
public class Department {
    private String name;
    private String code;
    private List<Employee> employee;
}
