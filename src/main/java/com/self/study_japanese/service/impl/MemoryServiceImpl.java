package com.self.study_japanese.service.impl;

import com.self.study_japanese.dao.MemoryMapper;
import com.self.study_japanese.pojo.Memory;
import com.self.study_japanese.pojo.MemoryExample;
import com.self.study_japanese.service.MemoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemoryServiceImpl implements MemoryService {

    @Autowired
    private MemoryMapper memoryMapper;

    @Override
    public void insertMemory(Memory memory) {
        memoryMapper.insert(memory);
    }

    @Override
    public void getUserCorrectRateByKID(Integer kanaID) {

    }
}
