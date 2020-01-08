package com.self.study_japanese.service.impl;

import com.self.study_japanese.dao.KanaMapper;
import com.self.study_japanese.dao.MemoryMapper;
import com.self.study_japanese.dto.QueryScoreDTO;
import com.self.study_japanese.pojo.Kana;
import com.self.study_japanese.pojo.KanaExample;
import com.self.study_japanese.service.KanaService;
import com.self.study_japanese.utils.ShiroUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class KanaServiceImpl implements KanaService {

    @Autowired
    private KanaMapper kanaMapper;

    @Autowired
    private MemoryMapper memoryMapper;

    private final String MISTAKE_TIME = "MistakeTime";

    private final String MISTAKE_KANA_LIST = "MistakeKanaList";

    private final int KANA_NUMBER = 107;

    @Override
    public Kana getKana() {
        //查出分数表
        List<QueryScoreDTO> kanaMemory = memoryMapper.getScore((int) ShiroUtils.getUserId());
        //如果存在分数表则从分数表中筛选
        if (kanaMemory!=null && !"".equals(kanaMemory)){
            //将数据进行初始化
            Map<String,Object> MemoryData = dataInit(kanaMemory);
            //这里使用的随机算法
            Random random = new Random();
            int randTime = random.nextInt(KANA_NUMBER+(int) MemoryData.get(MISTAKE_TIME))+1;
            if (randTime > KANA_NUMBER){
                List queryScoreDTOS = (List) MemoryData.get(MISTAKE_KANA_LIST);
                Iterator iterator = queryScoreDTOS.iterator();
                randTime = randTime-KANA_NUMBER;
                while (iterator.hasNext()){
                    QueryScoreDTO queryScoreDTO = (QueryScoreDTO) iterator.next();
                    randTime = randTime - queryScoreDTO.getMistakeTime();
                    if ( randTime <= 0){
                        return kanaMapper.selectByPrimaryKey(queryScoreDTO.getMistakeKanaId());
                    }
                }
            }
        }
        return kanaMapper.selectByPrimaryKey(new Random().nextInt(KANA_NUMBER)+1);
    }

    private Map<String,Object> dataInit(List<QueryScoreDTO> kanaMemory) {
        Iterator<QueryScoreDTO> iterator = kanaMemory.iterator();
        int mistakeTime = 0;
        List<QueryScoreDTO> mistakeList = new ArrayList<>();
        while (iterator.hasNext()){
            QueryScoreDTO queryScoreDTO = iterator.next();
            if (null!=queryScoreDTO.getCorrectTime() && !"".equals(queryScoreDTO.getCorrectTime()) && queryScoreDTO.getMistakeTime()>queryScoreDTO.getCorrectTime()){
                mistakeTime += queryScoreDTO.getMistakeTime()-queryScoreDTO.getCorrectTime();
                mistakeList.add(queryScoreDTO);
            }
        }
        Map<String,Object> memoryData = new HashMap<>();
        memoryData.put(MISTAKE_TIME,mistakeTime);
        memoryData.put(MISTAKE_KANA_LIST,mistakeList);
        return memoryData;
    }


}
