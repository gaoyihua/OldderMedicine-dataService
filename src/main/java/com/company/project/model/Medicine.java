package com.company.project.model;

import javax.persistence.*;

public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Integer num;

    private String dosage;

    private Integer remain;

    private Integer tag;

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
     * @return num
     */
    public Integer getNum() {
        return num;
    }

    /**
     * @param num
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * @return dosage
     */
    public String getDosage() {
        return dosage;
    }

    /**
     * @param dosage
     */
    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    /**
     * @return remain
     */
    public Integer getRemain() {
        return remain;
    }

    /**
     * @param remain
     */
    public void setRemain(Integer remain) {
        this.remain = remain;
    }

    /**
     * @return tag
     */
    public Integer getTag() {
        return tag;
    }

    /**
     * @param tag
     */
    public void setTag(Integer tag) {
        this.tag = tag;
    }
}