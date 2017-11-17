package cn.yycoin.controller;

import cn.yycoin.entity.THgPriceconfig;
import cn.yycoin.service.THgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

import static cn.yycoin.until.MD5.md5;


/**
 * @author SunQi
 * @Description: 回购商品信息
 * @date Create in 2017/10/16 15:48
 */
@Controller
@RequestMapping("thg")
public class THgController {

    //注入Service
    @Autowired
    private THgService tHgService;

    //查询商品名
    @RequestMapping(value = "queryCate",method = RequestMethod.GET)
    public @ResponseBody List<String>  responseJson(@RequestParam("token") String token) throws Exception{

        if(!token.equals(md5("token"))){
            List<String> b = new ArrayList<String>();
            b.add("205");
            return b;
        }

        //调用Service接口查询商品名
        List<String> tHgList = tHgService.findTHgList();
        return  tHgList;
    }

    //根据商品名查询年份列表
    @RequestMapping(value = "queryYear",method = RequestMethod.GET)
    public @ResponseBody List<String> queryYear(@RequestParam("cate") String cate,
                                                @RequestParam("token") String token) throws Exception{

        if(!token.equals(md5(cate))){
            List<String> b = new ArrayList<String>();
            b.add("205");
            return b;
        }


        //调用Service接口查询年份
        List<String> yearList = tHgService.findYearList(cate);
        return yearList;
    }

    //根据(商品名+年份)查询standard
    @RequestMapping(value = "queryStandard",method = RequestMethod.GET)
    public @ResponseBody List<String> queryStandard(@RequestParam("cate") String cate,
                                                    @RequestParam("year") String year,
                                                    @RequestParam("token") String token)throws Exception{
        if(!token.equals(md5(cate))){
            List<String> b = new ArrayList<String>();
            b.add("205");
            return b;
        }


        //调用Service接口查询standard
        List<String> standardList = tHgService.findStandardList(cate,year);
        return standardList;
    }

    //根据(商品名+年份+standard)查询condition
    @RequestMapping(value ="queryCondition",method = RequestMethod.GET)
    public @ResponseBody List<String> queryCondition(@RequestParam("cate") String cate,
                                                     @RequestParam("year") String year,
                                                    @RequestParam("standard") String standard,
                                                     @RequestParam("token") String token)throws Exception{

        if(!token.equals(md5(cate))){
            List<String> b = new ArrayList<String>();
            b.add("205");
            return b;
        }


        //调用Service接口查询condition
        List<String> conditionList = tHgService.findConditionList(cate,year,standard);
        return conditionList;
    }

    //根据(商品名+年份+standard+condition)查询packaged
    @RequestMapping(value ="queryPackaged",method = RequestMethod.POST)
    public @ResponseBody List<String> queryPackaged(@RequestParam("cate") String cate,
                                                    @RequestParam("year") Integer year,
                                                    @RequestParam("standard") String standard,
                                                    @RequestParam("condition") String condition,
                                                    @RequestParam("token") String token)throws Exception{

        if(!token.equals(md5(cate))){
            List<String> b = new ArrayList<String>();
            b.add("205");
            return b;
        }


        THgPriceconfig tHg = new THgPriceconfig();
        tHg.setCategory(cate);
        tHg.setYear(year);
        tHg.setStandard(standard);
        tHg.setCondition(condition);
        //调用Service接口查询condition
        List<String> packagedList = tHgService.findPackagedList(tHg);
        return packagedList;
    }

    //根据(商品名+年份+standard+condition+packaged)查询certificate
    @RequestMapping(value ="queryCertificate",method = RequestMethod.POST)
    public @ResponseBody List<String> queryCertificate(@RequestParam("cate") String cate,
                                                       @RequestParam("year") Integer year,
                                                       @RequestParam("standard") String standard,
                                                       @RequestParam("condition") String condition,
                                                       @RequestParam("packaged") String packaged,
                                                       @RequestParam("token") String token)throws Exception{

        if(!token.equals(md5(cate))){
            List<String> b = new ArrayList<String>();
            b.add("205");
            return b;
        }


        THgPriceconfig tHg = new THgPriceconfig();
        tHg.setCategory(cate);
        tHg.setYear(year);
        tHg.setStandard(standard);
        tHg.setCondition(condition);
        tHg.setPackaged(packaged);
        //调用Service接口查询condition
        List<String> certificateList = tHgService.findCertificateList(tHg);
        return certificateList;
    }

    //根据6个字段查询价格
    @RequestMapping(value="queryPrice",method = RequestMethod.POST)
    public @ResponseBody String  queryPrice(@RequestParam("cate") String cate,
                                            @RequestParam("year") Integer year,
                                            @RequestParam("standard") String standard,
                                            @RequestParam("condition") String condition,
                                            @RequestParam("packaged") String packaged,
                                            @RequestParam("certificate") String certificate,
                                            @RequestParam("token") String token)throws Exception{

        if(!token.equals(md5(cate))){

            return "205";
        }

        if(cate == null || cate.trim().length() == 0 || cate.trim().isEmpty()){
            return "0";
        }else if(year == null){
            return "1";
        }else if(standard == null || standard.trim().length() == 0 || standard.trim().isEmpty()){
            return "2";
        }else if(condition == null || condition.trim().length() == 0 || condition.trim().isEmpty()){
            return "3";
        }else if(packaged == null || packaged.trim().length() == 0 || packaged.trim().isEmpty()){
            return "4";
        }else if(certificate == null || certificate.trim().length() == 0 || certificate.trim().isEmpty()){
            return "5";
        }else {
            THgPriceconfig tHg = new THgPriceconfig();
            tHg.setCategory(cate);
            tHg.setYear(year);
            tHg.setStandard(standard);
            tHg.setCondition(condition);
            tHg.setPackaged(packaged);
            tHg.setCertificate(certificate);

            //调用Service查询price
            String price = tHgService.findPrice(tHg);
            return price;
        }


    }


}

