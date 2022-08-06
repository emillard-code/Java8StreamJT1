package sample_project;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {

    public static List<Employee> evaluateTaxUsers(String input) {

        // Returns employees that make more than 500,000 a year when "tax" is the argument.
        // Returns employees that make 500,000 or less when "tax" is not the argument.
        return (input.equalsIgnoreCase("tax"))
                ? Database.getEmployees().stream().filter(emp -> emp.getSalary() > 500000).collect(Collectors.toList())
                : Database.getEmployees().stream().filter(emp -> emp.getSalary() <= 500000).collect(Collectors.toList());

    }

    public static void main(String[] args) {

        System.out.println(evaluateTaxUsers("tax"));

    }

}