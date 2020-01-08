package com.self.study_japanese.pojo;

import java.io.Serializable;

public class Kana implements Serializable {
    private Integer kid;

    private String kana;

    private String roman;

    private String katakana;

    private String tips;

    private static final long serialVersionUID = 1L;

    public Integer getKid() {
        return kid;
    }

    public void setKid(Integer kid) {
        this.kid = kid;
    }

    public String getKana() {
        return kana;
    }

    public void setKana(String kana) {
        this.kana = kana == null ? null : kana.trim();
    }

    public String getRoman() {
        return roman;
    }

    public void setRoman(String roman) {
        this.roman = roman == null ? null : roman.trim();
    }

    public String getKatakana() {
        return katakana;
    }

    public void setKatakana(String katakana) {
        this.katakana = katakana == null ? null : katakana.trim();
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips == null ? null : tips.trim();
    }

    @Override
    public String toString() {
        return "Kana{" +
                "kid=" + kid +
                ", kana='" + kana + '\'' +
                ", roman='" + roman + '\'' +
                ", katakana='" + katakana + '\'' +
                ", tips='" + tips + '\'' +
                '}';
    }
}