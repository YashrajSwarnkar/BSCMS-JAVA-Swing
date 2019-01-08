/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

/**
 *
 * @author barua
 */
public class Employee {
    
    String employeeName;
    int employeeId;
    static int counter = 0;
    
    public Employee()
    {
        counter++;
        employeeId = counter;
    }
    
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    
    @Override
    public String toString()
    {
        return employeeName;
    }
}
