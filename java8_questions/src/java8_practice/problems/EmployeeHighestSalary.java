package java8_practice.problems;

import java8_practice.problems.dto.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeHighestSalary {

    public static void findSecondHighestSalary(List<Employee> emps) {

        emps
                .stream()
                .sorted(Comparator
                        .comparingDouble(Employee::getSalary).reversed())
                .skip(1)
                .findFirst()
                .ifPresent(System.out::println);

    }

    public static void main(String[] args) {

        Employee e1 = new Employee("A", "HR", 35000);
        Employee e2 = new Employee("B", "Sales", 15000);
        Employee e3 = new Employee("B", "Intern", 25000);
        findSecondHighestSalary(Arrays.asList(e1, e2, e3));
    }

}

