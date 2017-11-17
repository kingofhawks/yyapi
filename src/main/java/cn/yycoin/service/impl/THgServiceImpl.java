package cn.yycoin.service.impl;

import cn.yycoin.dao.THgPriceconfigMapper;
import cn.yycoin.entity.THgPriceconfig;
import cn.yycoin.service.THgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author SunQi
 * @Description: 回购商品查询接口
 * @date Create in 2017/10/16 15:52
 */
@Service
public class THgServiceImpl implements THgService{

    @Autowired
    private THgPriceconfigMapper tHgPriceconfigMapper;

    //商品查询列表
    @Override
    public List<String> findTHgList() throws Exception {
        return tHgPriceconfigMapper.findTHg();
    }

    //根据商品名查询年份列表
    @Override
    public List<String> findYearList(String cate) throws Exception {
        return tHgPriceconfigMapper.findYear(cate);
    }


    //根据(+商品名)年份查询standard列表
    @Override
    public List<String> findStandardList(String cate,String year) throws Exception {
        return tHgPriceconfigMapper.findStandard(cate,year);
    }

    //根据(商品名+年份+standard)查询condition
    @Override
    public List<String> findConditionList(String cate,String year,String standard) throws Exception {
        return tHgPriceconfigMapper.findCondition(cate,year,standard);
    }

    //根据(商品名+年份+standard+condition)查询packaged
    @Override
    public List<String> findPackagedList(THgPriceconfig tHg) throws Exception {
        return tHgPriceconfigMapper.findPackaged(tHg);
    }

    //根据(商品名+年份+standard+condition+packaged)查询certificate
    @Override
    public List<String> findCertificateList(THgPriceconfig tHg) throws Exception {
        return tHgPriceconfigMapper.findCertificate(tHg);
    }

    //根据6个字段查询价格
    @Override
    public String findPrice(THgPriceconfig tHg) throws Exception {
        return tHgPriceconfigMapper.findPrice(tHg);
    }


}
