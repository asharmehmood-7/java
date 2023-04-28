package org.example.concepts.comparable_vs_comparator;

public class Employee implements  Comparable<Employee> {
    private String name;
    private int empid;
    private String contactno;

    // Constructor
    public Employee(String name, int empid, String contactno) {
        this.name = name;
        this.empid = empid;
        this.contactno = contactno;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getEmpid() {
        return empid;
    }

    public String getContactno() {
        return contactno;
    }

//    @Override
//    public String toString() {
//        return "Employee{" +
//                "name='" + name + '\'' +
//                ", empid=" + empid +
//                ", contactno='" + contactno + '\'' +
//                '}';
//    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }

    @Override
    public int compareTo(Employee o) {
        return this.empid - o.empid;
    }
}

