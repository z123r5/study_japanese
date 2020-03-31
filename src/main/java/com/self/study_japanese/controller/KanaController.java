package com.self.study_japanese.controller;

import com.self.study_japanese.dto.KanaCardDTO;
import com.self.study_japanese.pojo.Kana;
import com.self.study_japanese.service.KanaService;
import com.self.study_japanese.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("kana")
public class KanaController {

    @Autowired
    private KanaService kanaService;

    @RequestMapping("kanaSubmit")
    public R kanaSubmit(KanaCardDTO kanaSubmit){
        System.out.println(kanaSubmit);
        return R.ok();
    }
}
