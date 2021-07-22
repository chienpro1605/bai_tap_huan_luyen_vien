package com.codegym.model;

import javax.persistence.*;

@Entity // đánh dấu đây là Entity => hibernate sẽ tạo bảng trong CSDL
@Table(name = "customers") // tên mặc định là customer => @table để cài đặt lại thuộc tính của 1 bảng vd: đổi tên thành customers
public class Customer {
    @Id // đánh dấu đây là thuộc tính id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // đánh dấu thuộc tính này tự tăng
    private Long id;
    private String firstName;
    private String lastName;
    @ManyToOne // đánh dấu mối quan hệ n-1
    @JoinColumn(name = "province_id") // đặt tên cho trường khoá ngoại là province_id
    private Province province;


    public Customer() {
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer(String firstName, String lastName, Province province) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.province = province;
    }

    @Override
    public String toString() {
        return String.format("Customer[id=%d, firstName='%s', lastName='%s']", id, firstName, lastName);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }
}