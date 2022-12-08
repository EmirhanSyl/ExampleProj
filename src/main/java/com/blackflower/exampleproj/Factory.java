package com.blackflower.exampleproj;

public class Factory {
    Employee[] employees = new Employee[5];
    
    void AddEmployee(Employee emp){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = emp;
                return;
            }
        }
    }
    
    int TotalPayment(String title){
        int total = 0;
        
        for (Employee emp: employees) {
            if (emp != null && emp.title == title) {
                total += emp.salary;
            }
        }
        return total;
    }
    
    void IncreaseSalary(int id){
        for (Employee emp: employees) {
            if (emp != null && emp.id == id) {
                emp.salary += 1000;
                return;
            }
        }
    }
    
    void RaiseSalary(int minSalary, int increaseAmount){
        for (Employee emp : employees) {
            if (emp != null && emp.salary < minSalary) {
                emp.salary += increaseAmount;
            }
        }
    }
    
    void HasNoBonusPayment(){
        for (Employee emp : employees) {
            if (emp != null) {
                boolean hasBonusPayment = false;
                for (int i = 0; i < emp.bonusPayment.length; i++) {// 0, 0, 3000
                    if (emp.bonusPayment[i] != 0) {
                        hasBonusPayment = true;         
                    }
                }
                if (!hasBonusPayment) {
                    System.out.println(emp.name + " " + emp.lastName);
                }
            }
        }
    }
}
