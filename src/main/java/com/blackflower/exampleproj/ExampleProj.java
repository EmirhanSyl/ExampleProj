package com.blackflower.exampleproj;

public class ExampleProj {

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.salary = 1000;
        emp.title = "w";
        
        Factory fack = new Factory();
        
        fack.AddEmployee(emp);
        fack.IncreaseSalary(100);
        
        
        
    }
}
