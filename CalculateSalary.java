package com.javademo;

class Employee {
    private String name;
    private String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public double calculateSalary() {
        return 0.0;
    }
}

// Manager.java
// Subclass Manager
class Manager extends Employee {
    private double baseSalary;
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, "Manager");
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}
// Programmer.java
// Subclass Programmer
class Programmer extends Employee {
    private double baseSalary;
    private double overtimePay;

    public Programmer(String name, double baseSalary, double overtimePay) {
        super(name, "Programmer");
        this.baseSalary = baseSalary;
        this.overtimePay = overtimePay;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + overtimePay;
    }
}
// Main.java
// Main class
public class CalculateSalary {
    public static void main(String[] args) {
        Employee emp1 = new Manager("Mansi Patil", 8500.0, 2500.0);
        Employee emp2 = new Programmer("Pooja Patil", 3000.0, 500.0);

        System.out.println("Manager: " + emp1.getName() + "\nRole: " + emp1.getRole() + "\nSalary: $" + emp1.calculateSalary());
        System.out.println("\nProgrammer: " + emp2.getName() + "\nRole: " + emp2.getRole() + "\nSalary: $" + emp2.calculateSalary());
    }
}