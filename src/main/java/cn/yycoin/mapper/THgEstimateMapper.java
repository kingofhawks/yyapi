package cn.yycoin.mapper;

import cn.yycoin.entity.THgEstimate;
import cn.yycoin.entity.THgEstimateExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface THgEstimateMapper {
    long countByExample(THgEstimateExample example);

    int deleteByExample(THgEstimateExample example);

    int insert(THgEstimate record);

    int insertSelective(THgEstimate record);

    List<THgEstimate> selectByExample(THgEstimateExample example);

    int updateByExampleSelective(@Param("record") THgEstimate record, @Param("example") THgEstimateExample example);

    int updateByExample(@Param("record") THgEstimate record, @Param("example") THgEstimateExample example);






}