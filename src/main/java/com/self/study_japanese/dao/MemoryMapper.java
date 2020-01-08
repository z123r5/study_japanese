package com.self.study_japanese.dao;

import com.self.study_japanese.dto.QueryScoreDTO;
import com.self.study_japanese.pojo.Memory;
import com.self.study_japanese.pojo.MemoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemoryMapper {
    int countByExample(MemoryExample example);

    int deleteByExample(MemoryExample example);

    int deleteByPrimaryKey(Integer memoryId);

    int insert(Memory record);

    int insertSelective(Memory record);

    List<Memory> selectByExample(MemoryExample example);

    Memory selectByPrimaryKey(Integer memoryId);

    int updateByExampleSelective(@Param("record") Memory record, @Param("example") MemoryExample example);

    int updateByExample(@Param("record") Memory record, @Param("example") MemoryExample example);

    int updateByPrimaryKeySelective(Memory record);

    int updateByPrimaryKey(Memory record);

    List<QueryScoreDTO> getScore(int uid);
}