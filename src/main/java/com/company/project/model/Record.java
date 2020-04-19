package com.company.project.model;

import javax.persistence.*;

public class Record {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String alarm;

    @Column(name = "main_text")
    private String mainText;

    private String rate;

    @Column(name = "medicine_info")
    private String medicineInfo;

    private Integer tag;

    private Integer num;

    @Column(name = "text_date")
    private String textDate;

    @Column(name = "text_time")
    private String textTime;

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
     * @return alarm
     */
    public String getAlarm() {
        return alarm;
    }

    /**
     * @param alarm
     */
    public void setAlarm(String alarm) {
        this.alarm = alarm;
    }

    /**
     * @return main_text
     */
    public String getMainText() {
        return mainText;
    }

    /**
     * @param mainText
     */
    public void setMainText(String mainText) {
        this.mainText = mainText;
    }

    /**
     * @return rate
     */
    public String getRate() {
        return rate;
    }

    /**
     * @param rate
     */
    public void setRate(String rate) {
        this.rate = rate;
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
     * @return text_date
     */
    public String getTextDate() {
        return textDate;
    }

    /**
     * @param textDate
     */
    public void setTextDate(String textDate) {
        this.textDate = textDate;
    }

    /**
     * @return text_time
     */
    public String getTextTime() {
        return textTime;
    }

    /**
     * @param textTime
     */
    public void setTextTime(String textTime) {
        this.textTime = textTime;
    }
}