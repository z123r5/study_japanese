package com.self.study_japanese.service;

import com.self.study_japanese.pojo.Kana;

public interface KanaService {

    Kana findKanaByKID(int kid);

    Kana getKana();

}
