package cn.yycoin.mapper;

import cn.yycoin.entity.THgPriceconfig;
import cn.yycoin.entity.THgPriceconfigExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface THgPriceconfigMapper {
    long countByExample(THgPriceconfigExample example);

    int deleteByExample(THgPriceconfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(THgPriceconfig record);

    int insertSelective(THgPriceconfig record);

    List<THgPriceconfig> selectByExample(THgPriceconfigExample example);

    THgPriceconfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") THgPriceconfig record, @Param("example") THgPriceconfigExample example);

    int updateByExample(@Param("record") THgPriceconfig record, @Param("example") THgPriceconfigExample example);

    int updateByPrimaryKeySelective(THgPriceconfig record);

    int updateByPrimaryKey(THgPriceconfig record);

    //商品查询列表
    List<String> findTHg();

    //根据商品名查询年份列表
    List<String> findYear(String Cate);
}