package com.self.study_japanese.dao;

import com.self.study_japanese.pojo.Kana;
import com.self.study_japanese.pojo.KanaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KanaMapper {
    int countByExample(KanaExample example);

    int deleteByExample(KanaExample example);

    int deleteByPrimaryKey(Integer kid);

    int insert(Kana record);

    int insertSelective(Kana record);

    List<Kana> selectByExample(KanaExample example);

    Kana selectByPrimaryKey(Integer kid);

    int updateByExampleSelective(@Param("record") Kana record, @Param("example") KanaExample example);

    int updateByExample(@Param("record") Kana record, @Param("example") KanaExample example);

    int updateByPrimaryKeySelective(Kana record);

    int updateByPrimaryKey(Kana record);
}