package com.company.Other;

import java.util.Random;

public class Employee {
    private String name;
    private double salary;
    private int id;

    { // Блок инициализации
        Random generator = new Random();
        id = 1 + generator.nextInt(1_000_000);
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
}
