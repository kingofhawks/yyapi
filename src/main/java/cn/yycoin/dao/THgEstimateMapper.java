package cn.yycoin.dao;

import cn.yycoin.entity.THgEstimate;
import cn.yycoin.entity.THgEstimateExample;
import java.util.List;

import cn.yycoin.entity.THgPay;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface THgEstimateMapper {
    long countByExample(THgEstimateExample example);

    int deleteByExample(THgEstimateExample example);

    int insert(THgEstimate record);

    int insertSelective(THgEstimate record);

    int addPay(THgPay pay);

    List<THgEstimate> selectByExample(THgEstimateExample example);

    int updateByExampleSelective(@Param("record") THgEstimate record, @Param("example") THgEstimateExample example);

    int updateByExample(@Param("record") THgEstimate record, @Param("example") THgEstimateExample example);
}