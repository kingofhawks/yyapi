package cn.yycoin.dao;

import cn.yycoin.entity.THgPriceconfig;
import cn.yycoin.entity.THgPriceconfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

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
    List<String> findYear(String cate);

    //根据(商品名+年份)Standard
    List<String> findStandard(@Param("cate") String cate ,@Param("year") String year);

    //根据(商品名+年份+standard)查询condition
    List<String> findCondition(@Param("cate") String cate ,@Param("year") String year,@Param("standard") String standard);

    //根据(商品名+年份+standard+condition)查询packaged
    List<String> findPackaged(THgPriceconfig tHg);

    //根据(商品名+年份+standard+condition+packaged)查询certificate
    List<String> findCertificate(THgPriceconfig tHg);

    //根据6个字段查询价格
    String findPrice(THgPriceconfig tHg);
}
