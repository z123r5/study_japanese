package com.self.study_japanese.dto;

public class QueryScoreDTO {

    private Integer mistakeKanaId;
    private Integer mistakeTime;
    private Integer correctTime;

    @Override
    public String toString() {
        return "QueryScoreDTO{" +
                "mistakeKanaId=" + mistakeKanaId +
                ", mistakeTime=" + mistakeTime +
                ", correctTime=" + correctTime +
                '}';
    }

    public Integer getMistakeKanaId() {
        return mistakeKanaId;
    }

    public void setMistakeKanaId(Integer mistakeKanaId) {
        this.mistakeKanaId = mistakeKanaId;
    }

    public Integer getMistakeTime() {
        return mistakeTime;
    }

    public void setMistakeTime(Integer mistakeTime) {
        this.mistakeTime = mistakeTime;
    }

    public Integer getCorrectTime() {
        return correctTime;
    }

    public void setCorrectTime(Integer correctTime) {
        this.correctTime = correctTime;
    }
}
