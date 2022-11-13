package com.project.TRMS.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="dept_id")
    private int deptId;
    @Column(name = "dept_name")
    private String name;
    @OneToOne
    @JoinColumn(name="dept_head_id")
    private Employee deptHead;


    public Department() {
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getDeptHead() {
        return deptHead;
    }

    public void setDeptHead(Employee deptHead) {
        this.deptHead = deptHead;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptId=" + deptId +
                ", name='" + name + '\'' +
                ", deptHead=" + deptHead +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return deptId == that.deptId && Objects.equals(name, that.name) && Objects.equals(deptHead, that.deptHead);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deptId, name, deptHead);
    }
}
