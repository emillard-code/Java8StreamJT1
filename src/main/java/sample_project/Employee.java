package sample_project;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private int id;
    private String name;
    private String dept;
    private long salary;

    @Override
    public String toString() {

        return "Employee [id = " + id + ", name = " + name + ", dept = " + dept + ", salary = " + salary + "]";

    }

}