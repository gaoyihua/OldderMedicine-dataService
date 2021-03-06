package com.company.project.model;

import javax.persistence.*;

@Table(name = "medicine_process")
public class MedicineProcess implements Comparable<MedicineProcess> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Long time;

    @Column(name = "medicine_info")
    private String medicineInfo;

    private String phone;

    @Column(name = "is_finish")
    private boolean isFinish;

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
     * @return time
     */
    public Long getTime() {
        return time;
    }

    /**
     * @param time
     */
    public void setTime(Long time) {
        this.time = time;
    }

    /**
     * @return medicine_info
     */
    public String getMedicineInfo() {
        return medicineInfo;
    }

    /**
     * @param medicineInfo
     */
    public void setMedicineInfo(String medicineInfo) {
        this.medicineInfo = medicineInfo;
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
     * @return is_finish
     */
    public boolean isIsFinish() {
        return isFinish;
    }

    /**
     * @param isFinish
     */
    public void setIsFinish(boolean isFinish) {
        this.isFinish = isFinish;
    }

    @Override
    public int compareTo(MedicineProcess o) {
        return (this.time - o.time) > 0 ? 1 : -1;
    }
}