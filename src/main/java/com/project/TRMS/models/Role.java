package com.project.TRMS.models;

import javax.persistence.*;
import java.util.Objects;
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="role_id")
    private int roleId;
    @Column(name = "role_name")
    private String name;

    public Role() {
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, roleId);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Role other = (Role) obj;
        return Objects.equals(name, other.name) && roleId == other.roleId;
    }

    @Override
    public String toString() {
        return "Role [roleId=" + roleId + ", name=" + name + "]";
    }
}
