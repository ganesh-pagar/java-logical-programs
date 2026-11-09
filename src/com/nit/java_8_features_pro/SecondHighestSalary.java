package com.nit.java_8_features_pro;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee
	{
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) 
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary()
    {
        return salary;
    }

    public String toString() 
    {
        return name + " - " + salary;
    }
}

public class SecondHighestSalary 
{
    public static void main(String[] args)
    {

        List<Employee> employees = Arrays.asList(
            new Employee(1, "Ganesh", 45000),
            new Employee(2, "Rahul", 65000),
            new Employee(3, "Amit", 55000),
            new Employee(4, "Sneha", 85000),
            new Employee(5, "Priya", 75000)
        );

        employees.stream()
            .map(Employee::getSalary)
            .distinct()
            .sorted(Comparator.reverseOrder())
            .skip(1)
            .findFirst()
            .ifPresent(System.out::println);
    }
}
