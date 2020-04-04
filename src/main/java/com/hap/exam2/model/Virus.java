package com.hap.exam2.model;
import javax.persistence.*;

@Entity
@Table(name = "virus")

public class Virus {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "virusname")
    private String virusName;
    @Column(name = "virusdesc")
    private String virusDesc;
    @Column(name = "symptoms")
    private String symptoms;
    @Column(name = "duration")
    private String duration;
    @Column(name = "mortrate")
    private String mortRate;
    @Column(name = "virusimg")
    private String virusImg;

    public Virus()
    {}

    public Virus(String id, String virusName, String virusDesc, String symptoms, String duration, String mortRate, String virusImg)
    {
        this.id = id;
        this.virusName = virusName;
        this.virusDesc = virusDesc;
        this.symptoms = symptoms;
        this.duration = duration;
        this.mortRate = mortRate;
        this.virusImg = virusImg;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVirusName() {
        return virusName;
    }

    public void setVirusName(String virusName) {
        this.virusName = virusName;
    }

    public String getVirusDesc() {
        return virusDesc;
    }

    public void setVirusDesc(String virusDesc) {
        this.virusDesc = virusDesc;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getMortRate() {
        return mortRate;
    }

    public void setMortRate(String mortRate) {
        this.mortRate = mortRate;
    }

    public String getVirusImg() {
        return virusImg;
    }

    public void setVirusImg(String virusImg) {
        this.virusImg = virusImg;
    }

}
