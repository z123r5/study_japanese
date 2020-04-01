package com.self.study_japanese.pojo;

import java.io.Serializable;
import java.util.Date;

public class Memory implements Serializable {
    private Integer memoryId;

    private Integer uid;

    private Date memoryDate;

    private Integer correctKanaId;

    private Integer mistakeKanaId;

    private String obfuscatedPronunciation;

    private static final long serialVersionUID = 1L;

    public Memory(Integer uid, Date memoryDate) {
        this.uid = uid;
        this.memoryDate = memoryDate;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "memoryId=" + memoryId +
                ", uid=" + uid +
                ", memoryDate=" + memoryDate +
                ", correctKanaId=" + correctKanaId +
                ", mistakeKanaId=" + mistakeKanaId +
                ", obfuscatedPronunciation='" + obfuscatedPronunciation + '\'' +
                '}';
    }

    public Integer getMemoryId() {
        return memoryId;
    }

    public void setMemoryId(Integer memoryId) {
        this.memoryId = memoryId;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Date getMemoryDate() {
        return memoryDate;
    }

    public void setMemoryDate(Date memoryDate) {
        this.memoryDate = memoryDate;
    }

    public Integer getCorrectKanaId() {
        return correctKanaId;
    }

    public void setCorrectKanaId(Integer correctKanaId) {
        this.correctKanaId = correctKanaId;
    }

    public Integer getMistakeKanaId() {
        return mistakeKanaId;
    }

    public void setMistakeKanaId(Integer mistakeKanaId) {
        this.mistakeKanaId = mistakeKanaId;
    }

    public String getObfuscatedPronunciation() {
        return obfuscatedPronunciation;
    }

    public void setObfuscatedPronunciation(String obfuscatedPronunciation) {
        this.obfuscatedPronunciation = obfuscatedPronunciation == null ? null : obfuscatedPronunciation.trim();
    }
}