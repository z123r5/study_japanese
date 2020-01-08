package com.self.study_japanese;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.self.study_japanese.dao")
public class StudyJapaneseApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyJapaneseApplication.class, args);
    }

}
