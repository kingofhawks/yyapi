package cn.yycoin.service;


import cn.yycoin.entity.THgPriceconfig;
import java.util.List;

/**
 * @author SunQi
 * @Description:
 * @date Create in 2017/10/16 15:52
 */

public interface THgService {

    //商品查询列表
    public List<String> findTHgList() throws Exception;

    //根据商品名查询年份列表
    public List<String> findYearList(String cate) throws Exception;

    //根据(商品名+年份)查询standard列表
    public List<String> findStandardList(String cate,String year) throws Exception;

    //根据(商品名+年份+standard)查询condition
    public List<String> findConditionList(String cate,String year,String standard) throws Exception;

    //根据(商品名+年份+standard+condition)查询packaged
    public List<String> findPackagedList(THgPriceconfig tHg) throws Exception;

    //根据(商品名+年份+standard+condition+packaged)查询certificate
    public List<String> findCertificateList(THgPriceconfig tHg) throws Exception;

    //根据6个字段查询价格
    public String findPrice(THgPriceconfig tHg) throws Exception;

}
