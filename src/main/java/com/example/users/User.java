package com.example.users;

import com.example.add.Address;

public class User {
    private String name;
    private String id;
    private Address address;

    public User() {
    }

    public User(String name, String id, Address address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * @return address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * 设置
     * @param address
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    public String toString() {
        return "User{name = " + name + ", id = " + id + ", address = " + address + "}";
    }
}
