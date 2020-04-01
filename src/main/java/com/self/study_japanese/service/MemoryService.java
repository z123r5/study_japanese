package com.self.study_japanese.service;

import com.self.study_japanese.pojo.Memory;

public interface MemoryService {

    void insertMemory(Memory memory);

    void getUserCorrectRateByKID(Integer kanaID);
}
