package com.company.project.model;

import javax.persistence.*;

@Table(name = "om_user")
public class OmUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Integer sex;

    private String phone;

    private String password;

    @Column(name = "emergency_phone")
    private String emergencyPhone;

    @Column(name = "emergency_people")
    private String emergencyPeople;

    private String description;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return sex
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return emergency_phone
     */
    public String getEmergencyPhone() {
        return emergencyPhone;
    }

    /**
     * @param emergencyPhone
     */
    public void setEmergencyPhone(String emergencyPhone) {
        this.emergencyPhone = emergencyPhone;
    }

    /**
     * @return emergency_people
     */
    public String getEmergencyPeople() {
        return emergencyPeople;
    }

    /**
     * @param emergencyPeople
     */
    public void setEmergencyPeople(String emergencyPeople) {
        this.emergencyPeople = emergencyPeople;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}