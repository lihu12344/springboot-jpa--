package com.example.demo.pojo;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "user")
public class UserMap {

    @Id
    private Integer id;

    private String name;
    private Integer age;

    @ManyToMany
    @JoinTable(name = "user_role_relation",joinColumns ={ @JoinColumn(name="user_id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id")})
    private List<Role> roleList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserMap)) return false;
        UserMap userMap = (UserMap) o;
        return Objects.equals(getId(), userMap.getId()) &&
                Objects.equals(getName(), userMap.getName()) &&
                Objects.equals(getAge(), userMap.getAge()) &&
                Objects.equals(getRoleList(), userMap.getRoleList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getAge(), getRoleList());
    }
}
