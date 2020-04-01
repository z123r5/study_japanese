package com.self.study_japanese.controller;

import com.self.study_japanese.dto.KanaCardDTO;
import com.self.study_japanese.pojo.Kana;
import com.self.study_japanese.pojo.KanaExample;
import com.self.study_japanese.pojo.Memory;
import com.self.study_japanese.service.KanaService;
import com.self.study_japanese.service.MemoryService;
import com.self.study_japanese.utils.R;
import io.swagger.annotations.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("kana")
public class KanaController {

    @Autowired
    private KanaService kanaService;

    @Autowired
    private MemoryService memoryService;

    @RequestMapping("kanaSubmit")
    @ResponseBody
    public R kanaSubmit(KanaCardDTO kanaSubmit){
        Kana kanaByKID = kanaService.findKanaByKID(kanaSubmit.getKanaID());
        Map<String,Object> data = new HashMap<>();
        Memory memory = new Memory(kanaSubmit.getUserID(),new Date());
        if (kanaByKID.getRoman().equals(kanaSubmit.getJapanese())){
            memory.setCorrectKanaId(kanaSubmit.getKanaID());
            data.put("result",true);
        }else{
            memory.setMistakeKanaId(kanaSubmit.getKanaID());
            memory.setObfuscatedPronunciation(kanaSubmit.getJapanese());
            data.put("result",false);
        }
        memoryService.getUserCorrectRateByKID(kanaSubmit.getKanaID());
        memoryService.insertMemory(memory);


        return R.ok();
    }
}
