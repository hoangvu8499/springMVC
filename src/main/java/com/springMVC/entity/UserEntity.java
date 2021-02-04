package com.springMVC.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
public class UserEntity extends BaseEntity {

    @Column(name = "title")
    private String title;

    @Column(name = "username")
    private String userName;

    //  ColumnDefinition cấu hình kiểu dữ liệu cụ thể
    @Column(name = "password", columnDefinition = "TEXT")
    private String password;

    @Column(name = "fullname")
    private String fullName;

    @Column(name = "status")
    private Integer status;

    // Ngầm hiểu nó sẽ tạo 1 bảng user_role chứa 2 khóa userid và roleid tương ứng 2 bảng
    // ManyToMany khi bỏ vào 2 bảng thì sẽ 2 format khác nhau
    // Đang ở entity nào thì định nghĩa JoinColumn cho bảng đó trước.
    // Ví dụ đang ở bảng User thì joinColumns = @JoinColumn(name = "userid") trước
    @ManyToMany()
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "userid"),
                inverseJoinColumns = @JoinColumn(name = "roleid"))
    private List<RoleEntity> roles = new ArrayList<>();

    public List<RoleEntity> getRoles() {
        return roles;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
