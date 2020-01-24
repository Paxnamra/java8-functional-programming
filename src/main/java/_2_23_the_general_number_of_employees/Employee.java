package _2_23_the_general_number_of_employees;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Data
public class Employee {
    private String name;
    private long salary;
}
