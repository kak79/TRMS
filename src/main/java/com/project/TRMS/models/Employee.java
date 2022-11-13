package com.project.TRMS.models;

import com.project.TRMS.models.*;
import javax.persistence.*;

import java.util.Objects;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="emp_id")
    private int empId;
    private String firstName;
    private String lastName;
    private String username;
    @Column(name="passwd")
    private String password;
    @OneToMany
    @JoinTable(name="employee_roles",
       joinColumns = @JoinColumn(name = "emp_id"),
       inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Role role;
    private double funds;
    @OneToOne
    @JoinTable(name="employee_roles",
            joinColumns = @JoinColumn(name = "emp_id"),
            inverseJoinColumns = @JoinColumn(name = "supervisor_id"))
    private Employee supervisor;
    @ManyToMany
    @JoinTable(name="employee_roles",
            joinColumns = @JoinColumn(name = "emp_id"),
            inverseJoinColumns = @JoinColumn(name = "dept_id"))
    private Department department;

    public Employee() {
    }

    public Employee(int empId) {
        super();
        this.empId = empId;
    }



    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public double getFunds() {
        return funds;
    }

    public void setFunds(double funds) {
        if (funds<=0) this.funds = 0;
        else if (funds>=1000.0) this.funds=1000.0;
        else this.funds = funds;
    }

    public Employee getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Employee supervisor) {
        this.supervisor = supervisor;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public int hashCode() {
        return Objects.hash(department, empId, firstName, funds, lastName, password, role, supervisor, username);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        return Objects.equals(department, other.department) && empId == other.empId
                && Objects.equals(firstName, other.firstName)
                && Double.doubleToLongBits(funds) == Double.doubleToLongBits(other.funds)
                && Objects.equals(lastName, other.lastName) && Objects.equals(password, other.password)
                && Objects.equals(role, other.role) && Objects.equals(supervisor, other.supervisor)
                && Objects.equals(username, other.username);
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", username="
                + username + ", password=" + password + ", role=" + role + ", funds=" + funds + ", supervisor="
                + supervisor + ", department=" + department + "]";
    }


}
