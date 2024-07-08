package com.amisitysu.gmail;

public class Worker {
    public static void main(String[] args) {
        // Створення об'єкта класу Employee
        Employee employee = new Employee("Іван Іванов", "Програміст", "ivanov@example.com", "097-456-7890", 30);

        // Вивід інформації про співробітника
        System.out.println("ПІБ: " + employee.getName());
        System.out.println("Посада: " + employee.getPosition());
        System.out.println("Email: " + employee.getEmail());
        System.out.println("Телефон: " + employee.getPhone());
        System.out.println("Вік: " + employee.getAge());
    }
}
