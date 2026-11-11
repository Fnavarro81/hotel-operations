package com.pluralsight;

import java.time.LocalDateTime;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double startTime;

    public Employee(int employeeID, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeID;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getRegularHours() {
        if (hoursWorked > 40) {
            return 40.0;
        }
        return hoursWorked;
    }

    public double getOvertimeHours() {
        if (hoursWorked > 40) {
            return hoursWorked - 40;
        }
        return 0.0;
    }

    public double getTotalPay() {
        double regularPay = getRegularHours() * payRate;
        double overtimePay = getOvertimeHours() * (payRate * 1.5);
        return regularPay + overtimePay;
    }

    public void punchIn(int time) {
        this.startTime = time;
    }

    public void punchOut(int time) {
        this.hoursWorked += (time - this.startTime);
    }

    public void punchIn() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        this.startTime = currentDateTime.getHour();
    }

    public void punchOut() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        this.hoursWorked += (currentDateTime.getHour() - this.startTime);
    }
}
