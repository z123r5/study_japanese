package com.self.study_japanese.dto;

public class KanaCardDTO {

    private Integer kanaID;
    private Integer userID;
    private String japanese;

    @Override
    public String toString() {
        return "KanaCardDTO{" +
                "kanaID=" + kanaID +
                ", userID=" + userID +
                ", japanese='" + japanese + '\'' +
                '}';
    }

    public KanaCardDTO() {
    }

    public Integer getKanaID() {
        return kanaID;
    }

    public void setKanaID(Integer kanaID) {
        this.kanaID = kanaID;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getJapanese() {
        return japanese;
    }

    public void setJapanese(String japanese) {
        this.japanese = japanese;
    }

}
